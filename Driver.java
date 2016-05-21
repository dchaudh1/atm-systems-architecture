import java.io.*;

public class Driver {

	public static void main(String[] args) {
		try {
			System.out.println("SELECT AN ACCOUNT");
			System.out.println("1 ACCOUNT-1");
			System.out.println("2 ACCOUNT-2");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			int ch = Integer.parseInt(br.readLine());
			switch (ch) {
			case 1:
				System.out.println("ACCOUNT-1 SELECTED");
				Account1 a1 = new Account1();
				a1.execAccount1();
				break;
			case 2:
				System.out.println("ACCOUNT-2 SELECTED");
				Account2 a2 = new Account2();
				a2.execAccount2();
				break;
			default:
				System.out.println("Incorrect choice");
			}
		} catch (Exception e) {
			System.out.println("EXCEPTION" + e);
		}

	}

}
