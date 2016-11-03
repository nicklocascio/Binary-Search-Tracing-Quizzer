import java.util.Scanner;
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
		System.out.println("Here is your array. Below the first line are the indeces of each number.");
		for(Integer a : nums)
			{
			System.out.print(a);
			System.out.print(" ");
			}
		System.out.println(" ");
		for(int i = 1; i < nums.size()+1; i++)
			{
			System.out.print(nums.indexOf(i));
			System.out.print(" ");
			}
		System.out.println(" ");
		// Choosing a target
		int b = (int)(Math.random()*nums.size());
		int target = nums.get(b);
		System.out.println(" ");
		System.out.println("Your target number is: " + target);
		System.out.println(" ");
		// Chart
		System.out.println("Use this chart for reference: ");
		System.out.println(" ");
		System.out.println("left __  right __  middle __ array[middle] __");
		System.out.println(" ");
		// Going into the quiz
		boolean pass = true;
		// Scanner & Counters
		Scanner userInput2 = new Scanner(System.in);
		int counter = 0;
		int counter2 = 1;
		int counter3 = 0;
		// Left, Right, Mid
		int left = 0;
		int right = nums.size()-1;
		// Questions
		while(pass)
			{
			System.out.println(" ");
			System.out.println("You are on pass " + counter2);
			System.out.println(" ");
			// Left
			System.out.println("What is the left index?");
			int leftU = userInput2.nextInt();
			if(leftU == left)
				{
				System.out.println("Correct!");
				counter++;
				}
			else
				{
				System.out.println("I'm sorry that's incorrect. The correct answer is " + left);
				}
			counter3++;
			// Right
			System.out.println("What is the right index?");
			int rightU = userInput2.nextInt();
			if(rightU == right)
				{
				System.out.println("Correct!");
				counter++;
				}
			else
				{
				System.out.println("I'm sorry that's incorrect. The correct answer is " + right);
				}
			counter3++;
			// Mid
			int mid = (left+right)/2;
			System.out.println("What is the middle index?");
			int midU = userInput2.nextInt();
			if(midU == mid)
				{
				System.out.println("Correct!");
				counter++;
				}
			else
				{
				System.out.println("I'm sorry that's incorrect. The correct answer is " + mid);
				}
			counter3++;
			// Number
			System.out.println("What is at array[middle]?");
			int number = userInput2.nextInt();
			if(number == nums.get(mid))
				{
				System.out.println("Correct!");
				counter++;
				}
			else
				{
				System.out.println("I'm sorry that's incorrect. The correct answer is " + nums.get(mid));
				}
			counter3++;
			// Checking for target
			// Equal		
			if(nums.get(mid) == target)
				{
				if(counter2 == 1)
					{
					System.out.println(" ");
					System.out.println("You should have reached the target in " + counter2 + " pass.");
					}
				else
					{
					System.out.println(" ");
					System.out.println("You should have reached the target in " + counter2 + " passes.");
					}
				pass = false;
				}
			// Not equal
			else if(nums.get(mid) != target)
				{
				// Change right
				if(target < nums.get(mid))
					{
					right = mid - 1;
					}
				// Change left
				else
					{
					left = mid + 1;
					}
				pass = true;
				}
			else if(left > right)
				{
				pass = false;
				}
			counter2++;			
			}	
		System.out.println(" ");
		System.out.println("You got " + counter + " questions correct out of " + counter3);
		}
	}





