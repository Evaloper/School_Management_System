package school;

public class Applicant {
    String name;
    int age;
    boolean status = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Applicant(String name, int age, boolean status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public void apply(){
        System.out.println(getName() + "has successfully submitted an application");
    }
}