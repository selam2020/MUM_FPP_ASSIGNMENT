package prog8prob4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
	
	 public static List<Marketing> listMoreThan1000(List<Marketing> list) {
		 List<Marketing> temp = new ArrayList<>();
		 for (Marketing marketing : list) {
		 if (marketing.getSalesamount() >= 1000) {
		 temp.add(marketing);
		 }
		 }
		 return temp;
		 }

	 public static void main(String[] args) {
	 ArrayList<Marketing> list = new ArrayList<>();
	 list.add(new Marketing("John", "Pirus", 30000));
	 list.add(new Marketing("Andy", "Samsung Galaxy", 900));
	 list.add(new Marketing("Jane", "IPod", 800));
	 list.add(new Marketing("David", "Laptop", 3500));
	 list.add(new Marketing("David", "Laptop", 1500));
	 list.add(new Marketing("Chris", "MacBook", 7000));
	 System.out.println("Marketing List");
	 System.out.println(list);
	 System.out.println("_________________________________\n");
	 list.remove(list.get(2));
	 System.out.println("After remove");
	 System.out.println(list);
	 System.out.println("_________________________________\n");
	 list.get(1).setProductname("Samsung S7");
	 System.out.println("Size : " +list.size() );
	 System.out.println("_________________________________\n");
	 System.out.println("Order by Sales Amount");
	 Collections.sort(list, new SalesComparator());
	 System.out.println(list);
	 System.out.println("_________________________________\n");
	 System.out.println("Order by Name and listMoreThan1000 ");
	  List<Marketing> list1 = listMoreThan1000(list);
	 Collections.sort(list1, new NameComparator());
	 System.out.println(list1);
	 System.out.println("_________________________________\n");
	 }
	}
