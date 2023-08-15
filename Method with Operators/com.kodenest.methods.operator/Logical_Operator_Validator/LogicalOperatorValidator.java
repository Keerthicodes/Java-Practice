package Logical_Operator_Validator;

import java.util.Scanner;

public class LogicalOperatorValidator
{
    public static void main(String[] args)
    {
        LogicalOperatorValidator lov1=new LogicalOperatorValidator();
        Scanner scn=new Scanner(System.in);
        System.out.println("Is input valid");
        boolean a= scn.nextBoolean();
        System.out.println("Does the input meet certain condition");
        boolean b=scn.nextBoolean();
        boolean res=lov1.isValidInput(a,b);
        if (res)
        {
            System.out.println("Input is Valid ");
        }
        else
        {
            System.out.println("Input is Invalid");
        }
    }
    boolean isValidInput(boolean isValid,boolean meetsCondition) {
       return isValid&&meetsCondition;
    }

}
