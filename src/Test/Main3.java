package Test;


class Emp1 {
	int id = 20;
	double sal = 10000;
	static int id1 = 40;
	static double sal1 = 40000;

	void meth() {
		System.out.println("non-static");
		System.out.println(id);
		System.out.println(sal);
	}
	
	static void meth1(){
		System.out.println("static");
		System.out.println(id1);
		System.out.println(sal1);
	}
}

public class Main3 {
	public static void main(String[] args) {
		Emp1 obj = new Emp1();
		obj.meth();
		Emp1.meth1();
	}
}
