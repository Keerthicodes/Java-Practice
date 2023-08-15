import java.util.Scanner;

public class CalculatorDilemma {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Which Arithmetic operation do want to perform "+"\n"+"add,sub,multiply,div");
        String artihmeticOperation=scn.next();
        System.out.println("Enter the Numbers ");
        int num1=scn.nextInt(),num2=scn.nextInt(),result;
        switch (artihmeticOperation)
        {
            case "add":
                result=num1+num2;
                System.out.println("The Sum of "+num1+" & "+num2+" = "+result);
                break;
            case "sub":
                result=num1-num2;
                System.out.println("The Difference of "+num1+" & "+num2+" = "+result);
                break;
            case "multiply":
                result=num1*num2;
                System.out.println("The Product of "+num1+" & "+num2+" = "+result);
                break;
            case "div":
                result=num1/num2;
                System.out.println("The Quotient of "+num1+" & "+num2+" = "+result);
                break;
            default:
                System.out.println("Invalid Arithmetic Operation Input");
        }
    }
}
