public class AbstractFactory2 extends AbstractFactory {
	public OP_StoreData getStoreData() {
		OP_StoreData sb = new OP_StoreData2();
		return sb;
	}

	public OP_DisplayMenu getDisplayMenu() {
		OP_DisplayMenu dm = new OP_DisplayMenu2();
		return dm;
	}

	public OP_DisplayBalance getDisplayBalance() {
		OP_DisplayBalance db = new OP_DisplayBalance2();
		return db;
	}

	public OP_MakeDeposit getMakeDeposit() {
		OP_MakeDeposit md = new OP_MakeDeposit2();
		return md;
	}

	public OP_MakeWithdraw getMakeWithdraw() {
		OP_MakeWithdraw mw = new OP_MakeWithdraw2();
		return mw;
	}

	public OP_NoFundsMsg getNoFundsMsg() {
		OP_NoFundsMsg nf = new OP_NoFundsMsg2();
		return nf;
	}

	public OP_Penalty getPenalty() {
		return null;
	}
}