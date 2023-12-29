package com.Inheritance;

class User {
    
    int id;
    String name;
   
   public User(int i, String n ){   // Parameterized constructor
        this.id = i;  
        this.name = n;//refering to the instance variable
    }
}

class Employee extends User {
    
    double salary;

    public Employee(int id, String name, double sal) { //parameterized constructor
        super(id, name); // calls the constructor of the parent class
        this.salary = sal;
    }
    
    public double displayAnnualSalary() {
        return salary * 12; 
    }
}

public class TestUserEmp {

public static void main(String[] args) { //main method 
		{
		 Employee emp = new Employee(101, "Akash", 30000); // object of Employee
				
		double ann_sal = emp.displayAnnualSalary();
		
		System.out.println("Employee " + emp.name + " annual salary: " + ann_sal);//Printing the output
		    } 
		}

}
