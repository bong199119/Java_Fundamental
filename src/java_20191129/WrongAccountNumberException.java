package java_20191129;

public class WrongAccountNumberException extends Exception{
	public WrongAccountNumberException (String number){
		super(number);
	}

}
