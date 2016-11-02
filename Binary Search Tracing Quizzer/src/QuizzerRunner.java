import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

import javax.swing.plaf.synth.SynthSpinnerUI;

import java.util.ArrayList;
import java.util.Collections;

public class QuizzerRunner
	{
	public static void main(String[] args)
		{
		ArrayList <Integer> nums = new ArrayList <Integer>();
		System.out.println("Enter as many numbers as you want, between 1 and 20. When you are done adding numbers, please type -1.");
		Scanner userInput = new Scanner(System.in);
		boolean stillInputting= true;
		// User inputting the numbers and adding to array
		while(stillInputting)
			{
			int num = userInput.nextInt();
			if(num >= 1 && num <= 20)
				{
				nums.add(num);
				stillInputting = true;
				}
			else if((num < 1 || num > 20) && num != -1)
				{
				System.out.println("That number is not between 1 and 20.");
				stillInputting = true;
				}
			else if(num == -1)
				{
				stillInputting = false;
				}
			}
		// Sort array
		Collections.sort(nums);
		// Print array
		System.out.println("Here is your array. It may be wise to write this down.");
		System.out.println(" ");
		for(Integer a : nums)
			{
			System.out.print(a);
			System.out.print(" ");
			}
		System.out.println(" ");
		// Choosing a target
		int b = (int)(Math.random()*nums.size());
		int target = nums.get(b);
		System.out.println(" ");
		System.out.println("Your target number is: " + target);
		System.out.println(" ");
		System.out.println("Use this chart for reference: ");
		System.out.println(" ");
		System.out.println("left __  right __  middle __ array[middle] __");
		System.out.println(" ");
		// Going in to the quizzer
		boolean pass = true;
		Scanner userInput2 = new Scanner(System.in);
		Scanner userInput3 = new Scanner(System.in);
		Scanner userInput4 = new Scanner(System.in);
		Scanner userInput5 = new Scanner(System.in);
		int counter = 0;
		while(pass)
			{
			System.out.println("What is the left index?");
			int left = userInput2.nextInt();
			if(left == nums.get(0))
				{
				counter++;
				}
			System.out.println("What is the right index?");
			int right = userInput2.nextInt();
			if(right == nums.get(nums.size()-1))
				{
				counter++;
				}
			System.out.println("What is the middle index?");
			int middle = userInput2.nextInt();
			if(middle == nums.get((left+right)/2))
				{
				counter++;
				}
			System.out.println("What is at array[middle]?");
			int number = userInput2.nextInt();
			if(number == nums.get(middle))
				{
				counter++;
				}
			System.out.println(counter);
			// Make sure to add a way to remove half of the array after each pass. Most likely use .remove
			}
		}
	}





