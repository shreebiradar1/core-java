package objectComplexity;

public class Student {
	private String name;
	private String email;
	private String mobile;
	private String branch;
	
	private Address address = new Address();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getBranch() {
		return branch;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", mobile=" + mobile + ", branch=" + branch + ", address="
				+ address + "]";
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

}
