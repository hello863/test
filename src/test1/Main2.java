package test1;

class Accounts{
	void sal(double sal){
		System.out.println(sal);
	}
	void sal(double sal,int tax){
		System.out.println(sal+tax);
	}
}
class Manager extends Accounts{
	@Override
	void sal(double sal, int tax) {
System.out.println(sal+tax);
	}
}
public class Main2 {
	public static void main(String[] args) {
		Accounts a = new Accounts();
		a.sal(127723);
		a.sal(122, 125420);
		Manager m = new Manager();
		m.sal(14252, 525);
	}

}

