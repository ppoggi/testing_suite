package testing_suite;

//Objective is to implement the class that retrieves messages, either error or data messages

public class EpicData implements DataInterface{
	
	public Message retriveData(int id){

		MessageHandler messageHandler = new MessageHandler();
		DataHandler dataHandler = new DataHandler();
		
		// !1 = not the user we can access
		if(id != 1)
			return messageHandler.generateMessageObj(0);
		
		return dataHandler.generateData();
	}
}
