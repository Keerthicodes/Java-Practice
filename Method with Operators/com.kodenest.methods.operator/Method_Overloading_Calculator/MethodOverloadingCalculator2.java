package Method_Overloading_Calculator;

import java.util.Scanner;

public class MethodOverloadingCalculator2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter 2 Number ");
        int input1=scn.nextInt(),input2= scn.nextInt();
        char operator=scn.next().charAt(0);
        switch (operator)
        {
            case '+':
                System.out.println("The Sum of "+input1+" and "+input2+" is = "+calculate(input1,input2));
                break;
            case '-':
                System.out.println("The Sum of "+input1+" and "+input2+" is = "+calculate((double)input1,input2));
                break;
            case '*':
                System.out.println("The Sum of "+input1+" and "+input2+" is = "+calculate(input1,(double)input2));
                break;
            case '/':
                System.out.println("The Sum of "+input1+" and "+input2+" is = "+calculate((double)input1,(double)input2));
                break;
            default:
                System.out.println("Invalid Operator Input");
        }
    }
    public static int calculate(int num1,int num2)
    {
        return num1+num2;
    }
    public static int calculate(double num1,int num2)
    {
        return ((int)num1-num2);
    }
    public static int calculate(int num1,double num2)
    {
        return (num1*(int)num2);
    }
    public static double calculate(double num1, double num2)
    {
        return (num1/num2);
    }

}
