import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class BufferReaderInput{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader in  = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in); //we are passing the object of InputStreamReader class
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close();
    }
}