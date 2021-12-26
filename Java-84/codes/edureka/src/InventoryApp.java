
public class InventoryApp {

	public static void main(String[] args) {
		Product prod = new Product();
		
		prod.setProductId(101L);
		prod.setProductName("Mouse");
		prod.setProductPrice(275.75f);
		
		//System.out.println("Product["+prod.getProductId()+" | "+prod.getProductName()+" | "+prod.getProductPrice()+"]");
		System.out.println("class type ---> " + prod.getClass().getName());
		System.out.println(prod); //toString()
	}
}
