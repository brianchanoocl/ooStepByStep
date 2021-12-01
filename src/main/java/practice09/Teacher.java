package practice09;

import java.util.LinkedList;

public class Teacher extends Person {
    private Klass klass;
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age){
        super(id, name, age);
        this.klass = null;
        this.classes = new LinkedList<Klass>();
    }

    public Teacher(int id, String name, int age, Klass klass){
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes){
        super(id, name, age);
        this.classes = classes;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        String returnString = "";
        if(classes.size() > 0) {
            returnString = "Class " + classes.get(0).getNumber();
            for(int i=1; i<classes.size(); i++){
                returnString += ", " + classes.get(i).getNumber();
            }
        } else {
            returnString = "No Class";
        }
            return super.introduce() + " I am a Teacher. I teach " + returnString + ".";

    }

    public String introduceWith(Student student) {
        return isTeaching(student) ? super.introduce() + String.format(" I am a Teacher. I teach %s.", student.getName()) : super.introduce() + String.format(" I am a Teacher. I don't teach %s.", student.getName());
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public boolean isTeaching(Student student) {
        boolean teachesStudent = false;
        for (Klass item : classes){
            if(item.isIn(student))
                teachesStudent = true;
        }
        return teachesStudent;
    }


}