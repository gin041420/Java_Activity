public class Animal implements interFace{
    String name, breed;
    int age;
    String animalName = "Taehyung"; 

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setage(int age) {
        this.age = age;
    }
    public int getage() {
        return age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }

    public Animal(){
        System.out.println("Hello, this is a simple example of OOP concept based on what I learned!");
    }

    public Animal(String name, int age, String breed){
        this.name=name;
        this.age=age;
        this.breed=breed;
    }
    
    public void show(){
        System.out.println("Inside the method of the parent class");
        System.out.println("This is the Animal class");
    }
}
