public class MDAEFSM {
	static int state = 0; // state=0=initial, 1=idle, 2=check pin, 3=s1,
							// 4=ready, 5=locked, 6=overdrawn, 7=suspended,
							// -1=closed
	static int attempts;
	StateMDA initial = new StateInitial();
	StateMDA idle = new StateIdle();
	StateMDA checkPin = new StateCheckPin();
	StateMDA s1 = new StateS1();
	StateMDA ready = new StateReady();
	StateMDA lock = new StateLocked();
	StateMDA overdrawn = new StateOverdrawn();
	StateMDA suspended = new StateSuspended();
	StateMDA statemda = new StateMDA();

	public void open() // done
	{
		initial.storeData();
		state = 1;
		printState();
	}

	public void login() // done
	{
		if (state == 1) {

			attempts = 0;
			state = 2;
		}
		printState();
	}

	public void incorrectLogin() // done
	{
		if (state == 1) {
			idle.incorrectIdMsg();
			state = 1;
		}
		printState();
	}

	public void correctPinAboveMin() // DONE
	{
		if (state == 2) {
			checkPin.correctPin();
			state = 4;
		}
		printState();
	}

	public void correctPinBelowMin() // DONE
	{
		if (state == 2) {
			checkPin.correctPin();
			state = 6;
		}
		printState();
	}

	public void incorrectPin(int max) // DONE
	{
		if (state == 2) {
			int a = max;
			if (attempts < a) {
				attempts++;
				checkPin.incorrectPin();
				state = 2;
			} else {
				attempts = 0;
				checkPin.tooManyAttempts();
				state = 1;
			}
		}
		printState();
	}

	public void belowMinBalance() // done
	{
		if (state == 3)
			state = 6;
		printState();
	}

	public void aboveMinBalance() // done
	{
		if (state == 3)
			state = 4;
		printState();
	}

	public void deposit() // done
	{
		if (state == 4) {
			ready.makeDeposit();
			state = 4;
		} else {
			if (state == 6) {
				overdrawn.makeDeposit();
				state = 3;
			}
		}
		printState();
	}

	public void withdraw() // done
	{
		if (state == 4) {
			ready.makeWithdraw();
			state = 3;
		} else if (state == 6) {
			overdrawn.noFundsMsg();
			state = 6;
		}
		printState();
	}

	public void noFunds() // done
	{
		if (state == 6) {
			overdrawn.noFundsMsg();
		} else if (state == 4) {
			ready.noFundsMsg();
		}
		printState();
	}

	public void balance() // done
	{
		if (state == 4)
			ready.displayBalance();
		else if (state == 6)
			overdrawn.displayBalance();
		else if (state == 7)
			suspended.displayBalance();
		printState();
	}

	public void close() // DONE
	{
		if (state == 7) {
			System.out.println("ACCOUNT CLOSED");
			state = -1;
			printState();
			System.exit(0);
		}
		
	}

	public void lock() // done
	{
		if (state == 4)
			state = 5;
		else {
			if (state == 6)
				state = 5;

		}
		printState();
	}

	public void incorrectlock() // done
	{
		if (state == 4)
			ready.incorrectLockMsg();
		else {
			if (state == 6)
				overdrawn.incorrectLockMsg();

		}
		printState();
	}

	public void unlock() // done
	{
		if (state == 5)
			state = 3;
		printState();
	}

	public void incorrectUnlock() // done
	{
		if (state == 5) {
			lock.incorrectUnlockMsg();
			state = 5;
		}
		printState();
	}

	public void withdrawBelowMinBalance() // done
	{
		if (state == 3) {
			s1.penalty();
			state = 6;
		}
		printState();
	}

	public void logout() // done
	{
		if (state == 2 || state == 4 || state == 6)
			state = 1;
		printState();
	}

	public void suspend() {
		if (state == 4)
			state = 7;
		printState();
	}

	public void activate() {
		if (state == 7)
			state = 4;
		printState();
	}

	public void printState() {
		System.out.println("State -> " + state);
	}
}
