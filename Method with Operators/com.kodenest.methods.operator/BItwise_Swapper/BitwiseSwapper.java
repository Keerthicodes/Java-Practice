package BItwise_Swapper;

import java.util.Scanner;

public class BitwiseSwapper {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Two Integers to Swapped");
        int input1=scn.nextInt(),input2= scn.nextInt();
        swapUsingBitwise(input1,input2);


    }
    public static void swapUsingBitwise(int num1,int num2)
    {
        int temp=num1^num2;
        num1=num1^temp;
        num2=num2^temp;
        System.out.println(temp);
        System.out.println("The Swapped Values are:-");
        System.out.println(num1+"\n"+num2);

    }
}
