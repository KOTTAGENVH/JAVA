
public class Test {
public static void main(String[]args) {
	//Student s1 = new Student("NOWEN","STU123","Pannipitiya");
	
	//System.out.println("Name: "+s1.name+"\nDitNo : "+s1.ditno+"\nAddress : "+s1.address);

/*s1.setName("Nimal");
s1.setDitno("IT567");
s1.setAddress("colombo");
System.out.println("Name : "+s1.getName()+"\nDitNo : "+s1.getDitno() + "\nAddress : "+s1.getAddress());
*/
	Student s1 = new Student();
	s1.setName("Nimal");
	s1.setDitno("IT567");
	s1.setAddress("colombo");
	System.out.println(s1.getDetails());
}
}
