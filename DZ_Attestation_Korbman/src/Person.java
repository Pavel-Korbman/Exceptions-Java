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

//    public String getSecondName() {
//        return secondName;
//    }
//
//    public void setSecondName(String secondName) {
//        this.secondName = secondName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getMiddleName() {
//        return middleName;
//    }
//
//    public void setMiddleName(String middleName) {
//        this.middleName = middleName;
//    }
//
//    public String getBirthDay() {
//        return birthDay;
//    }
//
//    public void setBirthDay(String birthDay) {
//        this.birthDay = birthDay;
//    }
//
//    public String getTel() {
//        return tel;
//    }
//
//    public void setTel(String tel) {
//        this.tel = tel;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }

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
