import java.io.*;

public class Account2 {
	public void execAccount2() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			MDAEFSM mdaefsm = new MDAEFSM();
			String input;
			int s, account = 2;
			while (true) {
				System.out.println("Operations for ACCOUNT-2: \n");
				System.out
						.println(" 0) OPEN \n 1) PIN \n 2) DEPOSIT \n 3) WITHDRAW\n 4) BALANCE \n 5) LOGIN \n 6) LOGOUT \n 7) suspend \n 8) activate \n 9) close \n");
				input = br.readLine();
				s = Integer.parseInt(input);
				switch (s) {
				case 0: // open
					int p,
					y;
					int a;
					System.out.println("Enter User PIN: \t");
					p = Integer.parseInt(br.readLine());
					System.out.println("Enter User ID: \t");
					y = Integer.parseInt(br.readLine());
					System.out.println("Enter Account Balance: \t");
					a = Integer.parseInt(br.readLine());
					DataStore dsTmp1 = new DataStoreTmp();
					dsTmp1.setTmpPin2(p);
					dsTmp1.setTmpUID2(y);
					dsTmp1.setTmpBal2(a);
					dsTmp1.setAccount(account);
					mdaefsm.open();
					break;

				case 1: // Pin
					System.out.println("Enter User PIN: \t");
					int p1 = Integer.parseInt(br.readLine());
					DataStore d1 = new DataStore2();
					int pin1 = d1.getPin2();
					int bal1 = d1.getBal2();

					if (pin1 == p1) {
						if (bal1 > 0)
							mdaefsm.correctPinAboveMin();
					} else
						mdaefsm.incorrectPin(2);
					break;

				case 2: // Deposit
					System.out.println("Enter the Amount to be Deposited: \t");
					int d = Integer.parseInt(br.readLine());
					DataStore dsTmp2 = new DataStoreTmp();
					dsTmp2.setD2(d);
					mdaefsm.deposit();
					break;

				case 3: // Withdraw
					System.out.println("Enter the Amount to be Withdrawn: \t");
					int w = Integer.parseInt(br.readLine());
					DataStore dsTmp3 = new DataStoreTmp();
					dsTmp3.setW2(w);
					DataStore d3 = new DataStore2();
					int bal3 = d3.getBal2();
					if (bal3 > 0) {
						mdaefsm.withdraw();
						mdaefsm.aboveMinBalance();
					} else
						mdaefsm.noFunds();
					break;

				case 4: // balance
					mdaefsm.balance();
					break;

				case 5: // login
					System.out.println("Enter User ID: \t");
					int y1 = Integer.parseInt(br.readLine());
					DataStore d6 = new DataStore2();
					int uid1 = d6.getUID2();
					if (uid1 == y1)
						mdaefsm.login();
					else
						mdaefsm.incorrectLogin(); // done
					break;

				case 6: // logout
					mdaefsm.logout(); // done
					break;

				case 7: // Suspend
					mdaefsm.suspend(); // done
					break;

				case 8: // Activate
					mdaefsm.activate(); // done
					break;

				case 9: // Close
					mdaefsm.close(); // done

				default:
					System.out.println("Incorrect choice");
				}

			}

		} catch (Exception e) {
			System.out.println("EXCEPTION:" + e);
		}
	}
}
