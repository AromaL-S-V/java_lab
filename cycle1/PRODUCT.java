package tkm;

class Check{
	String pcode;
	String pname;
	int price;
	
	Check(String pcode, String pname, int price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }
	
	public  void display() {
		System.out.println("Product_CODE: "+pcode);
		System.out.println("Product_NAME: "+pname);
		System.out.println("Product_PRICE: "+price);
		System.out.println();
	}
}

public class PRODUCT {
	
	

	public static void main(String[] args) {
		Check p1 = new Check("P1", "IPHONE", 8000);
		Check p2 = new Check("P2", "CYCLE", 5500);
		Check p3 = new Check("P3", "SMART_TV", 10000);
		
		System.out.println("Product Details:");
        p1.display();
        p2.display();
        p3.display();
        
        if(p1.price<p2.price && p1.price<p3.price) {
        	System.out.println("Lowest Price: "+p1.price);
        }
        else if(p2.price<p1.price && p2.price<p3.price) {
        	System.out.println("Lowest Price: "+p2.price);
        }
        else {
        	System.out.println("Lowest Price: "+p3.price);
        }

	}

}
