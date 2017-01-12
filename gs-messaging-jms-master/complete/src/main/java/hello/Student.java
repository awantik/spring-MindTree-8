package hello;

public class Student {
	
	String name;
	
	String age;

	public Student(){
		
	}
	
	public Student(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
    public String toString() {
        return String.format("Student{name=%s, age=%s}", getName(), getAge());
    }

}
