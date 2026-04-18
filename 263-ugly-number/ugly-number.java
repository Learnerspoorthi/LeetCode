class Solution {
    public boolean isUgly(int n) {
        if(n<=0)return false;
        // while(n%2==0)n/=2;
        // while(n%3==0)n/=3;
        // while(n%5==0)n/=5;
        // return n==1;
        int[] factors={2,3,5};
        for(int f:factors){
            while(n%f==0)n/=f;
        }
        return n==1;
    }
    
}