/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aristotle_assignment1.pkg1;
import java.util.Scanner;
/**
 *
 * @author 6312971
 */
public class Aristotle_Assignment1Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Please enter your gender: ");
        String gender = input.nextLine();
        
        System.out.print("Please enter your department: ");
        String dep = input.nextLine();
        
        System.out.print("Please enter the value of PI (3.1415926):");
        double pi = input.nextDouble();
        
        System.out.printf("\n%-14s: %s\n%-14s: %d\n%-14s: %s\n%-14s: %s\n%-14s: %.2f\n","Name",name,"Age",age,"Gender",gender,"Department",dep,"PI",pi);
        
    }
    
}
