package test1;


class Emp{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
}
public class Main1 {
public static void main(String[] args) {
	Emp e = new Emp(12, "aliza");
	System.out.println(e);
}
}