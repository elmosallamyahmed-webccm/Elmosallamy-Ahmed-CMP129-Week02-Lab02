public class Person {
    public int age;
    public String name;
    public String email;
    
    public void name(String name){
        this.name =  name;
    }
    public void age(int age){
        this.age =  age;
    }
    public void email(String email){
        this.email =  email;
    }
    public String name(){
        return name;
    }
    public int age(){
        return age;
    }
    public String email(){
        return email;
    }
    public void Display(){
        System.out.printf("Name: %s || Age: %d || Email: %s%n", name, age, email);
    }
}
