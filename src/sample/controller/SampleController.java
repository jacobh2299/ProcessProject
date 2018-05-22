package sample.controller;

import java.util.Scanner;

import sample.model.PlayDohCircle;
import sample.model.PlayDohSnake;

public class SampleController 
{
	public void start()
	{
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		PlayDohCircle thirdCircle;
		thirdCircle = new PlayDohCircle(10);
		
//		PlayDohSnake firstSnake = new PlayDohSnake();
//		PlayDohSnake secondSnake;
//		secondSnake = new PlayDohSnake(20);
//		System.out.println("Here is my play doh cirlce");
//		System.out.println(firstCircle);
		
		
//		System.out.println("This is a sample prject to show the github and");
//		System.out.println("eclipse process so I develop muscle memory :D");
		testScanner();
	}
	public String toString()
	{
		String DES = "I am a Play Doh Circle";
		return DES;
	}
	
	private void testScanner()
	{
			Scanner firstScanner; //Declares a scanner object
			firstScanner = new Scanner(System.in); //Instanciates a Scanner object
			System.out.println("Type Here your age:");
			int ageAnswer = firstScanner.nextInt();
			System.out.println("you said you are "+ageAnswer +" years old");
			
//			 PlayDohCircle changeCircle = new PlayDohCircle();
//			System.out.println("Here is the circle before i changed it");
//			System.out.println(changeCircle);
//			System.out.println("Type in a new size - use numbers please.");
//			int mySize = firstScanner.nextInt();
//			System.out.println("Your new circle has a diameter of "+mySize);
			
			}
	}

