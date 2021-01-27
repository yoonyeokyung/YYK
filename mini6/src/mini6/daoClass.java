package mini6;

public class daoClass {
	
	private dtoClass[] hair;
	public daoClass(dtoClass[] hair) {
		this.hair = hair;
	}
	
	public void getPrice() {
		for(int i = 0; i < hair.length; i++) {
			System.out.println(hair[i].getPrice());
		}
	}
		
		
	public void display() {
		System.out.println("========================");
		for (int i = 0; i < hair.length; i++) {
			System.out.print(hair[i].getPrice() + "\t");
			System.out.print(hair[i].getStyle() + "\t");
		}
	
	}
}	

