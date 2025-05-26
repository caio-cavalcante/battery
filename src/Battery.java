import java.util.Scanner; // implementação para o usuário informar minutos de uso e carregamento

public class Battery {
    public static int getBattery(int[] eventos) {
        int bateria = 50;

        for (int evento : eventos) {
            bateria += evento;

            if (bateria > 100) {
                bateria = 100; // limite superior
            } else if (bateria < 0) {
                bateria = 0; // limite inferior
            }
        }

        return bateria;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos eventos?");
        int n = scan.nextInt();
        int[] eventos = new int[n];

        System.out.println("Você vai informar quantos minutos de uso (-) ou carregamento (+)");
        for (int i = 0; i < n; i++) {
            System.out.println(i+1 + "º evento: ");
            eventos[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) { // conferência dos valores no array de eventos
            System.out.print(eventos[i] + " ");
        }

        int result = getBattery(eventos);
        System.out.println("\nPorcentagem final da bateria: " + result + "%");
    }
}
