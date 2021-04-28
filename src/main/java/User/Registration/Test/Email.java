package User.Registration.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
		private final String emailCondition = "[a-z0-9.]+@[a-z0-9.]+\\.[a-z]{2,}";
		
		public boolean validEmail(String email) {
			Pattern compile = Pattern.compile(emailCondition);
			Matcher matcher = compile.matcher(email);
			boolean result = matcher.matches();
			return result;
		}
}
