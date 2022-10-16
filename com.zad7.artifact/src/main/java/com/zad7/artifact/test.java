package com.zad7.artifact;
import java.util.Scanner;
	

public class test {

	public static void main(String[] args) {
		
		Scanner scanner;
		String help;
		double help1;
		double help2;
		
		while(true)
			{
			System.out.println("Choose a shape\n1. Circle\n2. Square\n3. Rectangle\n4. Exit");
			scanner = new Scanner(System.in);
			help = scanner.nextLine();
			
			if(help.equals("1"))
				{
				System.out.println("Insert radius");
				scanner = new Scanner(System.in);
				help = scanner.nextLine();
				help1 =Double.parseDouble(help);
				Circle circle = new Circle();
				System.out.println("Field:" + circle.field(help1));
				System.out.println("Circuit: " + circle.circuit(help1));
				continue;
				}
			if(help.equals("2"))
				{
				System.out.println("Insert width");
				scanner = new Scanner(System.in);
				help = scanner.nextLine();
				help1 =Double.parseDouble(help);
				Square square = new Square();
				System.out.println("Field:" + square.field(help1));
				System.out.println("Circuit:" + square.circuit(help1));
				continue;
				}
			if(help.equals("3"))
				{
				System.out.println("Insert width");
				scanner = new Scanner(System.in);
				help = scanner.nextLine();
				help1 =Double.parseDouble(help);
				System.out.println("Insert length");
				help = scanner.nextLine();
				help2 =Double.parseDouble(help);
				Rectangle rectangle = new Rectangle();
				System.out.println("Field:" + rectangle.field(help1, help2));
				System.out.println("Circuit:" + rectangle.circuit(help1, help2));
				continue;
				}
			if(help.equals("4"))
				{
				System.out.println("Bye");
				System.exit(0);;
				}

	}

	}
}
