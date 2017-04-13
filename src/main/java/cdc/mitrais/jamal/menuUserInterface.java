package cdc.mitrais.jamal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class menuUserInterface {

	public static void menuMain(int a) {
		Scanner choices = new Scanner(System.in);
		String line;
		String name = null;
		
		switch (a) {
		case 99:
			System.out.println("What you gonna Do Bro? Tell me Your Name");
			name = choices.nextLine();
			new askFormInput().setName(name);
			askFormInput.setGo(1);
			askFormInput.setChoice(1);
			break;
		case 0:
			System.out.println("Welcome to Organism Search Application " + name);
			System.out.println("Here is the menu of this application, please enter the number only");
			System.out.println("1.Search Organism by Type");
			System.out.println("2.Search Organism by Name");
			System.out.println("3.Search Organism by words");
			break;
		case 1:
			System.out.println("What Type Do You Want To Search?");
			String type=choices.nextLine();
			break;
		case 2:
			System.out.println("YOU INPUT TWO VALUE");
			break;
		case 3:
			System.out.println("YOU INPUT TWO VALUE");
			break;
		case 4:
			System.out.println("YOU INPUT TWO VALUE");
			break;
		default:
			System.out.println("Wrong Input Bro ");
			break;

		}

	}

}
