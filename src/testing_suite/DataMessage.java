package testing_suite;

public class DataMessage implements Message{
	
	private String message = "{status: 'OK', Data: 'Lorem Ipsum Dolor' }";
	
	public String data(){
		return this.message;
	}
}
