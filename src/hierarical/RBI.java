package hierarical;

public class RBI {
	private int bankid;
	private String address;
	public RBI() {
		System.out.println("RBI is created");
	}
	public RBI(int bankid, String address) {
		super();
		this.bankid = bankid;
		this.address = address;
	}
	public int getBankid() {
		return bankid;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "RBI [bankid=" + bankid + ", address=" + address + "]";
	}
	
	

}
