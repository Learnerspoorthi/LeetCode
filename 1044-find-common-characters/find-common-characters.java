class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result=new ArrayList<>();
        String first=words[0];
        for(char c:first.toCharArray())
        {
            boolean isCommon=true;
            for(int i=1;i<words.length;i++){
                if(!words[i].contains(String.valueOf(c)))
                {
                    isCommon=false;
                    break;
                }
                }
                if(isCommon){
                    result.add(String.valueOf(c));
                    for(int i=0;i<words.length;i++){
                        words[i]=words[i].replaceFirst(String.valueOf(c),"");
                    }
                }
            }
             return result;
        }
       
    }
