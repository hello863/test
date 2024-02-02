package Test;


class Students {
	
	int id ;
	int rollno ;
			
	void StudentInfo(int id) {
		System.out.println(id);
	}

	void StudentInfo(int id, int rollno){
		System.out.println(id+" "+rollno);
	}
	
}

class Teacher extends Students{
	@Override
	void StudentInfo(int id, int rollno) {
		System.out.println(id+""+rollno);
	}
}

public class Main {
	public static void main(String[] args) {
		Students classroom = new Students();
		classroom.StudentInfo(10);
		classroom.StudentInfo(10, 20);
		
		Teacher staffroom = new Teacher();
		staffroom.StudentInfo(10	, 20);
	}
}
