public class Person {
    private int personId; // Associated with an object (instance)
    private String name; // Associated with an object (instance)
    private static int personCount;// Associated with the class

    public Person(String name) {
        this.personId = ++personCount;
        this.name = name;
    }

    public int getPersonId() {
        return this.personId;
    }
    public void setPersonId(int personId){
        this.personId = personId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getPersonCount(){
        return personCount;
    }

    @Override
    public String toString(){
        return "personId: " + personId + ", name: " + name + ", personCount: " + personCount;
    }
}
