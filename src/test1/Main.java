package test1;

class Company{
	static String companyName;
	int id;
	String staffName ;
	
	static void dispaly(String companyName){
		System.out.println(companyName);
	}
	void show(int id , String staffName){
		System.out.println(id+" "+staffName);
	}
}
public class Main {
	public static void main(String[] args) {
		Company c = new Company();
		c.show(12, "aliza");
		Company.dispaly(" SDAC");
	  
	}

}
