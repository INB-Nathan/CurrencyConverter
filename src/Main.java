/*
* Program: Currency Converter
* Description: User will input PHP then will be converted to USD, EU, YUAN, KOR, KRO, SHEQEL, DINAR.
* Date: 9/19/2024
* Author: Cabrales, Nathan Josua C. - 202312375@fit.edu.ph
 */

import java.util.*; // Import Util Class to use Scanner

class CurrenciesDetails { // Declare class for Currency Details
    final double usdRate = 0.018, euRate = 0.016, yuanRate = 0.13, korRate = 0.40, kroRate = 0.19, sheqelRate = 0.068, dinarRate = 0.0055; // Initialize final since it is a constant.
    private double userPHPInput; // userPHPInput for the Exchange rates
    public void setUserPHPInput(double userInput) {
        this.userPHPInput = userInput;
    }
    public void listOfExchange(){
        System.out.println("The amount's equivalent to: ");
        System.out.println("Philippine Peso is : " + this.userPHPInput);
        System.out.println("USD: " + this.userPHPInput * usdRate);
        System.out.println("Euro: " + this.userPHPInput * euRate);
        System.out.println("Yuan: " + this.userPHPInput * yuanRate);
        System.out.println("Koruna: " + this.userPHPInput * korRate);
        System.out.println("Krone: " + this.userPHPInput * kroRate);
        System.out.println("Sheqel: " + this.userPHPInput * sheqelRate);
        System.out.println("Dinar: " + this.userPHPInput * dinarRate);
    }
}
public class Main {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        CurrenciesDetails Details = new CurrenciesDetails();
        System.out.print("Enter Philippine Peso: ");
        double userInput = myObj.nextDouble();
        Details.setUserPHPInput(userInput);
        System.out.println("******************************");
        Details.listOfExchange();
    }
}