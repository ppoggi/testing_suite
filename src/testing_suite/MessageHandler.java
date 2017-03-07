package testing_suite;

public class MessageHandler implements MessageFactory{

	public static final int ERROR = 0;
	public static final int SUCCESS = 1;

	public Message generateMessageObj(int value){
		if(value == ERROR)
			
			return new ErrorMessage();
		//else success
		return new SuccessMessage(); 
	}
}
