class Person{
    private String name, addresss;
    private int age = 0;

    public Person(String name, String addresss, int age) {
        this.name = name;
        this.addresss = addresss;
        this.age = age;
    }

    public String toString(){
        return "name: " + name + ", address: " + addresss + ", age: " + age;
    }
}

class Lab6Task1{
    public static void main(String argv[]){
        Person p = new Person("Hasham", "House no 49 block G4 Wapda Town Phase 1", 22);
        System.out.print(p.toString());
    }
}