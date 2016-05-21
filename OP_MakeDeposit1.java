public class OP_MakeDeposit1 extends OP_MakeDeposit {
	public void makeDeposit() {
		DataStore dsTmp = new DataStoreTmp();
		float d = dsTmp.getD1();
		DataStore ds1 = new DataStore1();
		float b = ds1.getBal1();
		float bal = b + d;
		ds1.setBal1(bal);
	}
}
