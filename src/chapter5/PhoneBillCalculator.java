package chapter5;
import java.util.Scanner;

public class PhoneBillCalculator {

    public static void main(String[] args) {

        //Allow the user to input the plan fee and overage minutes:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base cost of the plan (plan fee):");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        int overageMinutes = scanner.nextInt();

        scanner.close();

        double overageFee = calculateOverageFee(overageMinutes);
        double tax = calculateTax(baseCost, overageFee);
        getFinalTotal(baseCost, overageFee, tax);
    }

    //create separate method to calculate the overage fees (charge $0,25 dollars for every minute that they've gone over)
    //overageFee = overageMinutes * 0.25
    public static double calculateOverageFee(int overageMinutes){
        double rate = 0.25;
        double overageFee = overageMinutes * rate;
        return overageFee;
    }
    //create separate method to calculate the tax, tax is 15% on subtotal
    //subtotal = baseCost + overageFee
    //tax = (baseCost + overageFee) * 0.15
    public static double calculateTax(double baseCost, double overageFee){ //method doesn't know of anything except the parameters(=arguments) which were passed into it. Суть метода - что-то посчитать и вернуть результат
        double rate = 0.15;
        double tax = (baseCost + overageFee) * rate;
        return tax;
    }
    //create separate method to calculate the final total and print the final total as an itemized bill
    //finalTotal = baseCost + overageFee + tax
    public static void getFinalTotal(double baseCost, double overageFee, double tax){
        double finalTotal = baseCost + overageFee + tax;
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + baseCost);
        System.out.println("Overage: $" + overageFee);
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }
}