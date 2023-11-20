import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Student{
    private String number, name, phoneNumber;
    private int mark, id;

    Student(){
        
    }
    

    public Student(String number, String name, String phoneNumber, int mark, int id) {
        this.number = number;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.mark = mark;
        this.id = id;
    }


    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
    public int getId(){
        return id;
    }


    @Override
    public String toString() {
        return "Student [number=" + number + ", name=" + name + ", phoneNumber=" + phoneNumber + ", mark=" + mark
                + ", id=" + id + "]";
    }



}

class Data{
    List<Student> data = new ArrayList<Student>();

    public List<Student> getData() {
        return data;
    }

    public void setData(Student data) {
        this.data.add(data);
    }

    // Random random = new Random();
    //     id = random.nextInt(10000);



}

class Lab11Task02{
    public static void main(String argv[]){
        Random random = new Random();
        Data data = new Data();
        while(true){
        int found = 0; 
        int id = random.nextInt(1000);
        for(Student s: data.getData()){
            if(s.getId() == id){
                found++;
                break;
            }
        }
        if(found == 0){
        Student student = new Student("25", "Bilaal", "03066683837", 30, 0);
        data.setData(student);
        break;
        }
        }
        for(Student s: data.getData()){
            System.out.println(s.toString());
        }
        
    }
}