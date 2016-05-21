public class OP_Penalty1 extends OP_Penalty {
	public void penalty() {
		DataStore ds1 = new DataStore1();
		float b = ds1.getBal1();
		float bal = b - 20;
		ds1.setBal1(bal);
	}
}
