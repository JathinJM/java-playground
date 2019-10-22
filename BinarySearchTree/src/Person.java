
public class Person {
	private String name;
	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		return "name:" + this.name + "," + "age:" + this.age;
	}
}