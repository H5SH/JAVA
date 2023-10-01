class lab4Task1{
    public static void main(String argv[]){
        Student a = new Student(), b = new Student(), c = new Student();
        a.setAge(18);
        a.setName("Hasham");
        a.setCourse("Java");

        b.setAge(20);
        b.setName("Rizwan");
        b.setCourse("C++");

        c.setAverage((a.getAge() + b.getAge())/2);

        System.out.println(c.getAverage());

    }
}

class Student{
    private String name, course;
    private int age, average;

    public String getName() {
        return name;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
}

