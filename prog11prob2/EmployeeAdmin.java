package prog11prob2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

class EmployeeCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getSsn().compareTo(o2.getSsn());
	}

}

public class EmployeeAdmin {

	/**
	 * Returns a list of Employees whose social security number is on the input list
	 * socSecNums and whose salary is > 80000. The list must be ordered by social
	 * security number, from lowest to highest. To sort, you must use a Collections
	 * sorting method and you must define your own Comparator to be used to compare
	 * Employees by ssn.
	 */
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		// IMPLEMENT
		List<Employee> result = new ArrayList<Employee>();
//		
//		for (String s: socSecNums) {
//			Employee emp=table.get(s);
//			if (emp!=null && emp.getSalary()>80000) {
//				result.add(emp);
//			}
//		}

		Set k = table.keySet();
		for (Object key : k) {
			if (socSecNums.contains(key)) {
				Employee emp = table.get(key);
				if (emp != null && emp.getSalary() > 80000) {
					result.add(emp);
				}
			}
		}

//		Collections.sort(result, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return o1.getSsn().compareTo(o2.getSsn());
//			}
//			
//		});
//		Collections.sort(result, (o1,o2)->{
//			return o2.getSsn().compareTo(o1.getSsn());
//		});

		//Collections.sort(result, new EmployeeCompare());

		return result;

	}

}
