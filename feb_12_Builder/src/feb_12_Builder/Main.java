package feb_12_Builder;

public class Main {

    public static void main(String[] args) {
        Student s = new StudentBuilder().age(19.5)
                .name("Vasya")
                .surname("Petrov")
                .fathersname("Sergeev")
                .hight(180)
                .weight(70)
                .build();
        //до билд сосавляющие студента,после билд только самого судента можно
        System.out.println(s);
        StudentBuilder sb = new StudentBuilder();
        StudentBuilder sbAge = sb.age(15);
        sbAge.name("Sergey").fathersname("Petrovich");

        System.out.println(sbAge);
    }
}
