
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FinallyDemo2 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } finally {
            br.close();

        }

    }
}
