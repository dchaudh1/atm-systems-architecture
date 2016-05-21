public abstract class AbstractFactory {
	public abstract OP_StoreData getStoreData();

	public abstract OP_DisplayMenu getDisplayMenu();

	public abstract OP_DisplayBalance getDisplayBalance();

	public abstract OP_MakeDeposit getMakeDeposit();

	public abstract OP_MakeWithdraw getMakeWithdraw();

	public abstract OP_NoFundsMsg getNoFundsMsg();

	public abstract OP_Penalty getPenalty();
}
