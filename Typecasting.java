class Typecasting{
    public static void main(String args[])
    {
        byte b1 = 10;
        int a1 = 300;
        //byte to integer
        a1 = b1;
        System.out.println(a1);
        //integer to byte
        b1 = (byte)a1;  // b1 = a1; //error:lossy conversion from int to byte
        System.out.println(b1);

        float f1 = 9.2f;//f must be there double to float not possible
        int a2 = 350;
        //float to int
        a2 = (int)f1; 
        System.out.println(a2);
        //int to float
        f1 = a2;
        System.out.println(f1);

        byte b2 = 10;
        byte b3 = 30;
        int res = b2*b3;
        System.out.println(res); //typecasting promotion 
    }
}