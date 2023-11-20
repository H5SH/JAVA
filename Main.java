import java.util.ArrayList;

abstract class Employee{
	int empid;
	String emp_name;
	int emp_salary;
	String emp_designation;
	int working_hour;
	
	
	Employee(){
	    this.empid = 0;
		this.emp_name = "";
		this.emp_salary = 0;
		this.emp_designation = "";
		this.working_hour = 0;

		
	}

	Employee(int empid, String emp_name, int emp_salary, String emp_designation, int working_hour)
	{
		this.empid = empid;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.emp_designation = emp_designation;
		this.working_hour = working_hour;
	}
	
	abstract void showEmpDetails(int Emp_id);
    abstract double calculateSalary(int workingHours);

    public int getempid() {
        return empid;
    }

    public void setEmp_id(int emp_id) {
       empid = emp_id;
    }

    public String getempname() {
        return emp_name;
    }

    public void setemp_name(String Emp_name) {
        emp_name = Emp_name;
    }

    public String getemp_designation() {
        return emp_designation;
    }

    public void setemp_designation(String Emp_designation) {
        emp_designation = Emp_designation;
    }

    public double getemp_salary() {
        return emp_salary;
    }

    public void setemp_salary(int Emp_salary) {
        emp_salary = Emp_salary;
    }

    public int getworking_hours() {
        return working_hour;
    }

    public void setworking_hours(int Working_hours) {
        this.working_hour = Working_hours;
    }
}

	class Lecturer extends Employee	
	{
		int experience;
		int no_of_publication;
	
        Lecturer(int empid, String Name, int emp_salary, String emp_designation, int working_hour, int experience, int no_of_publication){
			super(empid, Name, emp_salary, emp_designation, working_hour);
			this.experience = experience;
			this.no_of_publication = no_of_publication;
			
		}
		
	@Override
    void showEmpDetails(int empid) {
        System.out.println("Employee: "+empid+" Employee Name: "+emp_name+" Employee Designation: "+getemp_designation()+" Employee Salary: "+getemp_salary()+" Experience: "+experience+" Number of Publication: "+getNoOfPublication());
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getNoOfPublication() {
        return no_of_publication;
    }

    public void setNoOfPublication(int no_of_publication) {
        this.no_of_publication = no_of_publication;
    }

    @Override
    public double calculateSalary(int workingHours) {
        double salary;

        if(workingHours > 40){
            salary = (40 * 1000) + 1500 * (workingHours - 40);
        }
		else
		{
            salary=1000*workingHours;
        }
        return salary;
    }
}
	

	class Sweper extends Employee
	{
		boolean criminal_record;
		
		Sweper(int empid, String Name, int emp_salary, String emp_designation, int working_hour, boolean criminal_record)
		{
			super(empid, Name, emp_salary, emp_designation, working_hour);
			this.criminal_record = criminal_record;
		}
		
	@Override
    void showEmpDetails(int Emp_id) {
        System.out.println("Employee: "+Emp_id+" Employee Name: " +getempname() +" Employee Designation: "+getemp_designation()+" Employee Salary: "+getemp_salary()+" Criminal Record: "+criminal_record);
    }

    public boolean isCriminalRec() {
        return criminal_record;
    }

    public void setCriminalRec(boolean criminalRec) {
        this.criminal_record = criminalRec;
    }

    @Override
    double calculateSalary(int workingHours) {
        double salary;

        if(workingHours>45){
            salary = (45 * 500) + 600 * (workingHours - 45);
        }
		else 
		{
            salary = 500 * workingHours;
        }
        return salary;
    }
	
	}

	class Registerer extends Employee{
		int admin_experience;
		int service_years;
		
		Registerer(int empid, String Name, int emp_salary, String emp_designation, int working_hour, int admin_experience, int service_years)
		{
			super(empid, Name, emp_salary, emp_designation, working_hour);
			this.admin_experience = admin_experience;
			this.service_years = service_years;
		}
		
	@Override
    public void showEmpDetails(int Emp_id) {
        System.out.println("Employee:" +Emp_id+ "Employee Name:" +getempname()+ "Employee Designation:" +getemp_designation()+ "Employee Salary:" +getemp_salary()+ "Admin Experience:" +admin_experience+ "Service years:" +service_years);
    }

    public int getAdminExperience() {
        return admin_experience;
    }

    public void setAdminExperience(int admin_experience) {
        this.admin_experience = admin_experience;
    }

    public int getServiceYears() {
        return service_years;
    }

    public void setServiceYears(int service_years) 
	{
        this.service_years = service_years;
    }

    @Override
    double calculateSalary(int workingHours)
	{
        double salary;

        if(workingHours > 40){
            salary = (workingHours * 40)+(1500 * workingHours - 40);
        }
		else
		{
            salary = 1000 * workingHours;
        }
        return salary;
    }
}
	


class Database 
{
    int ident;
    int  identi;
    ArrayList<Lecturer> lecturer=new ArrayList<Lecturer>();
    ArrayList<Sweper> sweeper=new ArrayList<Sweper>();
    ArrayList<Registerer> registrar=new ArrayList<Registerer>();

    void addLecturer(Lecturer a){
        lecturer.add(a);
    }
    void addSweeper(Sweper s)
	{
        sweeper.add(s);
    }
    void addRegistrar(Registerer r)
	{
        registrar.add(r);
    }

    void showEmployees()
	{
        for (int i = 0; i < lecturer.size(); i++)
			{
            lecturer.get(i).showEmpDetails(lecturer.get(i).getempid());
        }
        for (int i = 0; i < sweeper.size(); i++) 
		{
            sweeper.get(i).showEmpDetails(sweeper.get(i).getempid());
        }
        for (int i = 0; i < registrar.size(); i++) 
		{
            registrar.get(i).showEmpDetails(registrar.get(i).getempid());
        }
    }

    int searchEmployeeIndex(int id){
        for (int i = 0; i < lecturer.size(); i++)
			{
            if(lecturer.get(i).getempid()==id)
			{
              ident=1;
              identi=i;
              return  i;
            }
        }
        for (int i = 0; i < sweeper.size(); i++) 
		{
            if(sweeper.get(i).getempid()==id)
			{
                ident=2;
                identi=i;
                return  i;

            }
        }
        for (int i = 0; i < registrar.size(); i++) 
		{
            if(registrar.get(i).getempid()==id)
			{
                ident=3;
                identi=i;
                return  i;
            }
        }
        return -1;
    }
    void showEmployeeDetail(int id)
	{
        searchEmployeeIndex(id);
        if (ident==1)
		{
            lecturer.get(identi).showEmpDetails(lecturer.get(identi).empid);
        }
		else if(ident==2)
		{

                sweeper.get(identi).showEmpDetails(sweeper.get(identi).empid);
        } 
		else if (ident==3) 
		{
            registrar.get(identi).showEmpDetails(registrar.get(identi).empid);
        }
    }

    void editEmployeeDataName(int id,String name)
	{
        searchEmployeeIndex(id);
        if (ident==1)
		{
            lecturer.get(identi).setemp_name(name);
        }
		else if(ident==2)
		{

            sweeper.get(identi).setemp_name(name);
        } 
		else if (ident==3) 
		{
            registrar.get(identi).setemp_name(name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Database d = new Database();
        Lecturer r1 = new Lecturer(14, "Mujtaba", 20000, "Ceo", 15, 2, 30);
        Lecturer r2 = new Lecturer(10, "Rizwan", 10000, "Manager", 20, 5, 21);
        Lecturer r3 = new Lecturer(8, "Zaid", 29990, "HEad", 14, 7, 40);
        d.addLecturer(r1);
        d.addLecturer(r2);
        d.addLecturer(r3);

        d.editEmployeeDataName(14, "Ali");
        d.showEmployeeDetail(10);

        d.showEmployees();
    }
}