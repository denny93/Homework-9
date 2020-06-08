package Entity;

public class Mashine {
    private int power;
    private int height;
    private  String color;

    public Mashine(int _power , int _height , String _color)
    {
        setPower(_power);
        setHeight(_height);
        setColor(_color);
    }

    public int getPower() {
        return power;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
