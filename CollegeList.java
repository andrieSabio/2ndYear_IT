import java.util.Scanner;
class Student extends CollegeList{

//program String, yearlevel Int
private String program;
private int yearlevel;

public int getYearLevel(){
    return yearlevel;
}
public void setYearLevel(int yearlevel){
    this.yearlevel = yearlevel;
}

public String getProgram(){
    return program;
}
public void setProgram(String program){
    this.program = program;
}


}
class Person extends CollegeList{
private String name;
private String contactNum;


    public String getName(){
        return name;
    }
    public void setName(String name){
    this.name = name;
    }
    public String getContact(){
        return contactNum;
    }
    public void setContact(String contactNum){
        this.contactNum = contactNum;
    }

}
class Employee extends CollegeList{

private double salary;
private String department;


public double getSalary() {
    return salary;
}
public void setSalary(double salary) {
    this.salary = salary;
}
public String getDepartment() {
    return department;
}
public void setDepartment(String department) {
    this.department = department;
}








}
class Faculty extends Employee{
private boolean status;

public boolean isRegular(){
return status = true;
}
}
public class CollegeList{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person person = new Person();
        Student student = new Student();
        Employee employee = new Employee();
        Faculty faculty = new Faculty();
        System.out.println("Press E for Employee, F for Faculty, or S for Student:");
        char choice  = scan.nextLine().toUpperCase().charAt(0);
        if(choice=='e'||choice=='E'){
            System.out.println("Type Employee's Name, Contact Number, Salary, Department\nPress Enter every input");
            String name = scan.next(); person.setName(name);
            String contactNum = scan.next(); person.setContact(contactNum);
            double salary = scan.nextDouble(); employee.setSalary(salary); 
            String dep = scan.next(); employee.setDepartment(dep);
              System.out.println("=================================================");
                    System.out.println("Name: "+person.getName());
                    System.out.println("Contact Number: "+person.getContact());
                    System.out.println("Salary: "+employee.getSalary());
                    System.out.println("Department: "+employee.getDepartment());
        }
        else if (choice == 'S' || choice == 's'){
            System.out.println("Enter your Name, Contact Number, Program, and Year Level \nPress enter every input");
            String name = scan.next(); person.setName(name);
            String contactNum = scan.next(); person.setContact(contactNum);
            String program = scan.next(); student.setProgram(program);
            int yearlevel = scan.nextInt(); student.setYearLevel(yearlevel);
            System.out.println("=================================================");
            System.out.println("Name: "+person.getName());
            System.out.println("Contact Number: "+person.getContact());
            System.out.println("Program: "+student.getProgram());
            System.out.println("Year Level: "+student.getYearLevel());
        }
        switch (choice) {
            case 'F':
                System.out.println("Press [Y] if the Faculty member is regurlar and [N] if not");
               char choice1 = scan.nextLine().charAt(0);
                if(choice1=='Y'||choice1 == 'y'){
                     System.out.println("Type Employee's Name, Contact Number, Salary, Department\nPress Enter every input");
                 String name = scan.next(); person.setName(name);
                String contactNum = scan.next(); person.setContact(contactNum);
                 double salary = scan.nextDouble(); employee.setSalary(salary); 
                String dep = scan.next(); employee.setDepartment(dep);

                    System.out.println("=================================================");
                    System.out.println("Name: "+person.getName());
                    System.out.println("Contact Number: "+person.getContact());
                    System.out.println("Salary: "+employee.getSalary());
                    System.out.println("Department: "+employee.getDepartment());
                    System.out.println("Faculty Status Regular?: "+faculty.isRegular());
                }
                else if(choice1=='n'||choice1 == 'N'){
                    
            System.out.println("Type Employee's Name, Contact Number, Salary, Department\nPress Enter every input");
            String name = scan.next(); person.setName(name);
            String contactNum = scan.next(); person.setContact(contactNum);
            double salary = scan.nextDouble(); employee.setSalary(salary); 
            String dep = scan.next(); employee.setDepartment(dep);
                    System.out.println("=================================================");
                    System.out.println("Name: "+person.getName());
                    System.out.println("Contact Number: "+person.getContact());
                    System.out.println("Salary: "+employee.getSalary());
                    System.out.println("Department: "+employee.getDepartment()); 
                    System.out.println("Faculty Status Regular?: False");
                }
                break;

        }




    }
}
