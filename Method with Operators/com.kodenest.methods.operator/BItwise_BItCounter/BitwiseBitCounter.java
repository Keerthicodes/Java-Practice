package BItwise_BItCounter;

import java.util.Scanner;

public class BitwiseBitCounter {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int input=scn.nextInt();
        countSetBits(input);

    }
    public static void countSetBits(int bit)
    {   int local=0;
        int res=22&bit;
        System.out.println(res);
    }
}
