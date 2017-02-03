import java.util.TreeMap;

public class Mainline {

	public static void main(String[] args) {
		TMap tm=new TMap();
		Project p1=new Project();
		EmpCollection e1=new EmpCollection();
		e1.insert(new Employee("AAA",123));
		e1.insert(new Employee("BBB",234));
		e1.insert(new Employee("CCC",134));
		e1.insert(new Employee("DDD",254));
		p1.setpID(23);
		p1.setpName("Project 1:");
		tm.insertInTree(p1, e1.fun());
		
		Project p2=new Project();
		EmpCollection e2=new EmpCollection();
		e2.insert(new Employee("ZZZ",123));
		e2.insert(new Employee("YYY",234));
		e2.insert(new Employee("XXX",134));
		e2.insert(new Employee("WWW",254));
		p2.setpID(12);
		p2.setpName("Project 2:");
		tm.insertInTree(p2, e2.fun());
		
		tm.displayTree();
		
	}

}
