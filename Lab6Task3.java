class Student{
    private String name, roll_number;
    private int hash = 31;

    public Student(String name, String roll_number) {
        this.name = name;
        this.roll_number = roll_number;
    }

    public int hashCode(){
        int hash1 = 31 * hash + this.name.hashCode();
        int hash2 = 31 * hash + this.roll_number.hashCode();

        System.out.println("Hash of name " + hash1);
        System.out.println("Hash of roll number " + hash2);
        return 0;
    }
}

class Lab6Task3{
    public static void main(String argv[]){
        Student s = new Student("Hasham", "70120545");
        s.hashCode();
    }
}