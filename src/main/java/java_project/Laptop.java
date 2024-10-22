package java_project;

public enum Laptop {
	
	

Dell(200) ,Apple(500);


private int price;

	
	public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}


	private Laptop(int price) {
	
	this.price=price;
}


public static void main (String[] args) {
	
	
	Laptop l = Laptop.Dell;
	
	System.out.println(l);
	
	int p =l.getPrice();
	
	System.out.println(p);
	
	
	for(Laptop li: Laptop.values()) {
		
		
		System.out.println(li+ " "+li.getPrice());
	}



}


}
