public class Product{
		int price;
		int pcode;
		String pname;	
	public static void main(String []args)
	{	
		Product ob1=new Product();
		Product ob2=new Product();
		Product ob3=new Product();
		ob1.price=10;
		ob1.pcode=1;
		ob1.pname="pen";
		
		ob2.price=5;
		ob2.pcode=2;
		ob2.pname="pencil";
		
		ob3.price=40;
		ob3.pcode=3;
		ob3.pname="book";
		System.out.println("PRODUCT1 DETAILS");
		System.out.println("The price of product1 is :"+ob1.price);
		System.out.println("The code of product1 is:"+ob1.pcode);
		System.out.println("The name of the product1 is:"+ob1.pname);
		System.out.println("PRODUCT2 DETAILS");
		System.out.println("The price of product2 is :"+ob2.price);
		System.out.println("The code of product2 is:"+ob2.pcode);
		System.out.println("The name of the product2 is:"+ob2.pname);
		System.out.println("PRODUCT3 DETAILS");
		System.out.println("The price of product3 is :"+ob3.price);
		System.out.println("The code of product3 is:"+ob3.pcode);
		System.out.println("The name of the product3 is:"+ob3.pname);
		
		if(ob1.price<ob2.price && ob1.price<ob3.price)
		{
		System.out.println("The lowest price is for product1:"+ob1.pname);
		}
		else if(ob2.price<ob1.price&&ob2.price<ob3.price)
		{
		System.out.println("The lowest price is for product2 :"+ob2.pname);
		}
		else
		{
		System.out.println("The lowest price is for product3:"+ob3.pname);
		}
	}
}
