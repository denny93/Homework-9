package Entity;

public class Engine extends Mashine{
    private Person person ;

    public Engine(int _power, int _height, String _color, Person _person) {
        super(_power, _height, _color);
        setPerson(_person);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
