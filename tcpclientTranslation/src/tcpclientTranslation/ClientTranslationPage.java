package tcpclientTranslation;

import java.util.Scanner;

/**
 *  This class display the console UI of the translation application.
 *  It also receive input from user.
 * 
 * @author WongKakLok
 *
 */

public class ClientTranslationPage {
	
	//attributes of text and language
	private String engtext[] = {"1-Good morning", "2-Good night", "3-How are you?",
			"4-Thank you", "5-Goodbye", "6-What’s up?"};
	private String languages[] = {"1-Bahasa Malaysia", "2-Arabic", "3-Korean"};
	
	// a method for client to choose text
	public String englishTextInput() {
		for(String engText : engtext) {
			System.out.println(engText);
		}	
		
		// receive input from user
		System.out.println("Choose a text by enter a number: ");
		Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        
        String text = " ";
        if(choose == 1)
        	text = "Good morning";
        if(choose == 2)
        	text = "Good night";
        if(choose == 3)
        	text = "How are you?";
        if(choose == 4)
        	text = "Thank you";
        if(choose == 5)
        	text = "Goodbye";
        if(choose == 6)
        	text = "What’s up?";
       
        return text;
	}
	
	// a method for client to choose language
	public int languageInput() {
		System.out.println("\n");
		for(String language : languages) {
			System.out.println(language);
		}
		
		// receive input from user
		System.out.println("What language you want to translate to? Enter a number: ");
		Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        
        return choose;
	}
}
