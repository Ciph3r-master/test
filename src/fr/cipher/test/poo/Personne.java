package fr.cipher.test.poo;

public class Personne {

    String firstname,lastname;
    boolean isMale;
    int age;

    public Personne(String firstname, String lastname, boolean isMale, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.isMale = isMale;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", isMale=" + isMale +
                ", age=" + age +
                '}';
    }
}
