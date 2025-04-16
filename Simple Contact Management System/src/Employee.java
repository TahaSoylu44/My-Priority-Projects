public class Employee extends Person{
    private String companyName;

    Employee(String name, String phoneNumber, String companyName) {
        super(name, phoneNumber);
        this.companyName = companyName;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "\nCompany Name: " + companyName;
    }

    //GETTER
    public String getCompanyName() {return companyName;}

    //SETTER
    public void setCompanyName(String companyName) {this.companyName = companyName;}
}