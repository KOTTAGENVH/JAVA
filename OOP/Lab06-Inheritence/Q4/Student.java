
public class Student {
		 String name;
		 String ditno;
		 String address;

	/*	Student(String Newname,String Newditno,String Newaddress){
			name=Newname;
			ditno=Newditno;
			address=Newaddress;
		}*/
		//mutator methods &accessor methods

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDitno() {
			return ditno;
		}

		public void setDitno(String ditno) {
			this.ditno = ditno;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		String getDetails() {
			String s = "I am a Student.\nMy name is "+getName()+"I am from "+getAddress()+"\nMy dit no is " +getDitno();
			return s;
		}
		
}
