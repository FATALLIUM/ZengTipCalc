import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        // variables needed
        double dishCost = 0;
        double totalBill = 0;
        double finalBill;
        double costPerPerson;
        double tipPerPerson;

        System.out.println("Welcome.");

        System.out.println("How many people are in your group at the restaurant?: ");
        int numPeople = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter tip percentage (0 - 100): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        System.out.println("Type in -1 when you are finished with entering the costs.");

        // getting the costs
        while (dishCost != -1) {
            System.out.println("Enter the various costs (in dollars and cents) of each dish you have ordered: ");
            dishCost = scan.nextDouble();
            totalBill += dishCost;
        }

        // to undo the -1 that's added to totalBill
        totalBill +=1;

        // the m a t h
        double totalTip = totalBill * ((double) tipPercentage /100);
        finalBill = totalTip + totalBill;
        costPerPerson = totalBill / numPeople;
        tipPerPerson = totalTip / numPeople;

        // rounding the money
        String formattedTotalBill = formatter.format(totalBill);
        String formattedTotalTip = formatter.format(totalTip);
        String formattedFinalBill = formatter.format(finalBill);
        String formattedCostPerPerson = formatter.format(costPerPerson);
        String formattedTipPerPerson = formatter.format(tipPerPerson);

        // printing information
        System.out.println("Your total bill before tip is: " + formattedTotalBill + ".") ;
        System.out.println("Your tip percentage is: " + tipPercentage + ".");
        System.out.println("Your total tip is: " + formattedTotalTip + ".");
        System.out.println("Your total bill with tip is: " + formattedFinalBill + ".");
        System.out.println("Per person cost before tip: " + formattedCostPerPerson + ".");
        System.out.println("Tip per person: " + formattedTipPerPerson + "." );
        System.out.println(" ");
        System.out.println("Thanks for using (pie is god) tip calculator.");
    }
}
