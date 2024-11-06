/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aristotle_assignment1task3.pkgfinal.version;
import java.util.Scanner;

/**
 *
 * @author 6312971
 */
public class Aristotle_Assignment1Task3FinalVersion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a 4-digits Octal number: ");
        String oNum = input.next();

        char char1 = oNum.charAt(3);
        int num1 = ((int)char1 -(int)'0');
        
        char char2 = oNum.charAt(2);
        int num2 = (((int)char2 -(int)'0') * 8);
        
        char char3 = oNum.charAt(1);
        int num3 = (((int)char3 -(int)'0') * 64);
        
        char char4 = oNum.charAt(0);
        int num4 = (((int)char4 -(int)'0') * 512);
        
        int dNum = num4 + num3 + num2 + num1;
        
        System.out.printf("\n%-15s: %s\n%-15s: %d\n","Octal Number",oNum,"Decimal Number",dNum);
    }
    
}
