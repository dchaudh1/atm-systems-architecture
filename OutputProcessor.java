public class OutputProcessor {
	DataStore dsTmp = new DataStoreTmp();
	AbstractFactory1 af1 = new AbstractFactory1();
	AbstractFactory2 af2 = new AbstractFactory2();

	public void storeData() // DONE
	{
		OP_StoreData sd;
		int acct = dsTmp.getAccount();
		if (acct == 1) {
			sd = af1.getStoreData();
			sd.storeData();
		}
		if (acct == 2) {
			sd = af2.getStoreData();
			sd.storeData();
		}
	}

	public void incorrectIdMsg() // DONE
	{
		System.out.println("Incorrect User ID Entered!");
	}

	public void promptForPin() // DONE
	{
		System.out.println("Enter your PIN: \t");
	}

	public void displayMenu() // DONE
	{
		OP_DisplayMenu dm;
		int acct = dsTmp.getAccount();
		if (acct == 1) {
			dm = af1.getDisplayMenu();
			dm.displayMenu();
		}
		if (acct == 2) {
			dm = af2.getDisplayMenu();
			dm.displayMenu();
		}

	}

	public void displayBalance() // done
	{
		OP_DisplayBalance dispBal;
		int acct = dsTmp.getAccount();
		if (acct == 1) {
			dispBal = af1.getDisplayBalance();
			dispBal.displayBalance();
		}
		if (acct == 2) {
			dispBal = af2.getDisplayBalance();
			dispBal.displayBalance();
		}

	}

	public void incorrectPinMsg() // DONE
	{
		System.out.println("Incorrect PIN Entered!");
	}

	public void tooManyAttemptsMsg() // DONE
	{
		System.out.println("Incorrect PIN Entered Too Many Times!");
	}

	public void makeDeposit() // done
	{
		OP_MakeDeposit d;
		int acct = dsTmp.getAccount();
		if (acct == 1) {
			d = af1.getMakeDeposit();
			d.makeDeposit();
		}
		if (acct == 2) {
			d = af2.getMakeDeposit();
			d.makeDeposit();
		}
	}

	public void makeWithdraw() // done
	{
		OP_MakeWithdraw w;
		int acct = dsTmp.getAccount();
		if (acct == 1) {
			w = af1.getMakeWithdraw();
			w.makeWithdraw();
		}
		if (acct == 2) {
			w = af2.getMakeWithdraw();
			w.makeWithdraw();
		}
	}

	public void noFundsMsg() // done
	{
		OP_NoFundsMsg nf;
		int acct = dsTmp.getAccount();
		if (acct == 1) {
			nf = af1.getNoFundsMsg();
			nf.noFundsMsg();
		}
		if (acct == 2) {
			nf = af2.getNoFundsMsg();
			nf.noFundsMsg();
		}
	}

	public void penalty() // done
	{

		OP_Penalty p;
		int acct = dsTmp.getAccount();
		if (acct == 1) {
			p = af1.getPenalty();
			p.penalty();
		}
		if (acct == 2) {
			p = af2.getPenalty();
			p.penalty();
		}

	}

}
