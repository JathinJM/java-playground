
public class PersonQ {
private String name;
private String rollNumber;

public PersonQ(String name,String rollNumber) {
	this.name = name;
	this.rollNumber = rollNumber;
}

public String toString() {
	return "name:"+ this.name +"," + "rollNumber:" + this.rollNumber;
}
}
