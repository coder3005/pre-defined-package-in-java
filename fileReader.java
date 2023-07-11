/* Read Data from a File */
import java.Lang.System;  // by default
import java.Lang.String;  // by default

import java.io.File;
import java.io.IOException;

import java.util.Scanner;

class fileReader
{
    public static void main(String[] args) {
        
        try
        {
            File r=new File("C:\\Users\\Abhi Gupta\\downloads\\UP.txt");
            Scanner sc=new Scanner(r);
            while(sc.hasNextLine())
            {
                System.out.println(sc.hasNextLine());
                System.out.println(sc.nextLine());
                System.out.println(sc.hasNextLine());
            }
        }
        catch(IOException e)
        {
            System.out.println("Exception Handled...!");
        }
    }
}
