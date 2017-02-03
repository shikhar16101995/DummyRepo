
public class Project {
	private String pName;
	private int pID;
	public String getPName() {
		return pName;
	}
	public int getPID() {
		return pID;
	}
	
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pID;
		result = prime * result + ((pName == null) ? 0 : pName.hashCode());
		return result;
	}
	
	
	@Override
	public String toString() {
		return "Project [pName=" + pName + ", pID=" + pID + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (pID != other.pID)
			return false;
		if (pName == null) {
			if (other.pName != null)
				return false;
		} else if (!pName.equals(other.pName))
			return false;
		return true;
	}
	
	
}
