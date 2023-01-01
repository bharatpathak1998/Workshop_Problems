package clinic_management_system;

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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
