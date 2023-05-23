/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author C
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        String[]nama={"Fakhrur","Ilham","Alfin","Alif",};
                for(int num:arr){
                    System.out.println(num);
                }
                for(String Str:nama){
                    System.out.println(Str+" ");
                }
        try (PrintWriter fileout = new PrintWriter ("receipt.txt")) {
            fileout.println("Fakhrur");
            fileout.println("Ilham");
            fileout.println("Alfin");
            fileout.println("Alif");
            fileout.println("Restu");
        }
        Scanner fin = new Scanner (new File("receipt.txt"));
        while (fin.hasNextLine());
        String text=fin.nextLine();
        System.out.print(text);
    
    }
    
}
