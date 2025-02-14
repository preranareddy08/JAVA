enum Status{
    running, succes, pending, failed;
}
class EnumIfElse
{
    public static void main(String args[])
    {
        Status s = Status.running;

        if(s==Status.running)
        {
            System.out.println("running succesfully");
        }
        else if(s==Status.pending)
        {
            System.out.println("you need to wait");
        }
        else if(s==Status.failed)
        {
            System.out.println("try again");
        }
        else
        {
            System.out.println("done");
        }
        
    }

}