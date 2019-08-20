package studentSample;

/**
 *
 * @author tadaki
 */
public class StudentMain {

    /**
     * StudentRecordクラスを実行するためのmain
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //データの生成
        String names[] = {
            "Aoyama", "Asou", "Baba", "Edo", "Funaki",
            "Goto", "Gunji", "Ikeuchi", "Ito", "Mori"
        };
        int records[] = {90, 70, 88, 95, 100, 60, 45, 80, 95, 55};
        //長さnames.lengthのStudentクラスの配列
        Student students[] = new Student[names.length];
        //配列に登録、及び成績登録
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], i);
            students[i].setRecord(records[i]);
        }
        //整列の実行
        sort(students);
        //一覧を印刷
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            String message = s.getName()
                    + "(" + s.getStudentID() + "):"
                    + s.getRecord();
            System.out.println(message);
        }
    }

    /**
     * ソートの実行
     *
     * @param array 対象となる配列
     */
    public static void sort(Student[] array) {

    }

    /**
     * 整列の実行(選択整列法)
     *
     * @param array 対象となる配列
     */
    public static void selectionSort(Student[] array) {

    }

}
