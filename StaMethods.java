//Gurpreet Singh 10/08.2021
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
public class StaMethods
{
   public static int y;
   public static void main(String args[])
   {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to the 4 basic Static Methods class!!");
   showMenu();
   while(y<0 || y>5)
   {System.out.println("That is not one of the options, try again!");
   showMenu();}
      
       
   }
   public static void showMenu()
   {
   Scanner input = new Scanner(System.in);
   System.out.println("Use the menu below to choose what to do!");
    System.out.println("Press 1 to generate a random Integer!");
     System.out.println("Press 2 to Generate a random whole number!");
      System.out.println("Press 3 to convert from Fahrenheit to Celsius!");
       System.out.println("Press 4 to convert from Celsius to Fahrehheit!");
        System.out.println("Press 0 to end the program!");
       y = input.nextInt();
   if(y == 1)
   { Randomint();}
   else 
   if(y == 2)
   {RandomDo();}
   else
   if (y == 3)
   { FtoC();}
   else 
   if(y == 4)
   {CtoF();}
   else 
   if(y == 0)
   {System.out.println("Have a good day!");}
   
       
   }
   public static void Randomint()
   {
    Scanner input = new Scanner(System.in);
   System.out.println("enter the minimum number for the range");
   int minimum = input.nextInt();
   System.out.println("enter the maximum number for the range");
   int maximum = input.nextInt();
  int ans = generateRandomInt(minimum,maximum);
  System.out.println("your random number is " +ans+ "!");
    }
   
   public static void RandomDo()
   {
    Scanner input = new Scanner(System.in);
   System.out.println("enter the minimum number for the range");
   double minimum = input.nextDouble();
   System.out.println("enter the maximum number for the range");
   double maximum = input.nextDouble();
  double ans = generateRandomDouble(minimum,maximum);
  System.out.println("your random number is !");
  System.out.printf("%7.2f%n", ans);

   }
   
    public static void FtoC()
   {
    Scanner input = new Scanner(System.in);
   System.out.println("Enter the Fahrenheit value to convert!");
   double value = input.nextDouble();
     double ans = fahrenheitToCelsius(value);
  System.out.println(" " +value+ " Degrees in Fahrenheit is " +ans+ " degrees Celsius");

   }
   
    public static void CtoF()
   {
    Scanner input = new Scanner(System.in);
   System.out.println("Enter the Celsius value to convert!");
   double value2 = input.nextDouble();
     double ans = celsiusToFahrenheit(value2);
  System.out.println(" " +value2+ " Degrees in Celius is " +ans+ " degrees Fahrenheit");

   }


   
   public static int generateRandomInt(int min, int max)
   {
   int x = (int)(Math.random()*(max-min+1)+ min);
   return x; 
   }
   public static double generateRandomDouble(double min, double max)
   {
   double x = (Math.random()*(max-min+1)+ min);

   return x;
   }
   public static double fahrenheitToCelsius(double g)
   {
   double x = (g - 32.0) * (5.0/9);
   return x; 
   }
   public static double celsiusToFahrenheit(double c)
   {
   double x = (c * 9.0/5) + 32;
   return x;
   }
}