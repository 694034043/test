package observe;

import java.util.Observable;
import java.util.Observer;

public class TaobaoObserver implements Observer {

	@Override
	public void update(Observable o, Object product) {
		// TODO Auto-generated method stub
		String newProduct = (String) product;
		System.out.println("taobao receive new product " + newProduct);
	}

}
