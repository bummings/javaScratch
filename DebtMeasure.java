import java.util.Scanner;

public class DebtMeasure {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scnr = new Scanner(System.in);

        // Prompt for and read totalDebt and totalAssets
        System.out.print("Enter total debt: ");
        double totalDebt = scnr.nextDouble();

        System.out.print("Enter total assets: ");
        double totalAssets = scnr.nextDouble();

        // Create an instance of the Debt class
        Debt debt = new Debt();

        // Calculate the debt ratio
        debt.calculateDR(totalDebt, totalAssets);

        // TEST
        debt.getDR();

        // Get the debt ratio
        double debtRatio = debt.getDR();

        // Output the result
        System.out.printf("The Company's total debt is in the amount of $%.2f, and total assets are in the amount of $%.2f, which gives a debt ratio of %.2f.%n", totalDebt, totalAssets, debtRatio);
        
        scnr.close();
    }
}