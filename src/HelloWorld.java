import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: Varvara.Zaikina
 * Date: Aug 25, 2010
 * Time: 1:10:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld {
    public static void main(String[] argv) throws IOException {
                BufferedReader buff = new BufferedReader(
                new InputStreamReader(System.in));
                System.out.print("What's your name? ");
                System.out.flush();
                String s = buff.readLine();
                System.out.printf("Hello, %s!", s);
            }
    
}
