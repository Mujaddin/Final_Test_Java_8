package cdc.mitrais.jamal;

import java.io.IOException;
import java.util.Scanner;

public class askFormInput {
	private static String name;
	private static int go;
	private static int choice = 0;

	public static void setChoice(int choice) {
		askFormInput.choice = choice;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		menuUserInterface.menuMain(99);
		while (go == 1) {
			menuUserInterface.menuMain(choice);
			System.out.print("What is Your Choice  " + name);
			choice = input.nextInt();
		}
	}

	public static int getGo() {
		return go;
	}

	public static void setGo(int go) {
		askFormInput.go = go;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
