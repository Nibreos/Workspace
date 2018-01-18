public class Personalinfo{
	private String name;
	private String address;
	private int age;
	private String phoneNumber;

	public String getname() {
		return name;

	}
	public String getaddress() {
		return address;

	}
	public String getage() {
		return age;

	}
	public String getphoneNumber() {
		return phoneNumber;

	}




	public void setname( String namegiven ) {
		name = namegiven;
	}

	public void setaddress( String addressgiven ) {
		address = addressgiven;
	}

	public void setage( int agegiven ) {
		age = agegiven;
	}


	public void setphoneNumber( String phoneNumbergiven ) {
		phoneNumber = phoneNumbergiven;
	}

	public Personalinfo() {
		name = "";
		address = "";
		age = "100";
		phoneNumber = "1-800-565-3003";
	}


}