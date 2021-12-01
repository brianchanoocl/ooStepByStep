package practice10;

import java.util.ArrayList;

public class Klass {
    private int number;
    private Student leader;
    private Teacher teacher;
    private ArrayList<Student> members;

    public Klass(int number) {
        this.number = number;
        members = new ArrayList<Student>();
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        if (members.contains(student)) {
            this.leader = student;
            if (teacher != null)
                System.out.print(String.format("I am %s. I know %s become Leader of Class %d.\n", teacher.getName(), student.getName(), number));
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        members.add(student);
        if (teacher != null)
            System.out.print(String.format("I am %s. I know %s has joined Class %d.\n", teacher.getName(), student.getName(), number));
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public boolean isIn(Student student) {
        return number == student.getKlass().getNumber();
    }
}
