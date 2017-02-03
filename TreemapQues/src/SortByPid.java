import java.util.Comparator;

public class SortByPid implements Comparator<Project> {

	@Override
	public int compare(Project o1, Project o2) {
		if(o1.getPID()>o2.getPID()){
			return 1;
		}
		else if(o1.getPID()<o2.getPID()){
			return -1;
		}
		return 0;
	}


	

}
