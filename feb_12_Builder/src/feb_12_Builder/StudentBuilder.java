package feb_12_Builder;

public class StudentBuilder {
    String name;
    String surname;
    String fathersname;

    double age;
    double weight;
    double hight;

    public StudentBuilder name(String name){
        this.name = name;
        return this;
    }

    public StudentBuilder surname(String surname){
        this.surname = surname;
        return this;
    }

    public StudentBuilder fathersname(String fathersname){
        this.fathersname = fathersname;
        return this;
    }

    public StudentBuilder age(double age){
        this.age = age;
        return this;
    }

    public StudentBuilder hight(double hight){
        this.hight = hight;
        return this;
    }

    public StudentBuilder weight(double weight){
        this.weight = weight;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFathersname() {
        return fathersname;
    }

    public double getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHight() {
        return hight;
    }

    public Student build(){
        return new Student(this);
    }

    @Override
    public String toString() {
        return "StudentBuilder{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fathersname='" + fathersname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", hight=" + hight +
                '}';
    }
}
