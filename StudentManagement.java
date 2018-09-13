//import java.util.Scanner;

public class StudentManagement {
	static int n = 3;
	static Student SV[] = new Student[100];
	public static void main(String [] args)
	{
		Student Obj1 = new Student();
		Obj1.setName("Nguyen Hong Doanh");
		Obj1.setID("17020637");
		Obj1.setEmail("doanhnh0801@gmail.com");
		Obj1.setGroup("OOP INT2205 10");
		Obj1.getInfo();

		Student Obj2 = new Student();
		Obj2.print_Constructor();

		Student Obj3 = new Student("Maria", "17020352", "uetVip@gmail.com");
		Obj3.print_Constructor();

		Student Obj4 = new Student("Ngoc Trinh", "690436", "uet@vnugmail.com");
		Student Obj5 = new Student(Obj4);
		Obj5.print_Constructor();

		Student SV1 = new Student();
		SV1.setName("Doanh Nguyen");
		SV1.setID("17020637");
		SV1.setGroup("HrTech");
		SV1.setEmail("doanhnh0801@gmail.com");
		//System.out.println("Thong tin cua sinh vien 1");
		//SV1.getInfo();
		
		Student SV2 = new Student();
		SV2.setName("Peter Parker");
		SV2.setID("17020969");
		SV2.setGroup("OOP");
		SV2.setEmail("hathachhuong@gmail.com");

		Student SV3 = new Student();
		SV3.setName("Thor");
		SV3.setID("17021234");
		SV3.setGroup("Advenger");
		SV3.setEmail("thor@gmail.com");

		if (sameGroup(SV1, SV2) == true){
			System.out.println("SV1 & SV2 cung lop");
		}
		else System.out.println("SV1 & SV2 khac lop");

		
	}

	static boolean sameGroup(Student s1, Student s2) {
		if (s1.getGroup() == s2.getGroup()) return true;
		else return false;
	}

	public void studentsByGroup(String _group)
	{
		
		for (int i = 0; i < n; i++)
		{
			if (SV[i].getGroup() == _group)
			{
				System.out.println(SV[i].getGroup());
			}
		}
	}

	static void removeStudent(String id)
	 {
		 for (int i = 0; i < n; i++)
		 {
			 if (SV[i].getID() == id)
			 {
				 for (int j = i; j < n; j++)
				 {
					 SV[j] = SV[j + 1];
				 }
				 n--;
				 i--;
			 }
		 }
	 }
}
