class Dog{
    String name, breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
}

class lab4Task5{
    public static void main(String argv[]){
        Dog d = new Dog("Dogi", "Shepherd");
        System.out.println(d.getName() + " " + d.getBreed());
        d.setName("Jhon");
        d.setBreed("German");
        System.out.println(d.getName() + " " + d.getBreed());
    }
}