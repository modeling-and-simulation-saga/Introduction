package helloWorld;

/**
 * First java example
 *
 * @author tadaki
 */
public class HelloWorld {

    //クラス内のフィールド（変数）
    private final String message;

    /**
     * コンストラクタ：クラスのインスタンスを生成する
     *
     * @param message 表示するメッセージ
     */
    public HelloWorld(String message) {
        //引数のmessageをインスタンスのmessageに代入
        //thisは、このコンストラクタで生成されるインスタンス
        this.message = message;
    }

    /**
     * メッセージの印刷
     */
    public void printMessage() {
        System.out.println(message);
    }
}
