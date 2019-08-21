package studentSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author tadaki
 */
public class StudentMainWithList {

    /**
     * StudentRecordクラスを実行するためのmain
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //データの生成
        String names[] = {
            "Aoyama", "Asou", "Baba", "Eto", "Funaki",
            "Goto", "Gunji", "Ikeuchi", "Ito", "Mori"
        };
        int records[] = {90, 70, 88, 95, 100, 60, 45, 80, 95, 55};
        //クラスインスタンスのリスト
        List<Student> studentList
                = Collections.synchronizedList(new ArrayList<>());
        //配列に登録、及び成績登録
        for (int i = 0; i < names.length; i++) {
            Student s = new Student(names[i], i);
            s.setRecord(records[i]);
            studentList.add(s);
        }
        //整列の実行
        sort(studentList);
        //一覧を印刷
        for (int i = 0; i < studentList.size(); i++) {
            Student s = studentList.get(i);
            System.out.println(s.getName() + "(" + s.getStudentID() + "):"
                    + s.getRecord());
        }
    }

    /**
     * ソートの実行
     *
     * @param list 対象となる配列
     */
    public static void sort(List<Student> list) {

    }
}
