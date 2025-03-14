package ch06.shop;

public class ShoppingCart {
	
	private Item[] item = new Item[10];
	
	private int itemCount;
	
	public void addCart(Item it) {
		if(itemCount >= 10 ) {
			System.out.println("장바구니가 가득 찼습니다");
			return;
		}
		
		item[itemCount] = it;
		itemCount++;
	}
	
	public void displayItems() {
		System.out.println("장바구니 상품 출력");
		
		for(int i =0; i< itemCount ; i++) {
			Item it = item[i];
			System.out.println("상품 : " + it.getName() + "가격 " + it.getTotal()) ;
		}
		System.out.println("전체 합계 출력 : " + addTotal());
	}
	
	private int addTotal() {
		int total = 0;
		for(int i =0; i< itemCount ; i++) {
			Item it = item[i];
			total +=it.getTotal();
		}
		return total;
		
		
	}
	

}
