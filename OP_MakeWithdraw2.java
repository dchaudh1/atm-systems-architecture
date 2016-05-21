public class OP_MakeWithdraw2 extends OP_MakeWithdraw {
	public void makeWithdraw() {
		DataStore dsTmp = new DataStoreTmp();
		int w = dsTmp.getW2();
		DataStore ds2 = new DataStore2();
		int b = ds2.getBal2();
		int bal = b - w;
		ds2.setBal2(bal);
	}
}