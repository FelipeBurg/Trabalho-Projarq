package Desafio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*Objetivo
Aplicar o padrão Singleton de maneira que uma instancia única do mecanismo
de Log possa ser acessada de qualquer ponto do sistema.
O exemplo de uso deve ser alterado de maneira a explorar o uso do padrão.

 */
public class LogSingleton implements Iterable<String> {
    private List<String> mensagens;
    private static LogSingleton instance;

    private LogSingleton() {
        mensagens = new LinkedList<>();
    }

    public void log(String m) {
        String logM = LocalDate.now().toString() + " - " + m;
        mensagens.add(logM);
    }

    public static LogSingleton getInstance() {
        if (instance == null)
            instance = new LogSingleton();
        return instance;
    }

    @Override
    public Iterator<String> iterator() {
        return mensagens.iterator();
    }

}
