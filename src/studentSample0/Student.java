package studentSample0;

/**
 *
 * @author tadaki
 */
public class Student {
    public final String name;//氏名
    public final int studentID;//学籍番号

    //コンストラクタ、クラスインスタンスを生成する
    public Student (String name, int StudentID){
        //thisはコンストラクタで生成された「この」インスタンス
        this.name = name;
        this.studentID = StudentID;
    }
}
