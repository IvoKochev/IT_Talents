import java.util.*;
import java.util.InputMismatchException;
public class Equation1 {
	public static int getMenuNumber(){
		int a=0;
		Scanner sc = new Scanner(System.in);
		try{	
		System.out.println("If you want to solve a linear equation choose 1. If you want to solve a quadratic equation choose 2.");
		
		a = sc.nextInt();} catch(InputMismatchException q){
			System.out.println("You didnt enter an integer!");
		}
		
		return a;
	}
		
	
	public static int getAnswer(){
		int a=0;
		Scanner sc = new Scanner(System.in);
		
		
		try{
		System.out.println("If you want to solve another equation choose 1. If you don't want to then choose 0");
		a = sc.nextInt();
		} catch(InputMismatchException e){	
			System.out.println("You didn't enter an integer!");
			
		}
		
		
		return a;
	}
	

	public static void main(String[] args) {
		
		boolean flag;
		do{
			
			
		switch(getMenuNumber()){
			
		case 1: do
		{
			try
			{
				LinearEquation linear = new LinearEquation();
				linear.getUserCoefficient();
				linear.solve();
				System.out.println("Your answer is:");
				linear.printSolution();
				flag = false;
				
				
			} catch(IllegalCoefficientException e)
			{
				e.getMessage();
				flag = true;
			}
		} while(flag);
		break; 	
		case 2: do{
			
			try{
				QuadraticEquation quadratic = new QuadraticEquation();
				quadratic.getUserCoefficient();
				quadratic.solve();
				System.out.println("Your answers are: " );
				quadratic.printSolution();
				flag = false;
			
			} catch(IllegalCoefficientException e){
				e.getMessage();
				flag = true;
			}
			}
			while(flag);
			break;
		}
		} while(getAnswer() == 1);
		
		
			
			
		
		
		
		
		
		

	}

}
