package practice08;

import java.util.ArrayList;

public class Klass {
    private int klass;
    private Student leader;
    private ArrayList<Student> members;

    public Klass(int klass) {
        this.klass = klass;
        members = new ArrayList<Student>();
    }

    public int getNumber() {
        return klass;
    }

    public String getDisplayName() {
        return "Class " + klass;
    }

    public void assignLeader(Student student) {
        if(members.contains(student)) {
            this.leader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
    members.add(student);
    }
}
