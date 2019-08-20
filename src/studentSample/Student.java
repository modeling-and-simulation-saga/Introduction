package studentSample;

/**
 * 生徒のクラス:AbstractStudentの拡張
 *
 * @author tadaki
 */
public class Student extends AbstractStudent {

    private int record = 0;    //点数

    /**
     * @param name 名前
     * @param studentID 学生番号
     */
    public Student(String name,int studentID) {
        super(name, studentID);//親クラスのコンストラクタを利用
    }

    //***** 取得メソッドと設定メソッド ********
    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        record = Math.max(0, record);
        record = Math.min(100, record);
        this.record = record;
    }

}
