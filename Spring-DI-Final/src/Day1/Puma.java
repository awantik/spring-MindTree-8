package Day1;

public class Puma implements Shoe{

	public Puma(){
		System.out.println("Creating Puma Shoe");
	}
	
	@Override
	public void makeShoeComfortable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeShoeLookGood() {
		System.out.println("How can Puma do without style");
		
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

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
