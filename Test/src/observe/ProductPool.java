package observe;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ProductPool extends Observable {
	
	private List<String> productList = null;
	
	private static ProductPool instance;
			
	private ProductPool() {}
	
	public static ProductPool getInstance() {
		if (instance == null) {
			instance = new ProductPool();
			instance.productList = new ArrayList<String>();
		}
		return instance;
	}
	
	public void addProductObserver(Observer ob) {
		this.addObserver(ob);
	}
	
	public void addProduct(String newProduct) {
		System.out.println("new product...");
		productList.add(newProduct);
		this.setChanged();
		this.notifyObservers(newProduct);
		
	}
	
	public static void main(String[] args) {
		TaobaoObserver to = new TaobaoObserver();
		ProductPool pool = ProductPool.getInstance();
		pool.addProductObserver(to);
		pool.addProduct("Adidas shoe");
	}

}
