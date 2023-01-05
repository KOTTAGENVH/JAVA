public class Student extends Person {
  String Stid;
  public Student(String newName, String newAddress,String newStid) {
	super(newName,newAddress);
	Stid=newStid;
  }
  public void showDetails() {
	  super.showDetails();
	  System.out.println(" My ID is "+ Stid);
  }
  }

