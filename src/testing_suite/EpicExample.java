package testing_suite;

//Entry point for testing out our new Service to get data from user 1

public class EpicExample {
	
	 static void main (String[] args){
	
		EpicService epicService =  new EpicService(new EpicData()); 
		
		Message info = epicService.getUserDataWithId(1);	
		//do whatever with info
		
	}

}

