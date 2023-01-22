public class Time{
    public static void main(String[] args){
        
        //Create variables named hour, minute and seocnd. Assign values that are roiughly the current time. Use 24-hour clock.
        int hour;
        int minute;
        int second;
        
        hour = 12;
        minute = 02;
        second = 00;
        
        int secondsRemaining = (23-hour)*3600 + (59-minute)*60 + (59-second);
        System.out.print("Number of seconds remaining of actual day since midnight: ");
        System.out.println(secondsRemaining);
        
        //Another solution. 
        //1.- Get the total seconds of one day (There are 23 hours, 59 minutes and 59 seconds before a new day)
        int secondsDay = 23*3600+59*60+59;
        //2.-Get the total seconds passed until now
        int hour2 = hour*60*60;
        int minutes2 = minute*60;
        int seconds2 = 00;
        //3.-Substract the total seconds of this day to the remaining.
        int secondsRemaining2 = secondsDay-(hour2+minutes2+seconds2);
        System.out.print("Number of seconds remaining of actual day since midnight: ");
        System.out.println(secondsRemaining2);
        
        //Calculate and display the percentage of the day that has passed. 

        
        double percentage = secondsRemaining*100.0/secondsDay;
        System.out.print("Percentage of number of seconds that has passed of actual day since midnight: ");
        System.out.println(percentage);
        
        //Change the values of hour minute and seconds to reflect the current time. Then write code to compute the elapsed time 
        //since you started to working on this exercise
        
        int tempHour= 12;
        int tempMinute = 30;
        int tempseconds = 00;
        
        System.out.print("Time elpased ");
        System.out.println((tempHour-hour) + ":" + (tempMinute-minute) + ":" + (tempseconds-second));
        
    }
}
