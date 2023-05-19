package ClassAssignment_1;

public class Person {

    private String name;
    private String gender;
    private int age;
    private int height;

    public Person() {
        name = "Unknown";
        gender = "Unknown";
        age = -1;
        height = -1;
    }

    public Person(String name, String gender, int age, int height) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative");
            return;
        }

        this.age = age;

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            System.out.println("Height must be positive");
            return;
        }

        this.height = height;
    }

    @Override
    public String toString() {
        String output = String.format("(Name: %s, Gender: %s, Age: %d, Height: %d)", name, gender, age, height);
        return output;
    }

    public void grow (int years, int heightIncrease) {
        if (years <= 0 || heightIncrease < 0) {
            System.out.println("years must be positive and heightIncrease cannot be negative");
            return;
        }

        age += years;
        height += heightIncrease;
    }

    public String talk() {
        return "Hello! I am " + name + ".";
    }
}
