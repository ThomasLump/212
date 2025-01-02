import java.io.Serial;

public class Cat {
    private static int version = 0;

    public Cat(){
        version++;
    }
    @Override
    public String toString() {
        return "version: " + version + "\n";
    }
}
