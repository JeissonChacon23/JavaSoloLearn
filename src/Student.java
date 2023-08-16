public class Student {
    public String name;
    private int age;
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
