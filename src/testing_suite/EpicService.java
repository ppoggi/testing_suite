package testing_suite;

// Objective is to create a service that uses "DataInterface" as a dependency

public class EpicService {

	private DataInterface dataObject;
	
	EpicService(DataInterface dataObject ){
		
		this.dataObject = dataObject;
	}
	
	public Message getUserDataWithId(int id){
		
		return dataObject.retriveData(id);
	}
	
}
