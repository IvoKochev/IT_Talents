import java.util.*;
import java.util.InputMismatchException;
public class QuadraticEquation extends Equation {
	Scanner sc = new Scanner(System.in);
	private double a, b, c;
	public void getUserCoefficient(){
		System.out.println("You chose a quadratic equation. Please enter a:");
		try{
		a = sc.nextDouble();
		if(a==0){
			throw new IllegalCoefficientException("A can not be 0");
		}
		System.out.println("Please enter b:");
		b = sc.nextDouble();
		System.out.println("Please enter c");
		c = sc.nextDouble();
		} catch(InputMismatchException t){
			System.out.println("You didn't enter numbers");
		}
	}
		
	
		
public void solve(){
	double x1, x2, d;
	d =b*b - 4*a*c;
	if(d<0){
		throw new IllegalCoefficientException("D<0, there are no real answers");
		
	}
	x1 = (-b + Math.sqrt(d))/2*a;
	x2 = (-b - Math.sqrt(d))/2*a;
	double[] answer = new double[2];
	answer[0] = x1;
	answer[1] = x2;
	setAnswer(answer);
		
	}
	

}
