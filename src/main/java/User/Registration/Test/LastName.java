package User.Registration.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
	private final String lastNameCondition = "[A-Z][a-z]{3,}";
	
	public boolean lastName(String lastName) {
		Pattern compile = Pattern.compile(lastNameCondition);
		Matcher matcher = compile.matcher(lastName);
		boolean result = matcher.matches();
		return result;
	}
}
