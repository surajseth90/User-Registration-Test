package User.Registration.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {
	private final String firstNameCondition = "[A-Z][a-z]{3,}";
	
	public boolean firstName(String firstName) {
		Pattern compile = Pattern.compile(firstNameCondition);
		Matcher matcher = compile.matcher(firstName);
		boolean result = matcher.matches();
		return result;
	}
}
