import java.util.Scanner;
import java.util.ArrayList;

public class QuizzerRunner
	{
	public static void main(String[] args)
		{
		ArrayList <Integer> nums = new ArrayList <Integer>();
		System.out.println("Enter as many numbers as you want, between 1 and 20. When you are done adding numbers, please type -1.");
		Scanner userInput = new Scanner(System.in);
		int num = userInput.nextInt();
		while(num != -1)
			{
			if(num >= 1 && num <= 20)
				{
				nums.add(num);
				}
			else
				{
				System.out.println("That number is not between 1 and 20.");
				}
			}
		for(Integer hi : nums)
			{
			System.out.print(hi);
			}
		}
	}





