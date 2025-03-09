import java.util.Scanner;
class Employee{
int eNo;
String eName;
int eSalary;

Employee(int eNo,String eName,int eSalary){
this.eNo=eNo;
this.eName=eName;
this.eSalary=eSalary;
}
public void printDetails(){
System.out.println("Employee Details:");
System.out.println("Employee number is:"+this.eNo+",Employee name is:"+this.eName+",Employee salary is:"+this.eSalary);
}
}

class EmployeeSearch{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Employee emp[]=new Employee[4];

for(int i=0;i<4;i++){
    System.out.print("Enter Employee Number: ");
    int eNo=sc.nextInt();
    sc.nextLine();
   
    System.out.print("Enter Employee Name: ");
    String eName=sc.nextLine();
     
    System.out.print("Enter Employee Salary: ");
    int eSalary=sc.nextInt();
    sc.nextLine();
    emp[i]=new Employee(eNo,eName,eSalary);
}

System.out.print("Enter number to search the employee:");
  int SearchNo=sc.nextInt();

for(int i=0;i<4;i++){
if (emp[i].eNo == SearchNo) {
emp[i].printDetails();
}
}
}
}
