// Java program to check if an email address is valid or invalid
import java.util.regex.Pattern;
import java.util.*;

class Test
{
	public static boolean isValid(String email)
	{
		String emailRegex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
							
		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public static void main(String[] args)
	{
		ArrayList<String> address = new ArrayList<>();
		
			
		address.add("sample@xyz.com");
		address.add("sample.xyz.com");
			
		for(String i : address){
			if (isValid(i))
				System.out.println(i + " - email Valid");
			else
				System.out.println(i + " - email Invalid");
		}
	}
}
