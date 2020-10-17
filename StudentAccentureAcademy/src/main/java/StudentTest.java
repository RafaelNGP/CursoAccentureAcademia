public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Rafael");
        student.setAge(27);

        System.out.println(student.getName() + ": " + student.getAge());
        student.birthday();
        System.out.println(student.getName() + ": " + student.getAge());
        student.birthday();
        System.out.println(student.getName() + ": " + student.getAge());
    }
}
