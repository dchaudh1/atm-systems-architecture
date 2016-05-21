public class StateReady extends StateMDA {
	public void makeDeposit() {
		op.makeDeposit();
	}

	public void makeWithdraw() {
		op.makeWithdraw();
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