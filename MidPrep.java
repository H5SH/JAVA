import java.util.Scanner;

class Person{
    private String name, age;

    Person(){
        System.out.println("Parent constructor");
    }
    
   public Person(String name, String age) {
    System.out.println("Person parameterise constructor 2");
        this.name = name;
        this.age = age;
    }

public Person Copy(Person another){
    Person a = new Person();
    a.name = another.name;
    a.age = another.age;
    return a;
   }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    
}

class Student extends Person{
    
private String number;
private int number1;

public Student(){
    System.out.println("Student default constructor");
}



public Student(String number) {
        new Student();
    System.out.println("Student parameterise constructor");
    this.number = number;
}



public Student(int number1) {


    
    this.number1 = number1;
}



public String getNumber() {
    return number;
}

public void setNumber(String number) {
    this.number = number;
}


    
}

class Test<T> extends Student{
    T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

}

interface hello{
    public static void printHelloo(){
        System.out.println("hello");
    }
}

class Test2<T> implements hello{
    T obj;
    public void printHelloo(){
        System.out.println("Hello world");
    }
}

class MidPrep{
    public static void main(String argv[]){
    //    Test<Double> a = new Test<Double>();
    //    a.setObj(0.1);
    //   System.out.println(a.getObj());
    //   a.setAge("23");
    //   System.out.println(a.getAge());

    Test2<Integer> c = new Test2<Integer>();
    c.printHelloo();
      

    // int a = 10;
    // Integer b = Integer.valueOf(a);
    // System.out.println(b);
    
    
    }
}