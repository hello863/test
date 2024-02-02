package Test;

class Info{
	String name;
	int id;
	double sal;
	String address;
	public Info(String name, int id, double sal, String address) {
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Info [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}
	
	
}


public class Main2 {
	public static void main(String[] args) {
		Info obj = new Info("Java",10,100000,"Mumbai");
		System.out.println(obj);
	}
}
