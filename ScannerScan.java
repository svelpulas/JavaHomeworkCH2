/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerscan;
import java.util.Scanner;
/**
 *
 * @author sande
 */
public class ScannerScan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the purchase amount: Enter your name:");
        float price = scan.nextFloat();
        scan.nextLine();
        String name = scan.nextLine();
        final float sttax = (float) 0.04 * price;
        final float fedtax = (float) 0.02 * price;
        System.out.println("Dear: " + name.toUpperCase() + ", " + "your item was $" + price);
        System.out.println("State sales tax: $" + sttax);
        System.out.println("County sales tax: $" + fedtax);
        System.out.println("Total to be paid: $" + (price+sttax+fedtax));
    }
}

    

