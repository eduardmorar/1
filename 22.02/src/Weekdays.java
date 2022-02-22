import java.util.Locale;
import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String[] weekend = {"saturday","sunday"}
        //String[] weekday = {"monday", "tuesday","wednesday","thursday","friday"}
        String day = input.next();

        if(day.toLowerCase().equals("saturday") || day.toLowerCase().equals("sunday")){
            System.out.println("weekend");
        }else {
            System.out.println("weekday");
        }
    }
}
