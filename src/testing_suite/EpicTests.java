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
		
		assertTrue("The return form the 'SuccessMessage' class is within range of the expected results.", successMessage.data() == "Success.");
	}

	@Test	
	public void class_ErrorMessage_function_data_return_is_correct(){
	
		ErrorMessage errorMessage = new ErrorMessage();
		
		assertTrue("The return form the 'SuccessMessage' class is within range of the expected results.", errorMessage.data() == "Error.");
	}
	
	@Test
	public void class_MessageHandler_function_generateMessageObj_generates_error(){
		
		MessageHandler messageHandler = new MessageHandler();
		
		Message errorMessage = messageHandler.generateMessageObj(0);
		
		assertTrue("The class 'MessageHandler' function generateMessageObj does not return an appropriate error message.", errorMessage.data() == "Error.");	
	}
	
	@Test
	public void class_MessageHandler_function_generateMessageObj_generates_expected_result(){
		
		MessageHandler messageHandler = new MessageHandler();
		
		Message successMessage = messageHandler.generateMessageObj(1);
		
		assertTrue("The class 'MessageHandler' function generateMessageObj does not return an appropriate expected result.", successMessage.data() == "Success.");
	}
	
	
	//test out how mocking works
	@Test
	public void class_EpicService_function_getUserDataWithId_returns_valid_response(){
		
	}
	
	
}
