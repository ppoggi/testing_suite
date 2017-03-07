package testing_suite;

public class DataHandler implements DataFactory{

	public Message generateData(){
		
		return new DataMessage();
	}
}