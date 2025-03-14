package ch06.shop;

public class ShoppingCartMain {
	public static void main(String[] args) {
		Item item1 = new Item("상추 ",2000,2);
		Item item2 = new Item("고기 " , 3000,4);
		
		ShoppingCart shoppingCart = new ShoppingCart();
		
		shoppingCart.addCart(item1);
		shoppingCart.addCart(item2);
		
		shoppingCart.displayItems();
	}

}
