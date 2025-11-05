package Lab3;
class Lamp implements Switchable,Describable
{
    private boolean isOn;
    @Override
    public void turnOn()
    {
        isOn = true;
        System.out.println("The lamp is turned on!");
    }
    @Override
    public void turnOff()
    {
        isOn = false;
        System.out.println("The lamp is turned off!");
    }
    @Override
    public boolean isOn()
    {
        return isOn;
    }
    @Override
    public void describe()
    {
        System.out.println("This is a lamp!");
    }




}
class TV implements Switchable,Describable
{
    private boolean isOn;
    @Override
    public void turnOn()
    {
        isOn = true;
        System.out.println("The TV is turned on!");
    }
    @Override
    public void turnOff()
    {
        isOn = false;
        System.out.println("The TV is turned off!");
    }
    @Override
    public boolean isOn()
    {
        return isOn;
    }
    @Override
    public void describe()
    {
        System.out.println("This is a smart TV!");
    }



}

public class Task2 {
    public static void main(String[] args) {
        Switchable [] s = new Switchable[4];
        s[0] = new Lamp();
        s[1] = new Lamp();
        s[2] = new TV();
        s[3] = new TV();
        for(Switchable sw:s)
        {
            sw.turnOn();
        }

    }


}
