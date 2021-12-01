package practice05;

public class Teacher extends Person{
    private String klass;

    public Teacher(String name, int age){
        super(name, age);
        this.klass = null;
    }

    public Teacher(String name, int age, int klass){
        super(name, age);
            this.klass = String.valueOf(klass);
    }

    public int getKlass() {
        if (klass != null)
            return Integer.parseInt(klass);
        else
            return -1;
    }

    public String introduce() {
        if(getKlass() >= 0)
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.", getName(), getAge(), getKlass());
        else
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", getName(), getAge());

    }
}