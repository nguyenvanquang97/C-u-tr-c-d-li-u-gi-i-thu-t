import java.util.ArrayList;
import java.util.Comparator;

public class StudentService {
    public ArrayList<Student> gelAllStudent(){
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("Nguyễn Văn A",17,8));
        list.add(new Student("Nguyễn Văn A",20,7));
        list.add(new Student("Nguyễn Phú T",20,6));
        list.add(new Student("Lò thị T",25,5));
        list.add(new Student("Lê Minh A",25,4));
        list.add(new Student("Lê Đức A",23,6));
        list.add(new Student("Vũ Đức Đ",30,8));
        list.add(new Student("Nguyễn Xuân P",60,4));

        return list;
    }

    public void sortListByFullName(ArrayList<Student> list){
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
              int compareByName=o1.fullName.compareTo(o2.fullName);
              if (compareByName==0){
                  return o2.age-o1.age
                          ;
              }
               else return compareByName;
            }
        });
    }
    public void sortListByAge(ArrayList<Student> list){
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int temp = o1.age - o2.age;
                if (temp ==0){
                    return o2.GPA - o1.GPA;
                }
                return o1.age - o2.age;
            }
        });
    }
    public void sortListByName(ArrayList<Student> list){
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int spaceIdx1 = o1.fullName.lastIndexOf(" ");
                String subStr1 = o1.fullName.substring(spaceIdx1 + 1);
                int spaceIdx2 = o2.fullName.lastIndexOf(" ");
                String subStr2 = o2.fullName.substring(spaceIdx2 + 1);

                return subStr1.compareTo(subStr2);
            }
        });
    }
}
