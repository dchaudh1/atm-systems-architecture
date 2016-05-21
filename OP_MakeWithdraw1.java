public class OP_MakeWithdraw1 extends OP_MakeWithdraw {
	public void makeWithdraw() {
		DataStore dsTmp = new DataStoreTmp();
		float w = dsTmp.getW1();
		DataStore ds1 = new DataStore1();
		float b = ds1.getBal1();
		float bal = b - w;
		ds1.setBal1(bal);
	}
}
