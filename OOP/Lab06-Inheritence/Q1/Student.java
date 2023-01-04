class Student {
protected String name;
protected String ditno;
protected String address;

Student(String name,String ditno,String address){
	this.name=name;
	this.ditno=ditno;
	this.address=address;
}
public void displayStudent(){ 
System.out.println("\nStudentName : "+name);
System.out.println("ditno : "+ditno);  
System.out.println("Address : "+address);
}
}
