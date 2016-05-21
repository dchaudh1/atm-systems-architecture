import java.io.*;

public class Account1 {
	public void execAccount1() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			MDAEFSM mdaefsm = new MDAEFSM();
			String input;
			int s, account = 1;
			while (true) {
				System.out.println("Operations for ACCOUNT-1: \n");
				System.out
						.println(" 0) open \n 1) pin \n 2) deposit \n 3) withdraw \n 4) balance \n 5) login \n 6) logout \n 7) lock \n 8) unlock \n");
				input = br.readLine();
				s = Integer.parseInt(input);
				switch (s) {
				case 0: // open
					String p,
					y;
					float a;
					System.out.println("Enter User PIN: \t");
					p = br.readLine();
					System.out.println("Enter User ID: \t");
					y = br.readLine();
					System.out.println("Enter Account Balance: \t");
					a = Float.parseFloat(br.readLine());
					DataStore dsTmp1 = new DataStoreTmp();
					dsTmp1.setTmpPin1(p);
					dsTmp1.setTmpUID1(y);
					dsTmp1.setTmpBal1(a);
					dsTmp1.setAccount(account);
					mdaefsm.open(); // done
					break;

				case 1: // Pin
					System.out.println("Enter User PIN: \t");
					String p1 = br.readLine();
					DataStore d1 = new DataStore1();
					String pin1 = d1.getPin1();
					float bal1 = d1.getBal1();

					if (pin1.equals(p1)) {
						if (bal1 < 500)
							mdaefsm.correctPinBelowMin(); // done
						else
							mdaefsm.correctPinAboveMin(); // done
					} else
						mdaefsm.incorrectPin(3); // done
					break;

				case 2: // Deposit
					System.out.println("Enter the Amount to be Deposited: \t");
					float d = Float.parseFloat(br.readLine());
					DataStore dsTmp2 = new DataStoreTmp();
					dsTmp2.setD1(d);
					mdaefsm.deposit();
					DataStore d2 = new DataStore1();
					float bal2 = d2.getBal1();
					if (bal2 < 500)
						mdaefsm.withdrawBelowMinBalance(); // done
					else
						mdaefsm.aboveMinBalance(); // done
					break;

				case 3: // Withdraw
					System.out.println("Enter the Amount to be Withdrawn: \t");
					float w = Float.parseFloat(br.readLine());
					DataStore dsTmp3 = new DataStoreTmp();
					dsTmp3.setW1(w);
					DataStore d3 = new DataStore1();
					float bal3 = d3.getBal1();
					if ((bal3 - w) > 0) {
						mdaefsm.withdraw();

						float bal4 = d3.getBal1();
						if (bal4 < 500)
							mdaefsm.withdrawBelowMinBalance(); // done
						else
							mdaefsm.aboveMinBalance(); // done
					} else
						mdaefsm.noFunds();
					break;

				case 4: // balance
					mdaefsm.balance(); // done
					break;

				case 5: // login
					System.out.println("Enter User ID: \t");
					String y1 = br.readLine();
					DataStore d6 = new DataStore1();
					String uid1 = d6.getUID1();
					if (uid1.equals(y1))
						mdaefsm.login(); // done
					else
						mdaefsm.incorrectLogin(); // done
					break;

				case 6: // logout
					mdaefsm.logout(); // done
					break;

				case 7: // Lock
					System.out.println("Enter User PIN: \t");
					String p2 = br.readLine();
					DataStore d4 = new DataStore1();
					String pin2 = d4.getPin1();
					if (pin2.equals(p2))
						mdaefsm.lock();
					else
						mdaefsm.incorrectlock();
					break;

				case 8: // Unlock
					System.out.println("Enter User PIN \t");
					String p3 = br.readLine();
					DataStore d5 = new DataStore1();
					String pin3 = d5.getPin1();
					float bal4 = d5.getBal1();
					if (pin3.equals(p3)) {
						mdaefsm.unlock();
						if (bal4 < 500)
							mdaefsm.belowMinBalance();
						else
							mdaefsm.aboveMinBalance();
					} else
						mdaefsm.incorrectUnlock();
					break;

				default:
					System.out.println("Incorrect choice");
				}

			}

		} catch (Exception e) {
			System.out.println("EXCEPTION:" + e);
		}
	}
}
