public abstract class Person implements Printable{
    private String name;
    private String phoneNumber;

    /**
     * Constructs Person
     * @param name    Person's name
     * @param phoneNumber   Person's phone number
     */
    Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String printInfo() {
        return "Name: " + name + "\nPhone Number: " + phoneNumber;
    }

    //GETTER
    public String getName() {return name;}
    public String getPhoneNumber() {return phoneNumber;}

    //SETTER
    public void setName(String name){this.name = name;}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}
}
