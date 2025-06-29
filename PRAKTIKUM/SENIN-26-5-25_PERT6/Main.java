class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    public void celebrateBirthday() {
        age++;
        System.out.println("Happy birthday to me! Now I am " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Sheva", 19);
        Person person2 = new Person("Shane", 21);
        
        person1.sayHello(); 
        person1.celebrateBirthday(); 

        person2.sayHello(); 
        person2.celebrateBirthday(); 
    }
}

