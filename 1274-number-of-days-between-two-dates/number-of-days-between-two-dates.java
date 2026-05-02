class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(getDays(date1)-getDays(date2));
    }
    private int getDays(String date){
        String[] parts=date.split("-");
        int year=Integer.parseInt(parts[0]);
        int month=Integer.parseInt(parts[1]);
        int day=Integer.parseInt(parts[2]);
        int total=0;
        for(int y=1971;y<year;y++){
            if(isleap(y)){
                total+=366;}
                else{
                    total+=365;
                }
            }
            int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
            for(int m=0;m<month-1;m++){
                total+=months[m];

            }
            if(month>2&&isleap(year)){
                total+=1;
            }
            total+=day;
            return total;
        }
         private boolean isleap(int year){
        return(year%4==0&&year%100!=0)||(year%400==0);
    }
    }
   
