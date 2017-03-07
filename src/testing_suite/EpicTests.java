package testing_suite;

import static org.junit.Assert.*;

import org.junit.Test;

public class EpicTests {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	@Test	
	public void class_SuccessMessage_function_data_return_is_correct(){
	
		SuccessMessage successMessage = new SuccessMessage();
		
		assertTrue("The return form the 'SuccessMessage' class is not within range of the expected results.", successMessage.data() == "Success.");
	}

	@Test	
	public void class_ErrorMessage_function_data_return_is_correct(){
	
		ErrorMessage errorMessage = new ErrorMessage();
		
		assertTrue("The return form the 'SuccessMessage' class is not within range of the expected results.", errorMessage.data() == "Error.");
	}
	
	@Test
	public void class_MessageHandler_function_generateMessageObj_generates_error(){
		
		MessageHandler messageHandler = new MessageHandler();
		
		Message errorMessage = messageHandler.generateMessageObj(0);
		
		assertTrue("The class 'MessageHandler' function 'generateMessageObj' does not return an appropriate error message.", errorMessage.data() == "Error.");	
	}
	
	@Test
	public void class_DataMessage_function_data_generates_expected_result(){
		
		DataMessage dataMessage = new DataMessage();
		
		assertTrue("The class 'DataMessage' function 'data does not return an appropriate error message.", dataMessage.data() == "{status: 'OK', Data: 'Lorem Ipsum Dolor' }");
		
	}
	
	
	@Test
	public void class_MessageHandler_function_generateMessageObj_generates_expected_result(){
		
		MessageHandler messageHandler = new MessageHandler();
		
		Message successMessage = messageHandler.generateMessageObj(1);
		
		assertTrue("The class 'MessageHandler' function generateMessageObj does not return an appropriate expected result.", successMessage.data() == "Success.");
	}
	
	@Test
	public void class_EpicData_function_retrieveData_generates_expected_result(){
		
		EpicData epicData = new EpicData();
		
		Message dataMessage = epicData.retriveData(1);

		assertTrue("The class 'EpicData' function 'retrieve' does not return an appropriate expected result.", dataMessage.data() == "{status: 'OK', Data: 'Lorem Ipsum Dolor' }");
		
		
	}

	@Test
	public void class_EpicService_function_getUserDataWithId_returns_valid_response(){
	
		EpicData epicData = new EpicData();
		EpicService epicService = new EpicService(epicData);
		
		Message serviceMessage =  epicService.getUserDataWithId(1);
		
		assertTrue("The class 'EpicService function 'getUserDataWithId' does not return an appropriate expected result.", serviceMessage.data() == "{status: 'OK', Data: 'Lorem Ipsum Dolor' }");
	}
	
	
}
