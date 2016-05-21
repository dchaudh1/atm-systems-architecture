public class OP_StoreData2 extends OP_StoreData {
	public void storeData() {
		DataStore dsTmp = new DataStoreTmp();
		int p = dsTmp.getTmpPin2();
		int y = dsTmp.getTmpUID2();
		int a = dsTmp.getTmpBal2();
		DataStore ds2 = new DataStore2();
		ds2.setPin2(p);
		ds2.setUID2(y);
		ds2.setBal2(a);
	}

}