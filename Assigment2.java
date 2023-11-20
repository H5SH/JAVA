import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.text.SimpleDateFormat;

abstract class Person{
    private String email, name, address;
    private String gender = "Unspecified";

    public Person(){}

    public Person(String email, String name, String address, String gender) {
        this.email = email;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    public String toString(){
        return "email: " + email + " name: " + name + " address: " + address + " gender: " + gender; 
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
}

class Assessment{
    List<Date> dateList = new ArrayList<Date>();
    public void setDate(Date date){
        dateList.add(date);
    }

    public List<Date> getDateList() {
        return dateList;
    }

    public SortedSet<Date> sortedAssessmentDates(){
        Collections.sort(dateList);
        return (SortedSet)dateList;
    }

}

abstract class Member extends Person{

    private String chosenPackgae;
    private double height, Startingweight;
    Assessment s = new Assessment();
    

    public Member(){}

    public Member(double height, double startingweight, String chosenPackgae) {
        this.height = height;
        Startingweight = startingweight;
        this.chosenPackgae = chosenPackgae;
    }

    public Member(String email, String name, String address, String gender, double height, double startingweight,
            String chosenPackgae) {
        super(email, name, address, gender);
        this.height = height;
        Startingweight = startingweight;
        this.chosenPackgae = chosenPackgae;
    }


    public Date latestAssessment(){
       Date nearestDate = new Date();
       for (int i = 0; i < s.getDateList().size() - 1; i++){
        if(s.getDateList().get(i).compareTo(s.getDateList().get(i+1)) > 0){
            nearestDate = s.getDateList().get(i+1);
        }
       }
       return nearestDate;
    }

    public abstract void chosenPackage(String chosenPackage);

    public String toString(){
        return "height: " + height + "; weight: " + Startingweight + "; ChosenPackage: " + chosenPackgae;
    }

   

    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }


    public double getStartingweight() {
        return Startingweight;
    }


    public void setStartingweight(double startingweight) {
        Startingweight = startingweight;
    }


    public String getChosenPackgae() {
        return chosenPackgae;
    }


    public void setChosenPackgae(String chosenPackgae) {
        this.chosenPackgae = chosenPackgae;
    }


  

    public Assessment getS() {
        return s;
    }

    public void setS(Assessment s) {
        this.s = s;
    }
    
}

class PremiumMember extends Member{
    private String premiumCardCode;

    
    public PremiumMember(double height, double startingweight, String chosenPackgae) {
        super(height, startingweight, chosenPackgae);
    }

    public PremiumMember(String email, String name, String address, String gender, double height, double startingweight,
            String chosenPackgae) {
        super(email, name, address, gender, height, startingweight, chosenPackgae);
    }

    public String getPremiumCardCode() {
        return premiumCardCode;
    }

    public void setPremiumCardCode(String premiumCardCode) {
        this.premiumCardCode = premiumCardCode;
    }

    @Override
    public void chosenPackage(String chosenPackage) {
        setChosenPackgae(chosenPackage);
    }

    
}

class Student extends Member{
    private int studentId;
    private String collegeName;


    public Student(double height, double startingweight, String chosenPackgae, int studentId,
            String collegeName) {
        super(height, startingweight, chosenPackgae);
        this.studentId = studentId;
        this.collegeName = collegeName;
    }

    public Student(String email, String name, String address, String gender, double height, double startingweight,
            String chosenPackgae, int studentId, String collegeName) {
        super(email, name, address, gender, height, startingweight, chosenPackgae);
        this.studentId = studentId;
        this.collegeName = collegeName;
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getCollegeName() {
        return collegeName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public void chosenPackage(String chosenPackage) {
        if (collegeName.contains(chosenPackage)){
            setChosenPackgae(chosenPackage);
        }
        else{
            setChosenPackgae("Package 3");
        }
    }

    
}

class Trainer extends Person{
    private String speciality;

    public Trainer(String speciality) {
        this.speciality = speciality;
    }

    public Trainer(String email, String name, String address, String gender, String speciality) {
        super(email, name, address, gender);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    
}


class Assigment2{
    public static void main(String argv[]){
        // Height is measured in meters between 1 and 
        Scanner sc = new Scanner(System.in);
        double height,weight;
        String ChosePackage;
        String name;
        Date date = new Date();

        while(true){
        try{
            System.out.println("Enter heights in meter");
            height = sc.nextDouble();
            sc.nextLine();
            if(height < 1 || height > 3){
                continue;
            }
            break;
        }catch(InputMismatchException c){
            System.out.print("Invalid Input");
            c.notify();
        }
    }
    while(true){

        try{
            System.out.print("Enter weight between 35 and 250");
            weight = sc.nextDouble();
            sc.nextLine();
            // Weight is measured kg between 35 and 250
            if(weight < 35 || weight > 250){
                continue;
            }
            break;
        }catch(InputMismatchException c){
            System.out.println("Invalid Input");
        }
    }

    while(true){
        try{
            System.out.println("Enter Chosenpackage");
            ChosePackage = sc.next();
            sc.nextLine();
            // Name is maximum of 30 characters; any name entered should be truncated to 30 character
            name = sc.next();
            if(name.length() > 30){
                continue;
            }
            name.substring(0, 30);
            break;
        }catch(InputMismatchException c){
            System.out.println("Invalid Input");
        }
        }

        PremiumMember pm = new PremiumMember(height, weight, ChosePackage);
        pm.getS().setDate(date);
        String gender = sc.next();
        if(gender == "M" || gender == "F"){
            pm.setGender(gender);
        }

        

        // gender must be M or F if not specified then default value is Unspecified
    }
}