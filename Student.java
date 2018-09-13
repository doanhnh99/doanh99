

public class Student {
	private String name;
	private String ID;
	private String group;
	private String email;
	
	Student()
	{
		name = "Student";
		ID = "000";
		group = "K59CB";
		email = "uet@vnu.edu.vn";
	}

	Student(String n, String sid, String em)
	{
		name = n;
		ID = sid;
		email = em;
	}

	Student(Student s)
	{
		name = s.name;
		ID = s.ID;
		group = s.group;
		email = s.email;
	}

	public void setName(String _name)
	{
		name = _name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setID(String _ID)
	{
		ID = _ID;
	}
	
	public String getID()
	{
		return ID;
	}
	
	public void setGroup(String _group)
	{
		group = _group;
	}
	
	public String getGroup()
	{
		return group;
	}
	
	public void setEmail(String _email)
	{
		email = _email;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	
	
	public void getInfo()
	{
		System.out.println(name);
		System.out.println(ID);
		System.out.println(group);
		System.out.println(email);
	}

	void print_Constructor()
	{
		System.out.println("Name: " + name + ", ID = " + ID + ", Group = " + group + ", Email = " + email);
	}
		
	}
