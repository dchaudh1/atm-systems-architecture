public class AbstractFactory1 extends AbstractFactory {
	public OP_StoreData getStoreData() {
		OP_StoreData sb = new OP_StoreData1();
		return sb;
	}

	public OP_DisplayMenu getDisplayMenu() {
		OP_DisplayMenu dm = new OP_DisplayMenu1();
		return dm;
	}

	public OP_DisplayBalance getDisplayBalance() {
		OP_DisplayBalance db = new OP_DisplayBalance1();
		return db;
	}

	public OP_MakeDeposit getMakeDeposit() {
		OP_MakeDeposit md = new OP_MakeDeposit1();
		return md;
	}

	public OP_MakeWithdraw getMakeWithdraw() {
		OP_MakeWithdraw mw = new OP_MakeWithdraw1();
		return mw;
	}

	public OP_Penalty getPenalty() {
		OP_Penalty ip = new OP_Penalty1();
		return ip;
	}

	public OP_NoFundsMsg getNoFundsMsg() {
		OP_NoFundsMsg nf = new OP_NoFundsMsg1();
		return nf;
	}

}
