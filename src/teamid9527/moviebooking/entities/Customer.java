package teamid9527.moviebooking.entities;

public class Customer {

	private Integer c_id;
	
	private String name;
	
	private String password;
	
	private String eamil;

	public Integer getC_id() {
		return c_id;
	}

	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", name=" + name + ", password="
				+ password + ", eamil=" + eamil + "]";
	}

	
	
	
	
}
