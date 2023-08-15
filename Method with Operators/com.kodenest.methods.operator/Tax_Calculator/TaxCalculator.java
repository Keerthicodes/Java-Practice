package Tax_Calculator;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        TaxCalculator taxCalculator=new TaxCalculator();
        System.out.println("Enter purchase amt and tax rate ");
        double purchaseAmount= scn.nextDouble(),taxRate= scn.nextDouble();
        System.out.println(taxCalculator.calculateTotalWithTax(purchaseAmount,taxRate));


    }
    double calculateTotalWithTax(double purchaseAmount,double taxRate)
    {
        return purchaseAmount+(purchaseAmount*taxRate);

    }
}
