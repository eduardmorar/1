import java.util.Locale;
import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String[] weekend = {"saturday","sunday"};
        String[] weekday = {"monday", "tuesday","wednesday","thursday","friday"};
        String day = input.next();
        boolean exists = false;
        for(int i=0; i<weekday.length;i++){
            if(day.toLowerCase().equals(weekday[i]))
                exists = true;
        }


        if(day.toLowerCase().equals("saturday") || day.toLowerCase().equals("sunday")){
            System.out.println("weekend");
        }else if(exists){
            System.out.println("weekday");
        }else{
            System.out.println("not a day of the week");
        }
    }
}
