import java.util.*;
import java.util.InputMismatchException;
public class LinearEquation extends Equation {
	
	Scanner sc = new Scanner(System.in);
 	private double a,b; 
	
	public void solve(){
		double x;
		x=-b/a;
		double[] answer = new double[1];
		answer[0] = x;
		setAnswer(answer);
		
	}
	public  void getUserCoefficient(){
		System.out.println("You chose a linear equation. Please enter a:");
		try{
		a = sc.nextDouble();
		if(a==0){
			throw new IllegalCoefficientException("A can not be 0");
		}
		System.out.println("Please enter b:");
		b = sc.nextDouble();
		} catch(InputMismatchException q){
			System.out.println("You didnt enter numbers");
		}
		
	}	
	
	
	
	
	
	
}
