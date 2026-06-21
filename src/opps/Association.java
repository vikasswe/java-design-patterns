package opps;

public class Association {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "vikas";

        Teacher teacher =  new Teacher();

        teacher.student = student;

        teacher.getName();
    }
}


class Student {
    String name;
}

class Teacher {
    Student student;

    void getName(){
        System.out.println(student.name);
    }
}