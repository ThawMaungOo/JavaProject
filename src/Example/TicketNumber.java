package Example;

import java.util.Scanner;

public class TicketNumber
{
    private String ticket;
    private void addtTicketNumber()
    {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        do {
            System.out.println("Enter ticket number from 10 to 12 number long: ");
            ticket = sc.next();
            if (ticket.length() >= 10 && ticket.length() <= 12)
            {
                System.out.println("Ticket Number is valid");
                flag = true;
            }
            else if (ticket.length() == 9)
            {
                int ticketno = Integer.parseInt(ticket);
                int remainder = ticketno % 7;
                ticket = ticket.concat(String.valueOf(remainder));
                System.out.println("The last digit dropes is " + remainder);
                System.out.println("Updated final ticket no is " + ticket);
                flag = true;
            }
            else
            {
                System.out.println("Invalid Ticket Number, Try again");
            }
        }while(!flag);
    }

    public static void main(String[] args)
    {
        TicketNumber ticket = new TicketNumber();
        ticket.addtTicketNumber();
    }
}
