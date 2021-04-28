package User.Registration.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;

public class ValidLastNameTest {
    @Test 
    	public void givenLastName_WhenProper_ShouldReturnTrue() {
        LastName classUnderTest = new LastName();
        boolean result = classUnderTest.lastName("Gupta");
        Assert.assertEquals(true, result);
    }
    
    	public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        LastName classUnderTest = new LastName();
        boolean result = classUnderTest.lastName("gupta");
        Assert.assertEquals(false, result);
    }
}