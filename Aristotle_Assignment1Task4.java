/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aristotle_assignment1task4;
import java.util.Scanner;
/**
 *
 * @author 6312971
 */
public class Aristotle_Assignment1Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the initial balance: $");
        double balance = input.nextDouble();
        
        System.out.print("Please enter the annual interest rate (2 for 2%): ");
        double iRate = input.nextDouble();
        
        System.out.print("Please enter the number of years the client wants to save the money in the bank: ");
        int years = input.nextInt();
        
        double bAfter = balance * (Math.pow((1 + (iRate / 100)), years));
        
        System.out.printf("\n%-22s:%9.2f\n%-22s:%8.2f%%\n%-22s:%9d\n","Initial Balance",balance,"Annual Interest Rate",iRate,"Saving Years",years);
        System.out.println("-------------------------------");
        System.out.printf("%s %d %s :%9.2f\n","Balance After",years,"Years",bAfter);
    }
    
}
