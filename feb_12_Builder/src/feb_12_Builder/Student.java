package feb_12_Builder;

public class Student {
    String name;
    String surname;
    String fathersname;

    double age;
    double weight;
    double hight;

    public Student(StudentBuilder builder){
        this.name = builder.getName();
        this.surname = builder.getSurname();
        this.fathersname = builder.getFathersname();
        this.age = builder.getAge();
        this.weight = builder.getWeight();
        this.hight = builder.getHight();
    }

    public void iAmFromStudent(){
        System.out.println(":-p");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fathersname='" + fathersname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", hight=" + hight +
                '}';
    }
}
