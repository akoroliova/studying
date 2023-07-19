package chapter6;
import java.util.Scanner;

public class PhoneBillCalculator2 {

    // calculate the overageFee = overageMinutes * (baseMinuteCost * overageRate);
    // calculate the tax = (baseCost + overageFee) * taxRate;
    // calculate the finalTotal = baseCost + overageFee + tax;
    // print itemized bill.

    public static void main(String[] args) {
        //Allow the user to input the base minute cost, allotted minutes and overage minutes:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your bill ID:");
        int externalId = scanner.nextInt();

        System.out.println("Enter allotted minutes:");
        int externalAllottedMinutes = scanner.nextInt();

        System.out.println("Enter USED minutes:");
        int externalUsedMinutes = scanner.nextInt();

        System.out.println("Enter base minute cost:");
        double externalBaseMinuteCost = scanner.nextDouble();

        scanner.close();

        double baseCost = calculateBaseCost(externalAllottedMinutes, externalBaseMinuteCost);
        int overageMinutes = calculateOverageMinutes(externalAllottedMinutes, externalUsedMinutes);
        double overageFee = calculateOverageFee(overageMinutes, externalBaseMinuteCost);
        double tax = calculateTax(baseCost, overageFee);
        getFinalTotal(baseCost, overageFee, tax, externalId, externalAllottedMinutes, externalUsedMinutes);
    }

    //create separate method to calculate the baseCost = allocatedMinutes * baseMinuteCost:
    public static double calculateBaseCost(int externalAllottedMinutes, double baseMinuteCost){
        return externalAllottedMinutes * baseMinuteCost;
    }

    //create separate method to calculate overageMinutes = externalAllottedMinutes - usedMinutes:
    public static int calculateOverageMinutes(int externalAllottedMinutes, int usedMinutes){
        if(externalAllottedMinutes >= usedMinutes){
            return 0;
        }
        else{
            return usedMinutes - externalAllottedMinutes;
        }
    }

    //create separate method to calculate overageFee = overageMinutes * baseMinuteCost * overageRate:
    public static double calculateOverageFee(int overageMinutes, double baseMinuteCost){
        double overageRate = 0.25;
        if(overageMinutes > 0){
            return overageMinutes * baseMinuteCost * overageRate;
        }
        else{
            return 0;
        }
    }

    //create separate method to calculate the tax = (baseCost + overageFee) * taxRate:
    public static double calculateTax(double baseCost, double overageFee){
        double taxRate = 0.15;
        return (baseCost + overageFee) * taxRate;
    }
    //create separate method to calculate the finalTotal = baseCost + overageFee + tax:
    public static void getFinalTotal(double baseCost, double overageFee, double tax, int id, int allottedMinutes, int usedMinutes){
        double finalTotal = baseCost + overageFee + tax;

    //and print the final total as an itemized bill:
        System.out.println("Phone Bill Statement");
        System.out.println("Plan ID:" + id);
        System.out.println("Plan: $" + baseCost);
        System.out.println("Number of allotted minutes:" + allottedMinutes);
        System.out.println("Number of minutes used:" + usedMinutes);
        System.out.println("Overage: $" + overageFee);
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }
}