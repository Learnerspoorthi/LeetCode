class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int count=5;
        for(int y=1971;y<year;y++){
            count+=isleap(y)?366:365;
        }
        int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
        for (int m=0;m<month-1;m++){
            count+=months[m];
        }
        if(month>2&&isleap(year)){
            count+=1;
        }
        count+=(day-1);
        return days[count%7];
    }
    private boolean isleap(int year){
        return (year%4==0&&year%100!=0)||(year%400==0);
    }
}