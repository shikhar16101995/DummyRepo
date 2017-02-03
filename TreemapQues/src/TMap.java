import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class TMap {
	TreeMap<Project,HashSet<Employee>> tm;

	public TMap() {
		tm=new TreeMap<Project,HashSet<Employee>>(new SortByPid());
	}
	
	public void insertInTree(Project p, HashSet h){
		tm.put(p, h);
	}
	
	public void displayTree(){
		Set<Project> s=tm.keySet();
		for(Project p:s){
			System.out.println(p+" : "+tm.get(p));
		}
	}
}

