public class OP_StoreData1 extends OP_StoreData {
	public void storeData() {
		DataStore dsTmp = new DataStoreTmp();
		String p = dsTmp.getTmpPin1();
		String y = dsTmp.getTmpUID1();
		float a = dsTmp.getTmpBal1();
		DataStore ds1 = new DataStore1();
		ds1.setPin1(p);
		ds1.setUID1(y);
		ds1.setBal1(a);
	}
}