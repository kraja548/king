/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnana;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author admn
 */
public class Palindrome 
{
    public static void main(String[] args) throws IOException
    {
        String original="", reverse = "";
        //InputStreamReader input = new InputStreamReader(System.in);
        //BufferedReader reader = new BufferedReader(input);        
        //original = reader.readLine();
        for(int r=0;r<args.length;r++)
        {        
            original+=args[r];
        }
        original=original.toLowerCase();
        original=original.replaceAll("[^a-zA-Z]+","");
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
        reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.print("yes");
        else
         System.out.print("no");
    }
    
            
            
}
