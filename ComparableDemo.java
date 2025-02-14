/*
  -The Comparable interface in Java is used to define the natural ordering of objects. 
  -It is a fundamental concept for sorting and comparing objects in Java.
 */
import java.util.*;

class Student implements Comparable<Student> {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "[" + "name:" + name + " " + "age:" + age + "]";
    }

    public int compareTo(Student that) {
        return this.age > that.age ? 1 : -1;
    }

}

class ComparableDemo {

    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student("mikky", 26));
        studs.add(new Student("dimple", 1));
        studs.add(new Student("pinkle", 3));
        studs.add(new Student("chotu", 28));

        Collections.sort(studs);
        System.out.println(studs);

    }
}
