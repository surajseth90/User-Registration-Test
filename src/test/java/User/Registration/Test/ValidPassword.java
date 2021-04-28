package User.Registration.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;

public class ValidPassword {
    @Test 
    	public void givenPassword_WhenProper_ShouldReturnTrue() {
        Password classUnderTest = new Password();
        boolean result = classUnderTest.validPassword("Abcdefgcds@9067");
        Assert.assertEquals(true, result);
    }
    
    	public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        Password classUnderTest = new Password();
        boolean result = classUnderTest.validPassword("abc687");
        Assert.assertEquals(false, result);
    }
}