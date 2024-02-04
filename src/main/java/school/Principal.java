package school;

public class Principal extends Staff {
    public Principal(String name, String role) {
        super(name, role);
    }

    public void admits(Applicant applicantName){
        System.out.println(getName() + " has admitted" + applicantName);
    }

    public void expel(Student studentName){
        System.out.println(studentName + "has been expelled by " + getName());
    }
}