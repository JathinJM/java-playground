
public class Person {
private String name;
private String rollNumber;

public Person(String name,String rollNumber) {
	this.name = name;
	this.rollNumber = rollNumber;
}
public String getName() {
	return this.name;
}
public String toString() {
	return "name:"+ this.name +"," + "rollNumber:" + this.rollNumber;
}
}
