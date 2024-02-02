package test1;


class Emp1{
	static String companyName="SDAC";
	double sal=123475;
	void info(){
		int a = 12;
		String name ="aliza";
		
		System.out.println(a+" "+name);
	}
}
public class Main4 {
	public static void main(String[] args) {
		
	
	Emp1 e = new Emp1();
	System.out.println(Emp1.companyName);
	System.out.println(e.sal);
	e.info();
	}

}
