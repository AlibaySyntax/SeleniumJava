package syntax14ObjectAndClasss;
import java.util.Scanner;
public class StringPassword {

	public static void main(String[] args) {
		System.out.println("=============Home Work==March14-2020=======================================");
		/*
		 *Accept username, password and confirm password from a user and check following requirements:
		 * 
		 * Username and Password cannot be  empty, if so→ message="Username and Password cannot be empty".
		 * Password should be minimum 8 characters, if less → message="Password is too short".
		 * Password cannot contain username if so, → message="Password cannot contain username".
		 * Password should match confirmed password, if not  → message="Passwords do not match".
		 *
		 * Only after all requirements met → message "Your username and password has been created"
		 */
		Scanner sc = new Scanner(System.in);
		String userName;
		String password;
		String str1 = "Please create your user name";
		String str2 = "Please enter your password";
		String str3 = "Confirm your password";
		String message1 = "Username and Password cannot be empty";
		String message2 = "Password is too short";
		String message3 = "Password cannot contains username";
		String message4 = "Password do not match";
		String messageFinal = "Your username & password has been created";
		String print = null;
do {
			System.out.println(str1);
			userName = sc.nextLine();
			System.out.println(str2);
			password = sc.nextLine();
			if (!((userName.isEmpty()) || password.isEmpty())) {
				if (password.length() >= 8) {
					if (!(password.trim().contains(userName))) {
						System.out.println(str3);
						password = sc.nextLine();
						if (password.equals(password)) {
							print = messageFinal;
						} else {
							print = message4;
						}
					} else {
						print = message3;
					}
				} else {
					print = message2;
				}
			} else {
				print = message1;
			}
			System.out.println(print);
		} while (!print.equals(messageFinal));
}}

