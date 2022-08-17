import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentService service=new StudentService();
        ArrayList<Student> list=service.gelAllStudent();
        System.out.println("Danh sách học sinh sắp xếp theo full name:");
        service.sortListByFullName(list);
        list.forEach(o-> System.out.println(o));
        System.out.println("---------------------------");
        System.out.println("Danh sách học sinh sắp xếp theo tuổi tăng dần:");
        service.sortListByAge(list);
        list.forEach(o-> System.out.println(o));
        System.out.println("---------------------------");
        System.out.println("Danh sách học sinh sắp xếp theo tên");
        service.sortListByName(list);
        list.forEach(o->System.out.println(o));
    }
}
