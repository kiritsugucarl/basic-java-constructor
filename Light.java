public class Light //our real life class is the Light
{

    public static String color;//the light has a color
    public static String shape;//the light has different shapes

    Light()//constructor for the Light
    {
        System.out.println("I am the Light");
    }
    public static void isOn()
    {
        System.out.println("The lamps are on");
    }
    public static void isOff()
    {
        System.out.println("The lamps are off");
    }
    public static void setColor(String newColor)
    {
        color = newColor;
    }
    public static void setShape(String newShape)
    {
        shape = newShape;
    }
}
