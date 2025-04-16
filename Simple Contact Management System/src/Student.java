public class Student extends Person{
    private String schoolName;

    Student(String name, String phoneNumber, String schoolName) {
        super(name, phoneNumber);
        this.schoolName = schoolName;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "\nSchool Name: " + schoolName;
    }

    //GETTER
    public String getSchoolName() {return schoolName;}

    //SETTER
    public void setSchoolName(String schoolName) {this.schoolName = schoolName;}
}
