package Entity;

public class Person {
    private String name;

    public Person(String _name)
    {
        setName(_name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
