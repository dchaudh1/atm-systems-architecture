public class StateCheckPin extends StateMDA {
	public void incorrectPin() {
		op.incorrectPinMsg();
	}

	public void tooManyAttempts() {
		op.tooManyAttemptsMsg();
	}

	public void correctPin() {
		op.displayMenu();
	}

}
