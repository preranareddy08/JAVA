
import java.util.*;

class Student {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "[" + "name: " + name + " " + "age: " + age + " " + "]";
    }
}

class ComparatorDemo2 {

    public static void main(String[] args) {

        Comparator<Student> conn = (Student i, Student j)
                -> {
            return i.age > j.age ? 1 : -1;

        };
        List<Student> studs = new ArrayList<>();
        studs.add(new Student("mikky", 26));
        studs.add(new Student("dimple", 1));
        studs.add(new Student("pinkle", 3));
        studs.add(new Student("chotu", 28));

        Collections.sort(studs, conn);
        System.out.println(studs);
    }
}
