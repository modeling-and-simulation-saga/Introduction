package helloWorld;

/**
 * First java example
 *
 * @author tadaki
 */
public class Main {

    /**
     * 実行はここから
     *
     * mainは、クラスのインスタンスを操作する場所。
     *
     * mainに操作の本体などを書かないこと。
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String message = "こんにちは";
        //HelloWorldクラスのインスタンスの生成
        HelloWorld hello = new HelloWorld(message);
        //メッセージ印刷メソッド呼び出し
        hello.printMessage();
    }

}
