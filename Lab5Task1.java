class Employee{
    private int perHourSalary = 100;

    public int work(int startingHour, int endingHour){
        return startingHour - endingHour;
    }

    public int getSalary(int workingHour){
        return workingHour * perHourSalary;
    }
}

class HRManager extends Employee{

    private int perHourSalary = 200, index = 0;
    private String[] employee = new String[10];
    // overides work from Employee
    public int work(int startingHour, int endingHour){
        return startingHour - endingHour + 2;
    }

    // add a new method called addEmployee
    public void addEmployee(String employee){
        employee[index++] = employee;
    }


}

class Lab5Task1{
    public static void main(String argv[]){

    }
}