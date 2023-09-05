import java.time.YearMonth;

class Solution {
    public int dayOfYear(String date) {
        
        String[] splittedDate = date.split("-");
        
        int year = Integer.valueOf(splittedDate[0]);
        int month = Integer.valueOf(splittedDate[1]);
        int day = Integer.valueOf(splittedDate[2]);
        
        int sumOfDays = 0;
        
        for(int i = 1 ; i < month ; i ++){
            int numberOfDaysInMonth = getNumberOfDaysInMonth(year, i);
            sumOfDays += numberOfDaysInMonth;
        }
        
        return sumOfDays+day;
    }
    
    public static int getNumberOfDaysInMonth(int year,int month)
    {
        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        return daysInMonth;
    }
}