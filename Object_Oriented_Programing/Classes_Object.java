package Object_Oriented_Programing;

public class Classes_Object {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "red";
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        Student s1 = new Student();
        s1.calculatePercentage(85, 87, 87);
        System.out.println(String.format("%.2f", s1.percentage));
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calculatePercentage(int math, int phy, int che) {
        percentage = ((float) math + phy + che) / 3;
    }
}