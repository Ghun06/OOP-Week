package BKT1;
import java.io.PrintWriter;
import java.io.IOException;

public class BT1 {

    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter("D:\\TH4_OOP\\Baith4.1\\src\\BKT1\\fib_data.txt");
        for (int i = 0; i < 1000; i++) {
            if (fibonacci(i) < 1000){
                writer.println(fibonacci(i)+"");
            }else{
                break;
            }
        }
        writer.close();
    }
}
