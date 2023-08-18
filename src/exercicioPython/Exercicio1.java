package exercicioPython;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Map<String, Integer> carta= new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        carta.put("Nome: Cell", 1);
        carta.put("Ki: 7400", 2);
        carta.put("Técnicas: 6000", 3);
        carta.put("Velocidade: 66", 4);
        carta.put("Transformações: 3", 5);


        System.out.println(carta);

        System.out.println("Digite uma nova caracteristica para a carta: ");
        String novaCaracteristica = scanner.nextLine().toLowerCase();

        int novoNumero = carta.size() + 1; // Próximo número na ordem de progressão
        carta.put(novaCaracteristica, novoNumero);

        for (String caracteristica : carta.keySet()) {
            System.out.println(caracteristica);
        }

        for (Integer numeros : carta.values()) {
            System.out.println(numeros);
        }

        System.out.println("Escolha apenas um número do indice");

        Integer resposta = scanner.nextInt();

        boolean encontrado = false;
        
            for (Map.Entry<String, Integer> entry : carta.entrySet()) {
                if (resposta.equals(entry.getValue())) {
                    System.out.println(entry.getKey());
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Não foi possível encontrar");
                encontrado = false;
            }


    }
}
