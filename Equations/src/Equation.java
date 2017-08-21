
public abstract class Equation implements Solvable {
	
	private double[] answer;
	private double[] coefficient;
	public abstract void getUserCoefficient();
	public void setCoefficient(double [] a){
		this.coefficient = new double[a.length];
		
		for(int i = 0; i<coefficient.length; i++){
			coefficient[i] = a[i];
		}
	}
	public void setAnswer(double[] b){
		this.answer = new double[b.length];
		for(int i = 0; i<answer.length; i++){
			answer[i] = b[i];
		}
		
	}
	
	public void printSolution(){
		for(int i = 0; i< answer.length; i++){
			System.out.println(answer[i]);
		}
	}

}
