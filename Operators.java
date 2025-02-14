class Operators{
    public static void main(String args[])
    {
        int num1 = 10;
        int num2 = 20;
        int res1 = num1 + num2;
        int res2 = num1 - num2;
        int res3 = num1 * num2;
        float res4 = num1 / num2;
        int res5 = num1 % num2;
        long res6 = num1 ^ num2;
        int res7 = num1++; //post increment:prints the value and then increments
        int res8 = ++num1; //increments first and then prints
        System.out.println("add "+res1);
        System.out.println("sub "+res2);
        System.out.println("mul "+res3);
        System.out.println("div "+res4);
        System.out.println("mod "+res5);
        System.out.println("power "+res6);
        System.out.println("postinc "+res7);
        System.out.println("preinc "+res8);


        
    }
}