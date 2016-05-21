public class OP_DisplayBalance1 extends OP_DisplayBalance {
	public void displayBalance() {
		DataStore ds1 = new DataStore1();
		float bal = ds1.getBal1();
		System.out.println("Balance in ACCOUNT-1: " + bal);
	}
}
