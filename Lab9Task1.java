import java.util.ArrayList;
import java.util.List;

class Animal{
    private String name, species;
    private int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("heheheheh");
    }
}
class Lion extends Animal{

    public Lion(String name, String species, int age) {
        super(name, species, age);
        //TODO Auto-generated constructor stub
    }

    public void makeSound(){
        System.out.println("Roar");
    }
}

class Elephant extends Animal{

    public Elephant(String name, String species, int age){
        super(name, species, age);
    }

    public void makeSound(){
        System.out.println("h000000");
    }
}

class Cage{
    List<Animal> list = new ArrayList<Animal>();

    public void addAnimal(Animal animal){
        list.add(animal);
    }

    public void printAnimalSounds(){
        for(Animal obj: list){
            obj.makeSound();
        }
    }
}

class Lab9Task1{
    public static void main(String argv[]){
        Lion lion = new Lion("Naizi", "Good", 22);
        Elephant elephant = new Elephant("Bilal", "Meow", -2);
        Cage c = new Cage();
        c.addAnimal(elephant);
        c.addAnimal(lion);
        c.printAnimalSounds();
    }
}