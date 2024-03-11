/**
 * Lab7_1
 */
abstract class Vegetable{
    String name;
    String color;
    abstract public String toString();

}

class Potato extends Vegetable{
    Potato(){
        super.name = "Potato";
        super.color = "Brown";
    }
    @Override
    public String toString(){
        return "Vegetable : "+super.name+", color : "+super.color;
    }
}

class Brinjal extends Vegetable{
    Brinjal(){
        super.name = "Brinjal";
        super.color = "Purple";
        
    }
    @Override
        public String toString(){
            return "Vegetable : "+super.name+", color : "+super.color;
        }
}

class Tomato extends Vegetable{
    Tomato(){
        super.name = "Tomato";
        super.color = "Red";
    }
    @Override
    public String toString(){
        return "Vegetable : "+super.name+", color : "+super.color;
    }
}
public class Lab7_1 {
    public static void main(String[] args) {
        Potato p = new Potato();
        Brinjal b = new Brinjal();
        Tomato t = new Tomato();

        System.out.println(p);
        System.out.println(b);
        System.out.println(t);
    }
    
}