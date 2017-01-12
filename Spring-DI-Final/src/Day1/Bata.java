package Day1;

public class Bata implements Shoe{

	String name;
	
	public Bata(){
		this.name = "None";
		System.out.println("Creating Bata Shoes");
	}
	
	public Bata(String name){
		this.name = name;
		System.out.println("Creating Bata Shoes");
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public void makeShoeComfortable() {
		// TODO Auto-generated method stub
		System.out.println("Making feet comfortable since 1921");
		
	}

	@Override
	public void makeShoeLookGood() {
		System.out.println("Making Shoe Look Good since 1827");
		
	}

	@Override
	public void setPrice(int price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
