package Data;

public class Person {
    String secondName;
    String firstName;
    String middleName;
    String birthDay;
    String tel;
    String gender;

    public Person(String secondName, String firstName, String middleName, String birthDay, String tel, String gender) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDay = birthDay;
        this.tel = tel;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return '<' + secondName + '>'
                + '<' + firstName + '>'
                + '<' + middleName + '>'
                + '<' + birthDay + '>'
                + '<' + tel + '>'
                + '<' + gender + '>';
    }
}
