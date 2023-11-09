class Employe{

    protected int Empid;
    protected String Emp_Name;
    protected String Emp_designation;
    protected int Emp_Salary;

    public void ShowEmployeDetail(int id){}
    public void CalculateSalary(int hour){}

}

class Sweeper extends Employe{
    public void CalculateSalary(int hour){
        Emp_Salary = hour * 500;
   }

   public void DisplayDetail(){
        System.out.println(Emp_Name + " " + Emp_Salary + " " + Emp_designation);
   }

   Sweeper(int id, String name, String designation, int Salary){
    Emp_Name = name;
    Empid = id;
    Emp_designation = designation;
    Emp_Salary = Salary;
   }
   

}

class Register extends Employe{
   public void CalculateSalary(int hour){
        Emp_Salary = hour * 2000;
   }

   public void DisplayDetail(){
        System.out.println(Emp_Name + " " + Emp_Salary + " " + Emp_designation);
   }

   Register(int id, String name, String designation, int Salary){
    Emp_Name = name;
    Empid = id;
    Emp_designation = designation;
    Emp_Salary = Salary;
   }
}

class Teacher extends Employe{
   public void CalculateSalary(int hour){
    Emp_Salary = hour * 1500;
   }

   public void DisplayDetail(){
    System.out.println(Emp_Name + " " + Emp_Salary + " " + Emp_designation);
   }

   Teacher(int id, String name, String designation, int Salary){
    Emp_Name = name;
    Empid = id;
    Emp_designation = designation;
    Emp_Salary = Salary;
   }
}

class Lab9Task2{
    public static void main(String argv[]){

    }
}