import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Employe{

    private int Empid;
    private String Emp_Name;
    private String Emp_designation;
    private int Emp_Salary;

    Employe(){}

    public Employe(int empid, String emp_Name, String emp_designation, int emp_Salary) {
     Empid = empid;
     Emp_Name = emp_Name;
     Emp_designation = emp_designation;
     Emp_Salary = emp_Salary;
}

abstract public void ShowEmployeDetail(int id);
abstract public void CalculateSalary(int hour);

public int getEmpid() {
     return Empid;
}
public void setEmpid(int empid) {
     Empid = empid;
}
public String getEmp_Name() {
     return Emp_Name;
}
public void setEmp_Name(String emp_Name) {
     Emp_Name = emp_Name;
}
public String getEmp_designation() {
     return Emp_designation;
}
public void setEmp_designation(String emp_designation) {
     Emp_designation = emp_designation;
}
public int getEmp_Salary() {
     return Emp_Salary;
}
public void setEmp_Salary(int emp_Salary) {
     Emp_Salary += emp_Salary;
}

}


class Sweeper extends Employe{
    public void CalculateSalary(int hour){
     if(hour > 45){
          hour -= 45;

     }
        setEmp_Salary((hour * 600) + (45 * 500));
   }

   public void ShowEmployeDetail(int id){
     if(getEmpid() == id){
        System.out.println(getEmp_Name() + " " + getEmp_Salary() + " " + getEmp_designation());
     }else{
          System.out.println("Invalid employee");
     }
   }

   public void Detail(){
     System.out.println(getEmp_Name() + " " + getEmp_Salary() + " " + getEmp_designation());      
   }

   Sweeper(){
     super();
   }

   Sweeper(int id, String name, String designation, int Salary){
    super(id, name, designation, Salary);
   }
   
}


class Register extends Employe{
   public void CalculateSalary(int hour){
     if(hour > 30){
          hour -= 30;

     }
        setEmp_Salary((hour * 2000) + (30 * 1500));
   }

   public void ShowEmployeDetail(int id){
     if(getEmpid() == id){
        System.out.println(getEmp_Name() + " " + getEmp_Salary() + " " + getEmp_designation());
     }else{
          System.out.println("Invalid employee Id");
     }
   }

   public void Detail(){
     System.out.println(getEmp_Name() + " " + getEmp_Salary() + " " + getEmp_designation());      
   }

   Register(){
     super();
   }

   Register(int id, String name, String designation, int Salary){
    super(id, name, designation, Salary);
   }
}


class Teacher extends Employe{
   public void CalculateSalary(int hour){
     if(hour > 40){
          hour -= 40;

     }
    setEmp_Salary((hour * 1500) + (40 * 1000));
   }

   public void ShowEmployeDetail(int id){
     if(getEmpid() == id){
    System.out.println(getEmp_Name() + " " + getEmp_Salary() + " " + getEmp_designation());
     }else{
          System.out.println("Invalid employee Id");
     }
   }

   public void Detail(){
     System.out.println(getEmp_Name() + " " + getEmp_Salary() + " " + getEmp_designation());      
   }

   Teacher(){
     super();
   }

   Teacher(int id, String name, String designation, int Salary){
      super(id, name, designation, Salary);
   }
}

class UniversityEmploye{
     List<Teacher> teachers = new ArrayList<Teacher>();
     List<Sweeper> sweepers = new ArrayList<Sweeper>();
     List<Register> registers = new ArrayList<Register>();

     public List<Teacher> getTeacher() {
          return teachers;
     }
     public void setTeacher(Teacher teacher) {
          this.teachers.add(teacher);
     }
     public List<Sweeper> getSweeper() {
          return sweepers;
     }
     public void setSweeper(Sweeper sweeper) {
          this.sweepers.add(sweeper);
     }
     public List<Register> getRegister() {
          return registers;
     }
     public void setRegister(Register register) {
          this.registers.add(register);
     }

     public void AllEmployeeDetails(){
          for(Teacher teacher: teachers){
               teacher.Detail();
          }
          for(Register register: registers){
               register.Detail();
          }
          for(Sweeper sweeper: sweepers){
               sweeper.Detail();
          }
     }

     public Employe SearchEmployee(int id){
          for(Teacher teacher: teachers){
               if(teacher.getEmpid() == id){
                    return teacher;
               }
          }
          for(Register register: registers){
               if(register.getEmpid() == id){
                    return register;
               }

          }
          for(Sweeper sweeper: sweepers){
               if(sweeper.getEmpid() == id){
                    return sweeper;
               }
          }
          return null;
     }

     public void UpdateEmployee(int id){
          if(SearchEmployee(id) != null){
               Scanner sc = new Scanner(System.in);

               System.out.println("Enter Name");
               SearchEmployee(id).setEmp_Name(sc.next());
               sc.nextLine();

               System.out.println("Enter Salary");
               SearchEmployee(id).setEmp_Salary(sc.nextInt());
               sc.nextLine();

               System.out.println("Enter Designation");
               SearchEmployee(id).setEmp_designation(sc.next());
               sc.close();
          }
     }

     

}

class Lab9Task2{
    public static void main(String argv[]){
     Teacher teacher = new Teacher(1, "Hasham", "PHD", 100000);
     Teacher teacher2 = new Teacher(4, "Raheeb", "Master", 100000);

     Sweeper sweeper = new Sweeper(2, "Bilaal", "Manager", 25000);
     Sweeper sweeper2 = new Sweeper(5, "Muaz", "Cleaner", 20000);

     Register register = new Register(3, "Mustafa", "MoneyHolder", 200000);

     teacher.CalculateSalary(50);
     teacher2.CalculateSalary(60);

     sweeper.CalculateSalary(50);
     sweeper2.CalculateSalary(60);

     register.CalculateSalary(50);

     UniversityEmploye universityEmploye = new UniversityEmploye();
     universityEmploye.setRegister(register);

     universityEmploye.setSweeper(sweeper2);
     universityEmploye.setSweeper(sweeper);

     universityEmploye.setTeacher(teacher2);
     universityEmploye.setTeacher(teacher);

     universityEmploye.SearchEmployee(5).ShowEmployeDetail(5);;
     universityEmploye.SearchEmployee(3).ShowEmployeDetail(3);;
     universityEmploye.SearchEmployee(4).ShowEmployeDetail(4);;

     universityEmploye.UpdateEmployee(5);

     universityEmploye.AllEmployeeDetails();

    }
}