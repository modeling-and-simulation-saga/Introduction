package studentSample;

/**
 * 生徒の基本クラス
 *
 * @author tadaki
 */
public class AbstractStudent {

    //クラス内のフィールド
    //name と studentIDは一度定めると変更できない
    protected final String name; //名前
    protected final int studentID; //学生番号

    public AbstractStudent(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    //***** 取得メソッドと設定メソッド ********
    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }
}
