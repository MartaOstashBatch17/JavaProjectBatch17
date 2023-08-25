package class10;

public class Student {

    //helps the computer to understand how the object looks lke
    //properties/attributes
    String name;
    int age;
    String id;

    //behaviour/methods/functions
    void study(){
        System.out.println("Studying 16 hours a day .....");
    }

    public static void main(String[] args) {
        //we are creating an actual student by using the Student class
        Student martaObject =new Student();    //name of the clas+name of the var = new +name oof teh class()
        martaObject.name="Marta";
        martaObject.age=29;
        martaObject.id="abc123";
        martaObject.study();

        Student habibObject=new Student();
        habibObject.name="Habib";
        habibObject.age=20;
        habibObject.id="bnm123";
        habibObject.study();




    }
}
