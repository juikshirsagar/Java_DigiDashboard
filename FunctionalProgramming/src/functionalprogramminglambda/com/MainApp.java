package functionalprogramminglambda.com;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		WelcomeMessageService welcomeMessageService = new WelcomeMessageService();

		Scanner userStatus = new Scanner(System.in);
		String status = userStatus.nextLine();
		
		Greeter greeter;
		if ("guest".equals(status)) {
			greeter = () -> System.out.println("Welcome to Applicatrion. Create account if new usee or log in !");

		} else if ("loggedIn".equals(status)) {
			greeter = () -> System.out.println("Happy To See You Again !!");

		} else {
			greeter = () -> System.err.println("Unknow user");

		}
		welcomeMessageService.greet(greeter);
	}

}
