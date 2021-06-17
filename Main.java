/*
constructor learning
just a little training for my constructor application
thx to Alex Lee for the tutorials that are handy
 */

public class Main //main class
{
    public static void main(String[] args)//main method
    {
        Light lamp = new Light();//creates object lamp to access the class Light
        Light.setColor("Tungsten");//creates color tungsten
        Light.setShape("Circle");//creates shape circle
        lamp.isOn();//says that the light is on
        System.out.println(Light.color);//prints the color tungsten
        System.out.println(Light.shape);//prints the shape circle
    }
}
