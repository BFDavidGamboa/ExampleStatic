// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ExampleStatic {
    public static void main(String[] args) {
        Person person = new Person("Juan");
        System.out.println(person);

        Person person2 = new Person("Karla");
        System.out.println(person2);

        Person person3 = new Person("Carlos");
        System.out.println(person3);

         System.out.println("countPerson: " + Person.getPersonCount());
    }
}