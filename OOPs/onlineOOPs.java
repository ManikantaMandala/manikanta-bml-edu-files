public class onlineOOPs {
    public static void main(String args[]){
        person p1=new person("Manikanta",19);
        System.out.println(p1.name +" "+ p1.age);
        p1.walk(10);
        p1.eat();
        
        person p2=new person();
        p2.name="Vijaysurya";
        p2.age=24;

        person p3=new person();
        p3.age=47;
        p3.name="Anandam";
        System.out.println(person.count);
    }
}
class person{
    String name;
    int age;

    static int count;
    public person(){
        count++;
    }
    public person(String name,int age){
        this();
        this.name=name;
        this.age=age;
    }
    void walk(){
        System.out.println(name+" is walking.");
    }
    void walk(int steps){
        System.out.println(name+" walked "+steps+" steps");
    }
    void eat(){
        System.out.println(name+" is eating.");
    }
}
