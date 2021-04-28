package User.Registration.Test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;


public class ValidEmailTest {
	private String email2Test;
	private boolean expectedResult;
	
	public ValidEmailTest(String email , boolean expectedResult) {
		this.email2Test =email;
		this.expectedResult =expectedResult;
	}

	public static Collection data() {
		return Arrays.asList(new Object[][] {
			{"abc@yahoo.com" , true},
			{"abc-100@yahoo.com" , true},
			{"abc.100@yahoo.com" , true},
			{"abc111@abc.com" , true},
			{"abc-100@abc.net" , true},
			{"abc.100@abc.com.au" , true},
			{"abc@1.com" , true},
			{"abc+100@gmail.com" , true},
			{"abc@gmail.com.com" , true},
			{"abc@.com.my" , false},
			{"abc123@gmail.a" , false},
			{"abc123@.com" , false},
			{"abc123@.com.com" , false},
			{".abc@abc.com" , false},
			{"abc()*@gmail.com" , false},
			{"abc@%*.com" , false},
			{"abc..2002@gmail.com" , false},
			{"abc.@gmail.com" , false},
			{"abc@abc@gmail.com" , false},
			{"abc@gmail.com.1a" , false},
			{"abc@.com.aa.au" , false}});
		
	}
	
		public void givenEmailArray_ShouldReturnAsPerParametrizedResult() { 
		Email email = new Email();
		boolean result = email.validEmail(this.email2Test);
		Assert.assertEquals(this.expectedResult ,result);
	}
}
