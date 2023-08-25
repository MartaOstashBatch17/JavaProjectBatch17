package class10;

public class DogTester {
    public static void main(String[] args) {
        //we are creating an obj from the dog class
        Dog lunaObject=new Dog();
        lunaObject.name="Luna";
        lunaObject.gender='F';
        lunaObject.breed="Shiba";
        lunaObject.weight=10;
        lunaObject.age=5;
        System.out.println(lunaObject.name);
        System.out.println(lunaObject.age);
        System.out.println(lunaObject.breed);

        //we are calling the bark method on lunasObject
        lunaObject.bark();
        lunaObject.eat();
        lunaObject.sleep();



    }
}
