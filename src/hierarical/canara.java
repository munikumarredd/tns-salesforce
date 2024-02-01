package hierarical;

public class canara extends RBI {
	private String headquarters;
	private int customers;
	public canara() {
		super();
	}
	public canara(int bankid, String address,String headquarters,int customers) {
		super(bankid, address);
		this.headquarters = headquarters;
		this.customers = customers;
	}
	public String getHeadquarters() {
		return headquarters;
	}
	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}
	public int getCustomers() {
		return customers;
	}
	public void setCustomers(int customers) {
		this.customers = customers;
	}
	@Override
	public String toString() {
		return "canara [headquarters=" + headquarters + ", customers=" + customers + ", toString()=" + super.toString()
				+ "]";
	}

}
