package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age){
        super(id, name, age);
        this.klass = null;
    }

    public Teacher(int id, String name, int age, Klass klass){
        super(id, name, age);
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