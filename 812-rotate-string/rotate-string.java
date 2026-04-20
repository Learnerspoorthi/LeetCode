class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String joined=s+s;
        if(joined.contains(goal)){
        return true;
    }
    return false;
    }
    
}