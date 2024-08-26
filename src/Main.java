import Desafio2.LogSingleton;

public class Main {
    public static void main(String[] args) {
        LogSingleton logSing = LogSingleton.getInstance();
        logSing.log("Hello World");

        for (String m:logSing){
            System.out.println(m);
        }
    }
}