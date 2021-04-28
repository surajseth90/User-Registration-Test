package User.Registration.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
	private static final String passwordCondition = "(?=.*\\d)(?=.*[A-Z])[A-Za-z0-9]{7,}(?=.*[\\$\\@\\!\\%\\*\\?\\=\\"
			+ "\\+\\-\\_\\&]{1})";
	
	public boolean validPassword(String password) {
		Pattern compile = Pattern.compile(passwordCondition);
		Matcher matcher = compile.matcher(password);
		boolean result = matcher.matches();
		return result;
	}
}

