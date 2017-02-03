
public class Employee {
	private String eName;
	private int eId;
	//private int pId;
	
	
//	public int getpId() {
//		return pId;
//	}
	public String geteName() {
		return eName;
	}
	public int geteId() {
		return eId;
	}
	public Employee(String eName, int eId) {
		super();
		this.eName = eName;
		this.eId = eId;
	}
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eId=" + eId + "]";
	}
	
	
	
	
}
