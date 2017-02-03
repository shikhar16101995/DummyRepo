import java.util.HashSet;

public class EmpCollection {
	HashSet<Employee> hs;
	public EmpCollection() {
		hs=new HashSet<Employee>();
	}
	
	public void insert(Employee emp){
		hs.add(emp);
	}
	
	public HashSet fun(){
		return hs;
	}
	
	public void display(){
		for(Employee em:hs){
			System.out.println(em);
		}
	}
	
}
