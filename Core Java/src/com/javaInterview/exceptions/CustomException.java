package com.javaInterview.exceptions;

public class CustomException {

	public static void main(String[] args) {
		try {
			CustomException customException = new CustomException();
			customException.method(65); //Need to handle it
		} catch (BusinessException be) {
			System.out.println("My Custom Business Exception throw is '" + be.getError() + "'");
		}
	}

	void method(int i) throws BusinessException {
		if (i < 40) { //Some logic to throw the custom exception
			System.out.println("i<40");
			throw new BusinessException(); 
		} else {
			throw new BusinessException(i + " is not less than than 40");
		}
	}
}

class BusinessException extends Exception {

	private static final long serialVersionUID = 1L;
	String error;

	public BusinessException() {
		super();
		error = "Unknown";
	}

	public BusinessException(String message) {
		super(message);
		error = message;
	}

	public String getError() {
		return error;
	}

}