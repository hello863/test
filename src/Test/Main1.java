package Test;

abstract class Doctor {
	String name = "Dr";
	int id = 1;
	int exp = 5;
	double sal = 10;
	String esp = "cardiologist";

	abstract void doctor1();

	abstract void nurse1();
}

class Nurse extends Doctor {
	void doctor1() {
		System.out.println(name);
		System.out.println(esp);
	}

	void nurse1() {
		System.out.println("nurse output");
		System.out.println(sal + "" + exp);

	}
}

interface Staff {
	int total = 10;

	abstract void staff1();
}

class Emp implements Staff {

	@Override
	public void staff1() {

		System.out.println(total);

	}

}

public class Main1 {
	public static void main(String[] args) {
		Nurse icu = new Nurse();
		icu.doctor1();
		icu.nurse1();

		Emp op = new Emp();
		op.staff1();

	}
}
