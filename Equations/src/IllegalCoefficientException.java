
public class IllegalCoefficientException extends IllegalArgumentException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void getMessage(String message){
		System.out.println(message);
	}
	public IllegalCoefficientException(String message){
		super();
		getMessage(message);
	}

}
