class course{
    String course, instructor;
    int credit_hours;
    
    public course(String course, String instructor, int credit_hours) {
        this.course = course;
        this.instructor = instructor;
        this.credit_hours = credit_hours;
    }

    public int getcradit_hour(){
        return credit_hours;
    }

    
}

class lab4Task2{
    public static void main(String argv[]){
        course a = new course("C++", "Rizwan", 4);
        course b = new course("Java", "Mustafa", 4); 
        course c = new course("Average", "Hasham", (a.getcradit_hour() + b.getcradit_hour()/2));

        System.out.println(a.getcradit_hour());
    }
}