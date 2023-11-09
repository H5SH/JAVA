import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

enum Gender {
    MALE, FEMALE, UNKNOWN 
}

class Assessment {
        private double weight;
        private double height;
        private Date date;

        public Assessment(double weight, double height, Date date) {
            this.weight = weight;
            this.height = height;
            this.date = date;
        }

        public double getWeight() {
            return weight;
        }

        public double getHeight() {
            return height;
        }

        public Date getDate() {
            return date;
        }

    }





class Analytics {
    public static double calculateBMI(Member member, Assessment assessment) {
        double weight = assessment.getWeight();
        double height = assessment.getHeight();
        double bmi = weight / Math.pow(height, 2);
        return bmi;
    }

    
    public static String determineBMICategory(double bmiValue) {
        if (bmiValue < 15) {
            return "VERY SEVERELY UNDERWEIGHT";
        } else if (bmiValue < 16) {
            return "SEVERELY UNDERWEIGHT";
        } else if (bmiValue < 18.5) {
            return "UNDERWEIGHT";
        } else if (bmiValue < 25) {
            return "NORMAL";
        } else if (bmiValue < 30) {
            return "OVERWEIGHT";
        } else if (bmiValue < 35) {
            return "MODERATELY OBESE";
        } else if (bmiValue < 40) {
            return "SEVERELY OBESE";
        } else {
            return "VERY SEVERELY OBESE";
        }
    }

    public static boolean isIdealBodyWeight(Member member, Assessment assessment) {
        Gender gender = member.getGender();
        double height = assessment.getHeight();
        double weight = assessment.getWeight();

        if (gender == Gender.MALE) {
            double idealWeight = 50 + 2.3 * (height - 5);
            return weight == idealWeight;
        } else if (gender == Gender.FEMALE) {
            double idealWeight = 45.5 + 2.3 * (height - 5);
            return weight == idealWeight;
        } else {
            // Return the result of the female calculation if no gender is specified
            double idealWeight = 45.5 + 2.3 * (height - 5);
            return weight == idealWeight;
        }
    }

}



abstract class Person {
    protected String email;
    protected String name;
    protected String address;
    protected String gender;


    public Person(String email, String name, String address, String gender) {
        this.email = email;
        this.name = name.substring(0, Math.min(name.length(), 30));
        this.address = address;
        this.gender = gender;
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
        this.name = name.substring(0, Math.min(name.length(), 30));
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
		if (gender.toLowerCase() == "male") {
        return Gender.MALE;
    } else if (gender.toLowerCase() == "female") {
        return Gender.FEMALE;
    } else {
        // Handle cases where gender is not specified
        return Gender.UNKNOWN;
    }

    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person [email=" + email + ", name=" + name + ", address=" + address + ", gender=" + gender + "]";
    }
}

abstract class Member extends Person {
    protected double height;
    protected double startingWeight;
    protected String chosenPackage;
    protected HashMap<String, Assessment> assessments;

    public Member(String email, String name, String address, String gender, double height, double startingWeight,
            String chosenPackage) {
        super(email, name, address, gender);
        this.height = height;
        this.startingWeight = startingWeight;
        this.chosenPackage = chosenPackage;
        this.assessments = new HashMap<>();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getStartingWeight() {
        return startingWeight;
    }

    public void setStartingWeight(double startingWeight) {
        this.startingWeight = startingWeight;
    }

    public String getChosenPackage() {
        return chosenPackage;
    }

    public void setChosenPackage(String chosenPackage) {
        this.chosenPackage = chosenPackage;
    }

    public HashMap<String, Assessment> getAssessments() {
        return assessments;
    }

    public void setAssessments(HashMap<String, Assessment> assessments) {
        this.assessments = assessments;
    }
	


public List<Date> sortedAssessmentDates() {
    List<Date> sortedDates = new ArrayList<Date>();
    
    for (Assessment assessment : assessments.values()) {
        sortedDates.add(assessment.getDate());
    }
    
    // Sort the list of dates in ascending order
    Collections.sort(sortedDates);
    
    return sortedDates;
}

    @Override
    public String toString() {
        return super.toString() + ", Member [height=" + height + ", startingWeight=" + startingWeight
                + ", chosenPackage=" + chosenPackage + ", assessments=" + assessments + "]";
    }
}


class PremiumMember extends Member {
    public PremiumMember(String email, String name, String address, String gender, double height, double startingWeight,
            String chosenPackage) {
        super(email, name, address, gender, height, startingWeight, chosenPackage);
    }
        public String latestAssessment(){
        return "dbshfkjsd";
    }
}

class StudentMember extends Member {
    private String studentId;
    private String collegeName;

    public StudentMember(String email, String name, String address, String gender, double height, double startingWeight,
            String chosenPackage, String studentId, String collegeName) {
        super(email, name, address, gender, height, startingWeight, chosenPackage);
        this.studentId = studentId;
        this.collegeName = collegeName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String latestAssessment(){
        return "dbshfkjsd";
    }

    @Override
    public String toString() {
        return super.toString() + ", StudentMember [studentId=" + studentId + ", collegeName=" + collegeName + "]";
    }
}

class Trainer extends Person {

	private String trainerSpeciality;
	
public Trainer(String email, String name, String address, Gender gender, String trainerSpeciality) {
        super(email, name, address, gender.toString());
        this.trainerSpeciality = trainerSpeciality;
   }
   

    public String sortedAssessmentDates() {
        return "12 january";
    }

    public String getTrainerSpeciality() {
        return trainerSpeciality;
    }

    public void setTrainerSpeciality(String trainerSpeciality) {
        this.trainerSpeciality = trainerSpeciality;
    }

    @Override
    public String toString() {
        return super.toString() + ", Trainer [trainerSpeciality=" + trainerSpeciality + "]";
    }
}
  
 
class AliAhmed7012929{
    public static void main(String[] args) {
        PremiumMember premiumMember = new PremiumMember("email@example.com", "Ali", "123 Main St", "Male", 180, 70,
                "Premium Package");
        StudentMember studentMember = new StudentMember("email@example.com", "ANNA", "456 Main St", "Female", 165, 55,
                "Student Package", "1234567", "University of Lahore");
        Trainer trainer = new Trainer("email@example.com", "Trainer Name", "789 Main St", Gender.FEMALE, "Package 1");
      

   	  //premiumMember.setHeight(182);
        //premiumMember.setStartingWeight(72);
       // premiumMember.setGender("Female");


        System.out.println(premiumMember.latestAssessment());
        System.out.println(studentMember.latestAssessment());

        System.out.println(premiumMember.sortedAssessmentDates());
        System.out.println(studentMember.sortedAssessmentDates());
        System.out.println(trainer.sortedAssessmentDates());

        premiumMember.setChosenPackage("New Package");
        studentMember.setChosenPackage("New Package");

        System.out.println(premiumMember.getChosenPackage());
        System.out.println(studentMember.getChosenPackage());
    }
}