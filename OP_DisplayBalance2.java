public class OP_DisplayBalance2 extends OP_DisplayBalance {
	public void displayBalance() {
		DataStore ds2 = new DataStore2();
		int bal = ds2.getBal2();
		System.out.println("Balance in ACCOUNT-2: " + bal);
	}
}