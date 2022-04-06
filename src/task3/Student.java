package task3;

public class Student {
    private String name;
    private byte age;
    private Course course;

    public Student() {
    }

    public Student(String name, byte age, Course course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return
                "name=" + name + "\'" +
                "age=" + age +"\'" +
                "course=" + course ;
    }
}
