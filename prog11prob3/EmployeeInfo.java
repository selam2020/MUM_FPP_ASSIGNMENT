package prog11prob3;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class EmployeeInfo {
	
	/**
	 * Removes from a copy of the input list all duplicate Employees,
	 * and then returns this list.
	 * 
	 * An Employee instance is considered to be a duplicate of another Employee
	 * instance if the two instances have the same name and salary.
	 */
	public static List<Employee> removeDuplicates(List<Employee> employees) {
		//IMPLEMENT
		List<Employee> result=new ArrayList<Employee>();
		
	
		for (Employee employee : employees) {
			if (!result.contains(employee)) {
				result.add(employee);
			}
			
		}
		return result;
	}
	
	
	//DO NOT MODIFY
	/**
	 * Use the main method to test your solution
	 */
	public static void main(String[] args) {	
		List<Employee> myDupsRemoved = removeDuplicates(TestData.originalList);
		boolean dupsCorrectlyRemoved = Util.listsAreEqual(TestData.dupsRemoved, myDupsRemoved);
		System.out.println("Is answer correct? " + dupsCorrectlyRemoved);
	}
	
	

	 
}
