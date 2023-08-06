import java.util.Scanner;

class Copenhagen_Transit {
    public static void main(String[] args) {
        Double fare=0.0;
        Scanner Input=new Scanner(System.in);
        System.out.print("Enter zone number : ");
        int Zone_Number=Input.nextInt();
        System.out.print("Enter adult or child : ");
        String Ticket_Type=Input.next();
        if(Zone_Number<=2)
        {
            if(Ticket_Type == "adult")
            {
                fare=23.0;
            }
            if(Ticket_Type == "child")
            {
                fare=11.5;
            }
        }
        if(Zone_Number==3)
        {
            if(Ticket_Type == "adult")
            {
                fare = 34.5;
            }    
        }
        if(Zone_Number==3||Zone_Number==4)
        {
            if(Ticket_Type=="child")
            {
                fare=23.0;
            }
        }
        if(Zone_Number==4)
        {
            if(Ticket_Type=="adult")
            {
                fare=46.0;
            }
        }
        if(Zone_Number>4)
        {
            fare=-1.00;
        }
        System.out.println("The fare for " + "\033[4;37m" + Ticket_Type +"\033[0m" + " to zone number "+ "\033[4;37m" + Zone_Number +"\033[0m" + " is "+"$"+"\033[4;37m" + fare +"\033[0m");
    }
}