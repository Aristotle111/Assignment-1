/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aristotle_assignment1task2;
import java.util.Scanner;
/**
 *
 * @author 6312971
 */
public class Aristotle_Assignment1Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the item price: ");
        double price = input.nextDouble();
        
        System.out.print("Please enter the discount ratio (5 for 5%): ");
        double dRatio = input.nextDouble();
        
        double pBeforeTax = price - (price * (0.01 * dRatio));
        
        double fTax = (pBeforeTax * 0.05);
        double pTax = (pBeforeTax * 0.0975);
        double fPrice = (pBeforeTax + pTax + fTax);
        
        System.out.printf("\n\n%-17s: %.2f\n%-17s: %.2f%%\n%-17s: %.2f","Original Price",price,"Discount ratio",dRatio,"Price Before Tax",pBeforeTax);
        System.out.print("\n-------------------------------");
        System.out.printf("\n%-17s: %.2f\n%-17s: %.2f\n%-17s: %.2f\n","Federal Tax",fTax,"Provincial Tax",pTax,"Final Price",fPrice);

    }
    
}
