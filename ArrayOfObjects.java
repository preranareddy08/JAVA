
class Student {

    int id;
    String name;
    int age;
}

class ArrayOfObjects {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.id = 101;
        s1.name = "kitty";
        s1.age = 12;

        s2.id = 102;
        s2.name = "dolu";
        s2.age = 23;

        s3.id = 103;
        s3.name = "bheem";
        s3.age = 25;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student st : students) {
            System.out.println(st.id + " " + st.name + " " + st.age);
        }

    }
}
