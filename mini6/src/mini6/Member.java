package mini6;



public class Member {
	
		
public static void main(String[] args) {
	
	dtoClass[] hair = new dtoClass[7];
	
	hair[0] = new dtoClass(10000, "Shampoo");
	hair[0] = new dtoClass(25000, "Cut");
	hair[0] = new dtoClass(30000, "Dry");
	hair[0] = new dtoClass(110000, "Perm");
	hair[0] = new dtoClass(110000, "Color");
	hair[0] = new dtoClass(70000, "TreatMent");
	hair[0] = new dtoClass(130000, "HeadSpa");
	
	daoClass dao = new daoClass(hair);
	
	dao.getPrice();
	dao.display();




}
	


}

