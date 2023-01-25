
public class Person {
	//필드
	private String ssn;
	private String name;
	private String address;
	//생성자
	public Person() {}
	public Person(String ssn, String name, String address) {
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
	//getter
	public String getSsn() {
		return ssn;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	//setter
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
