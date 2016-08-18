/**
 * Created by harshita on 18/8/16.
 */

import java.util.Scanner;

/**
 * Created by harshita on 14/8/16.
 */
public class LoanPayment {

    private static int numberOfMonths;
    private static float loanAmount;
    private static float annualRateOfInterest;
    private static float monthlyPayment;


    public static final Scanner CONSOLE = new Scanner(System.in);

    public static void acceptData()
    {
        System.out.println("Enter the loan amount: ");
        loanAmount=CONSOLE.nextFloat();
        System.out.println("Enter the monthly payment: ");
        monthlyPayment=CONSOLE.nextFloat();
        System.out.println("Enter the annual rate of interest: ");
        annualRateOfInterest=CONSOLE.nextFloat();
        System.out.println("Enter the number of months:");
        numberOfMonths=CONSOLE.nextInt();

    }

    public static void printBasicTable()
    {
        System.out.println("Month\tBalance");
        for(int i=1;i<=numberOfMonths;i++)
        {
            // double loan1=loanAmount;
            // double x=loanAmount-monthlyPayment;
            loanAmount=(((annualRateOfInterest/100)*loanAmount/12)+(loanAmount-monthlyPayment));

            System.out.println(i+"\t\t"+loanAmount);
        }
    }

    public static void printDetailedTable()
    {
        System.out.println("Month\tBalance\t\tPayment\tRemaining");
        for (int i=1;i<=numberOfMonths;i++)
        {
            //double loan2=loanAmount;
            loanAmount=(((annualRateOfInterest/100)*loanAmount)/12)+(loanAmount-monthlyPayment);
            System.out.println(i+"\t\t"+(loanAmount+monthlyPayment)+"\t\t"+monthlyPayment+"\t\t"+(loanAmount));

        }

    }

    public static void main(String args[]) {

        System.out.println("Project 3 created by Harshita");


        acceptData();
        printBasicTable();
        acceptData();
        printDetailedTable();



    }


}

