package Method_Overloading_Calculator;

import java.util.Scanner;

public class MethodOverloadingCalculator {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num1= scn.nextInt(),num2= scn.nextInt();
        char operator=scn.next().charAt(0);
        double input1=num1,input2=num2;
        int add=calculate(operator,num1,num2);
        int sub=calculate(num2,num1,operator);
        int multiply=calculate(num1,operator,num2);
        double divide=calculate( input1,operator,input2);
        print(add,sub,multiply,divide);
       /* if (add>0) {
            System.out.println("The Sum of 2 number is =" + add);
        }
        if(sub>0)
        {
            System.out.println("The Difference of 2 number is ="+sub);
        }
        if(multiply>0)
        {
            System.out.println("The product of 2 numbers is ="+multiply);
        }
        if (divide>0)
        {
            System.out.println("The Quotient of 2 Number is ="+divide);
        }
        if ((add==0)&&(sub==0)&&(multiply==0)&&(divide==0))
        {
            System.out.println("Invalid input");
        }

        */

    }
    public static int calculate(char operator,int num1 ,int num2)
    {
        int res=0;
        switch(operator)
        {
            case '+':
                 res= num1+num2;
        }
        return res;
    }
    public static int calculate(int num2 , int num1,char operator )
    {int res=0;
        switch(operator)
        {
            case '-':
                res= num1-num2;
        }
        return res;

    }
    public static int calculate(int num1 ,char operator, int num2)
    {int res=0;
        switch(operator)
        {
            case '*':
                res= num1*num2;
        }
        return res;

    }
    public static double calculate(double num2 ,char operator,double num1)
    {
        double res=0.0;
        switch (operator)
        {
            case '/':
                res=num1/num2;
        }
        return res;
    }
    public static void print(int add,int sub,int multiply,double divide)
    {
        if (add>0) {
            System.out.println("The Sum of 2 number is =" + add);
        }
        if(sub>0)
        {
            System.out.println("The Difference of 2 number is ="+sub);
        }
        if(multiply>0)
        {
            System.out.println("The product of 2 numbers is ="+multiply);
        }
        if (divide>0)
        {
            System.out.println("The Quotient of 2 Number is ="+divide);
        }
        if ((add==0)&&(sub==0)&&(multiply==0)&&(divide==0))
        {
            System.out.println("Invalid input");
        }
    }

}
