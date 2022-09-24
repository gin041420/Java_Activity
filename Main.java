public class Main{
    public static void main(String[] favvvs){

        Animal a = new Animal(); 
        Animal constructor = new animal("Yeontan" , 4, "Pomeranian");

        a.setName("Apple");
        a.setAge(4);
        a.setBreed("Pomeranian");

        System.out.println("Name: " + a.getName() );
        System.out.println("Age: " + a.getAge() );
        System.out.println("Breed: " + a.getBreed() );

        System.out.println("Constructor in java with parameter");
        System.out.println("Name: " + constructor.name);
        System.out.println("Age: " + constructor.age);
        System.out.println("Breed: " + constructor.breed);

        Dog s = new dog();
        System.out.println("The owner of me is " + s.animalName);

        Animal p = new Animal();
        p.show();
        Animal p2 = new dog();
        p2.show();

    }
}