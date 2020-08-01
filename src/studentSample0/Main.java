package studentSample0;

/**
 *
 * @author tadaki
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Studentクラスインスタンスの生成
        //ここでは、クラスインスタンスの配列を生成
        Student students[] = {new Student("Aoyama", 1),
                              new Student("Asou", 2)};
        for (Student student : students) {
            System.out.println(student.name);
        }
    }
}
