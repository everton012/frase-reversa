package fraseReversa_String_StringBuilder;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String s1 = input.nextLine();
		
		System.out.println("\nThe string reverse is: ");
			
		/* método para escrever uma palavra de trás para frente*/
		for(int count = s1.length() - 1; count >= 0; count--) {
			System.out.printf("%c", s1.charAt(count));
		}
		
		//Reverse Method with StringBuilder
		StringBuilder buffer2 = new StringBuilder(s1);
		buffer2.reverse();
		System.out.printf("\n\nWith StringBuilder: \n%s", buffer2.toString());

	}

}
