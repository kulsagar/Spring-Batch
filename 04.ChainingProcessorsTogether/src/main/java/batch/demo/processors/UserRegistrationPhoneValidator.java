package batch.demo.processors;

import org.springframework.batch.item.ItemProcessor;

import batch.demo.beans.UserRegistration;

public class UserRegistrationPhoneValidator implements ItemProcessor<UserRegistration,UserRegistration>{

	public UserRegistration process(UserRegistration input) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("UserRegistrationPhoneValidator processor called for "+input);
		return input;
	}

}
