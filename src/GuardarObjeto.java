import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class GuardarObjeto {
    public static void main(String[] args) {
        Persona p = new Persona("Papupro", 50);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("persona.obj"))) {
            out.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
