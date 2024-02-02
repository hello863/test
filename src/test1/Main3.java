package test1;



class Teacher {
	String name;
	double sal;
	int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

public class Main3 {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setName("aliza");
		System.out.println(t.getName());
		t.setSal(12456);
		System.out.println(t.getSal());
		t.setId(12);
		System.out.println(t.getId());
	}
}
