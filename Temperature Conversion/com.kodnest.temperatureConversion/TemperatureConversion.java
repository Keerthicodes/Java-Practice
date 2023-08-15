import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("=======\t Temperature Converter Tool \t=======\n");
        System.out.println("Select The Following option");
        System.out.println("1. Celsius To Fahrenheit ");
        System.out.println("2. Fahrenheit to Celsius ");
        int input= scn.nextInt();
        System.out.println("Enter The Temperature");
        double temperature=scn.nextDouble();
        switch (input)
        {
            case 1:
                System.out.println(temperature+"°C is equivalent to "+celsiusToFahrenheit(temperature)+"°F");

                break;
            case 2:
                System.out.println(temperature+"°Fis equivalent to "+fahrenheitToCelsius(temperature)+"°C");
                break;
            default:
                System.out.println("Invalid Selection From the Menu");
        }

    }
    public static double celsiusToFahrenheit(double C)
    {
       return  (C * 9/5) + 32;
    }
    public static double fahrenheitToCelsius(double F)
    {
        return (F - 32) * 5/9;
    }
}
