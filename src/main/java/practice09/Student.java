package practice09;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass){
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public int getNumber() {
        return klass.getNumber();
    }

    public String introduce() {
        String response = super.introduce() + " I am a Student.";
        if(klass.getLeader() == this)
            response += String.format(" I am Leader of Class %d.", klass.getNumber());
        else
            response += String.format(" I am at Class %d.", klass.getNumber());
        return response;
    }
}
