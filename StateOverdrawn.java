public class StateOverdrawn extends StateMDA {
	public void makeDeposit() {
		op.makeDeposit();
	}

	public void displayBalance() {
		op.displayBalance();
	}

	public void incorrectLockMsg() {
		op.incorrectPinMsg();
	}

	public void noFundsMsg() {
		op.noFundsMsg();
	}

}
