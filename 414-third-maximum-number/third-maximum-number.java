class Solution {
    public int thirdMax(int[] nums) {
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
int count=0;
        for(int num:nums)
        {
           if ((count >= 1 && num == first) ||(count >= 2 && num == second) ||(count >= 3 && num == third)) {
                continue;
            }
            count++;
            if(num>first){
                third=second;
                second=first;
                first=num;
            }
            else if(num>second){
                third=second;
                second=num;
            }
            else if(num>third){
                third=num;
               
            }
            
        }
        return count>=3?third:first;
    }
}