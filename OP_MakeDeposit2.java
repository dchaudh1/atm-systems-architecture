public class OP_MakeDeposit2 extends OP_MakeDeposit {
	public void makeDeposit() {
		DataStore dsTmp = new DataStoreTmp();
		int d = dsTmp.getD2();
		DataStore ds2 = new DataStore2();
		int b = ds2.getBal2();
		int bal = b + d;
		ds2.setBal2(bal);
	}
}
