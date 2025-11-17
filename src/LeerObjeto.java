import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class LeerObjeto {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("persona.obj"))) {
            Persona p = (Persona) in.readObject();
            System.out.println(p);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

