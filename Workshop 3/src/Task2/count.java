/**********************************************
Workshop 4

Course: JAC444 - 4
Last Name: Saiyed
First Name: Mohammad Maaz
ID: 113485205
Section: ZAA
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date: 10-03-2023
**********************************************/

package Task2;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class count {

	 public static void main(String[] args) throws Exception 
	 {
	        char[] m_abc = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz".toCharArray();
	        int[] m_cnt = new int[m_abc.length];
	        
	        System.out.print("Enter a filename: ");
	        
	        Scanner scnr = new Scanner(System.in);
	        String f = "C:\\Users\\maazs\\OneDrive\\Desktop\\java\\Workshop4\\src\\Task2\\" + scnr.nextLine();
	        BufferedReader read = new BufferedReader(new FileReader(f));
	     
	        int m_char;
	        while ((m_char = read.read()) != -1)
	        {
	            for (int i = 0; i < m_abc.length; i++) 
	            {
	                char c_char = (char) m_char;
	                if (c_char == m_abc[i]) 
	                {
	                    m_cnt[i]++;
	                }
	            }
	        }
	        
	        for (int i = 0; i < m_abc.length; i++)
	        {
	            System.out.printf("Number of %c's: %d\n", m_abc[i], m_cnt[i]);
	        }
	        read.close();
	        scnr.close();
	    }
}