package practice06;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age){
        super(name, age);
        this.klass = null;
    }

    public Teacher(String name, int age, Klass klass){
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if(klass != null)
            return super.introduce() + String.format(" I am a Teacher. I teach %s.", klass.getDisplayName());
        else
            return super.introduce() + String.format(" I am a Teacher. I teach No Class.");

    }

    public String introduceWith(Student student) {
        return super.introduce() + (klass.getNumber() == student.getNumber() ? String.format(" I am a Teacher. I teach %s.", student.getName()) : String.format(" I am a Teacher. I don't teach %s.", student.getName()));
    }
}