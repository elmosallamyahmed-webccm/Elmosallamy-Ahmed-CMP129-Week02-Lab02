public class PersonTest {
    public static void main(String args[]){
        Person person1 = new Person();
        Person person2 = new Person();
        person1.age(21);
        person2.age(17);
        person1.name("Ahmed");
        person2.name("Omar");
        person1.email("ahmed@java.com");
        person2.email("omar@java.com");
        person1.Display();
        person2.Display();
    }
} 