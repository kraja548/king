package gnana;

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		String ip="";
		for(int r=0;r<args.length;r++)
			ip+=args[i];
		input = input.replaceAll("[^a-zA-Z]+","").toLowerCase();
		char[] array=input.toCharArray();
		int isPalindrome=1;
		for(int i=0,j=array.length-1;i<j;i++,j--)
		{
			if(array[i]!=array[j])
				isPalindrome=0;
		}
		if(isPalindrome)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
