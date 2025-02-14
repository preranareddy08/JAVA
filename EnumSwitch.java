
enum Status {
    running, success, failed, pending;
}

class EnumSwitch {

    public static void main(String[] args) {
        Status s = Status.pending;
        System.out.println(s.getClass().getSuperclass());  //getClass gives clasname and getSuperclass gives super class name
        switch (s) {
            case running:
                System.out.println("running succesfully");
                break;
            case success:
                System.out.println("successful");
                break;
            case failed:
                System.out.println("try again");
                break;
            case pending:
                System.out.println("wait for a while");
                break;
        }
    }
}
