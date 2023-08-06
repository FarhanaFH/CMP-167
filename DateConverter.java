import java.time.YearMonth;
import java.util.Scanner;
import static java.lang.System.exit;

public class DateConverter {
  public static void main(String[] args) {
    int numForDay, numForMnth, numForDateOfMonth, numForYear;
    String nameForDay, nameForMnth;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 4 integers representing dayNumber monthNumber date year: ");
    numForDay = input.nextInt();

    if (!(numForDay > 0 && numForDay <= 7)) {
      System.out.println("Invalid day number: " + numForDay + ", please enter a number from 1..7");
      exit(1);
    }

    numForMnth = input.nextInt();
    if (!(numForMnth > 0 && numForMnth <= 12)) {
      System.out.println("Invalid month number: " + numForMnth + ", please enter a number from 1..12");
      exit(1);
    }

    numForDateOfMonth = input.nextInt();
    if (!(numForDateOfMonth > 0 && numForDateOfMonth <= 31)) {
      System.out.println("Invalid date number: " + numForDateOfMonth + ", please enter a number from 1..31");
      exit(1);
    }

    numForYear = input.nextInt();

    if (numForDay == 1) {
      nameForDay = "Sunday";
    } else if (numForDay == 2) {
      nameForDay = "Monday";
    } else if (numForDay == 3) {
      nameForDay = "Tuesday";
    } else if (numForDay == 4) {
      nameForDay = "Wednesday";
    } else if (numForDay == 5) {
      nameForDay = "Thursday";
    } else if (numForDay == 6) {
      nameForDay = "Friday";
    } else {
      nameForDay = "Saturday";
    }

    if (numForMnth == 1) {
      nameForMnth = "January";
    } else if (numForMnth == 2) {
      nameForMnth = "February";
    } else if (numForMnth == 3) {
      nameForMnth = "March";
    } else if (numForMnth == 4) {
      nameForMnth = "April";
    } else if (numForMnth == 5) {
      nameForMnth = "May";
    } else if (numForMnth == 6) {
      nameForMnth = "June";
    } else if (numForMnth == 7) {
      nameForMnth = "July";
    } else if (numForMnth == 8) {
      nameForMnth = "August";
    } else if (numForMnth == 9) {
      nameForMnth = "September";
    } else if (numForMnth == 10) {
      nameForMnth = "October";
    } else if (numForMnth == 11) {
      nameForMnth = "November";
    } else {
      nameForMnth = "December";
    }

    if (!(((numForYear % 4 == 0) && (numForYear % 100 != 0)) || (numForYear % 400 == 0))) {
      if (numForMnth == 2 && numForDateOfMonth == 29) {
        System.out.println("Invalid date :" + numForYear + " , is not a leap year " + nameForMnth + " does not have " + numForDateOfMonth + " days, please enter a valid date.");
        exit(1);
      }
    }

    YearMonth yearMonthObject = YearMonth.of(numForYear, numForMnth);
    if (numForDateOfMonth > yearMonthObject.lengthOfMonth()) {
      System.out.println("Invalid date :" + nameForMnth + " , does not have " + numForDateOfMonth + " days, please enter a valid date.");
      exit(1);
    }

    System.out.println(numForDay + " " + numForMnth + " " + numForDateOfMonth + " " + numForYear + " is " + nameForDay + " " + nameForMnth + " " + numForDateOfMonth + ", " + numForYear);

    input.close();  
  }
}