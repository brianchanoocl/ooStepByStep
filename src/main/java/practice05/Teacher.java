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
            return super.introduce() + String.format(" I am a Teacher. I teach Class %d.",getKlass());
        else
            return super.introduce() + String.format(" I am a Teacher. I teach No Class.");

    }
}