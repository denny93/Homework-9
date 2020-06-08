package Entity;

public class HeatManager extends Engine {
    public HeatManager(int _power, int _height, String _color , Person _person) {
        super(_power, _height, _color, _person);
    }

    public void ShowPower(HeatManager manager)
    {
        System.out.println(manager.getClass().getName() +" has power of : "+ super.getPower() +" hp" + " created by :" + manager.getPerson().getName());
    }
}
