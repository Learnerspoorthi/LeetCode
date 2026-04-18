class Solution {
    public static HashMap<Character,Integer> counter(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            
        }
        return map;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
     return (counter(s).equals(counter(t)));
        
    }
}