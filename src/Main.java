import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> dicionarioTeste = new HashMap<>();

        dicionarioTeste.put("Banana", "corredor 1");
        dicionarioTeste.put("teste2", "corredor 2");
        dicionarioTeste.put("teste3", "corredor 3");

        System.out.println("procure o item na lista");
        String procura = scanner.nextLine();

        if (dicionarioTeste.containsKey(procura)){
            System.out.println("o item que você procura esta no setor" + dicionarioTeste.get(procura));
        }else{
            System.out.println("não encontrado");
        }
        scanner.close();
    }
}