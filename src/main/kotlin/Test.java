import java.io.FileReader;

public class Test {

    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/main/kotlin/Test.java")) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}