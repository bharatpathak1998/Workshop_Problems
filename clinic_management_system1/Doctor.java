package clinic_management_system1;

public class Doctor {
    private String name;
    private int age;
    private String gender;
    private String specialization;

    public Doctor(String name, int age, String gender, String specialization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
