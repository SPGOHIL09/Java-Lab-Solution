import java.util.*;

abstract class vag{
    String color;
    public abstract String toString();
}

class potato extends vag{
    public String toString() {
        return "potato"+color;
    }
}


public class demo {
    public static void main(String[] args) {
        potato p1 = new potato();

        p1.color = "black";
        System.out.println(p1.toString());
    }
}
