package prog5prob2;
import java.time.LocalDate;
import java.util.Scanner;

public class MainEmployee {
	public static void main(String[] args) {
		
		
		Proffesor p1= new Proffesor("Daniel",300.0,LocalDate.of(1900,3,2),3);
		Proffesor p2= new Proffesor("Eden",400.0,LocalDate.of(1900,3,2),4);
		Proffesor p3= new Proffesor("Rahel",500.0,LocalDate.of(1900,3,2),5);
		Secretary s1= new Secretary ("Sofia",600.0,LocalDate.of(1900,3,2),3.0);
		Secretary s2= new Secretary ("Abel",700.0,LocalDate.of(1900,3,2),4.0);
			DepEmployee[] department = {p1,p2,p3,s1,s2 }; 
		//DepEmployee[] department = new DepEmployee[5];
				
//				department[0]=p1;
//				department[1]=p2;
//				department[2]=p3;
//				department[3]=s1;
//				department[4]=s2;
				System.out.println("Do you wishes to see the sum of all Professor salary, "
						+ "sum of all secretary salary and all salaries in the department? Enter Y for yes");

				Scanner input = new Scanner(System.in);
				String value = input.nextLine();
				double sumProf = 0;
				double sumSec = 0;
				if (value.equalsIgnoreCase("Y"))
					for (DepEmployee d : department) {
						if (d instanceof Proffesor)
							sumProf += d.computeSalary();
						if (d instanceof Secretary)
							sumSec += d.computeSalary();
					}
				System.out.println("the sum of all Professor Salary : " + sumProf);
				System.out.println("The sum of Secretary salary  : " + sumSec);
				System.out.println("The sum of all Employee salary : " + (sumProf + sumSec));
			}

		}
