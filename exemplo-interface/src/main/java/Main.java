import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Corredor corredor1 = new Velocista("Bolt");
        corredor1.correr();

        Carteiro carteiro1 = new Carteiro("Jaime");
        carteiro1.correr();

        Triatleta triatleta1 = new Triatleta("João");
        triatleta1.correr();

        List<Corredor> corredores = new ArrayList<>();
        corredores.add(triatleta1);
        corredores.add(carteiro1);
        corredores.add(corredor1);m
    }
}
