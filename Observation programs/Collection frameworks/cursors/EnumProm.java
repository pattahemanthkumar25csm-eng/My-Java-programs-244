
import java.util.Vector;
import java.util.Stack;
import java.util.Enumeration;


public enum EnumProm {
    JAVA("Java Programming"),
    C("C Programming"),
    CPP("C++ Programming"),
    PYTHON("Python Programming"),
    DATA_STRUCTURES("Data Structures");

    private final String description;

    EnumProm(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (EnumProm language : EnumProm.values()) {
            System.out.println(language + ": " + language.getDescription());
        }
    }
}