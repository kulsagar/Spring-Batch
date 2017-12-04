package batch.demo.processors;

import org.springframework.batch.item.ItemProcessor;

import batch.demo.beans.UserRegistration;

public class UserRegistrationValidationItemProcessor implements ItemProcessor<UserRegistration,UserRegistration>{

	public UserRegistration process(UserRegistration input) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Processor called for "+ input);
		return input;
	}

}
