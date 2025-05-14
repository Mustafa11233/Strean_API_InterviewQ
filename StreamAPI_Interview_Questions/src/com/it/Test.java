package com.it;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<Employee>();
        
		emp.add(new Employee(1, "Jhansi",32,"Female", "HR", 2011, 25000.0));
		emp.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		emp.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		emp.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		emp.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		emp.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		emp.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		emp.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		emp.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		emp.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		emp.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		emp.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		emp.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		emp.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		emp.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		emp.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

		
//		  1. How many male and female employees are there in the organization ?
		
		/*Map<String, Long> map = emp.stream().collect(Collectors.groupingBy(e -> e.getGender(),Collectors.counting()));
		System.out.println(map);*/
		
		
//		  2. Print the name of all departments in the organization ?
			
		/*emp.stream().map(e -> e.department).distinct().forEach(e -> System.out.println(e));
		*/			
		
		
//		  3. What is the average age of male and female employees ?
		
		/*Map<String, Double> map = emp.stream().collect(Collectors.groupingBy(e -> e.getGender(),Collectors.averagingInt(Employee::getAge)));
		System.out.println(map);*/
			
		
		
		
//		  4. Get the details of highest paid employee in the organization ?
		
		/*Optional<Employee> optional = emp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(optional.get());*/
		
//		  5. Get the names of all employees who have joined after 2015 ?
		
		/*emp.stream().filter(e -> e.yearOfJoining > 2015).map(e -> e.name).forEach(System.out::println);*/
			
		
//		  6. Count the number of employees in each department ?
		
		/*Map<String, Long> map = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		
		System.out.println(map);*/
		
//	      7. What is the average salary of each department ?
		
		/*Map<String, Double> map = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(map);*/
		
//	      8. Get the details of youngest male employee in the Development department ?	
			
		/*Optional<Employee> optional = emp.stream().filter(e -> e.gender.equals("Male") && e.department.equals("Development")).min(Comparator.comparing(Employee::getAge));
		
		System.out.println(optional.get());*/
//	      9. Who has the most working experience in the organization ?
		
		/*Optional<Employee> optional = emp.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		
		System.out.println(optional.get());*/
		
//	      10. How many male and female employees are there in the Sales team ?
		
		/*Map<String, Long> map = emp.stream().filter(e -> e.department.equals("Sales")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
		System.out.println(map);*/
		
//	     11.  What is the average salary of male and female employees ?
			
		/*Map<String, Double> map = emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(map);*/
//	    12. List down the names of all employees in each department ?
		
		/*Map<String, List<Employee>> list = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		Set<Entry<String, List<Employee>>> entrySet = list.entrySet();
		
		for(Entry<String,List<Employee>> entry:entrySet) {
			System.out.println("================");
			
			String key = entry.getKey();
			
			System.out.println(key);
			
			System.out.println("=========================");
			
			List<Employee> li = entry.getValue();
			
			for(Employee e:li) {
				System.out.println(e.name);
			}
			
			
		}*/
			
		
		
			

//	     13.  What is the average salary and total salary of the whole organization ?
		
			
		/*DoubleSummaryStatistics total = emp.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		
		System.out.println("Average Salary::"+total.getAverage());
		System.out.println("Total Salary::"+total.getSum());*/
			
		

//	     14.  Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years ?
			
		/*Map<Boolean, List<Employee>> map = emp.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		
		Set<Entry<Boolean, List<Employee>>> entrySet = map.entrySet();
		
		for(Entry<Boolean,List<Employee>> entry:entrySet) {
			
			if(entry.getKey()) {
				System.out.println("Employess are older than 25 years");
			}else {
				System.out.println("Employess are yonger or equal to 25 years");
			}
			
			System.out.println("===============================");
			
			List<Employee> lis = entry.getValue();
			
			for(Employee e:lis) {
				System.out.println(e.name);
			}
			
		}
		*/		

//	     15.  Who is the oldest employee in the organization?
		/*
			Optional<Employee> optional = emp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
			
			System.out.println(optional.get());*/
			
			
//			16. w p list of employees sort salary in ascending order and grouping by deptarment
			
			Map<String, List<Employee>> map = emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.groupingBy(Employee::getDepartment));
		Set<Entry<String, List<Employee>>> entrySet = map.entrySet();
		
		for(Entry<String,List<Employee>> entry:entrySet) {
			System.out.println("======================");
			System.out.println(entry.getKey());
			System.out.println("=====================");
			
			List<Employee> em = entry.getValue();
			for(Employee e:em) {
				System.out.println(e.salary);
			}
		}
		
 		  
		


	}

}
