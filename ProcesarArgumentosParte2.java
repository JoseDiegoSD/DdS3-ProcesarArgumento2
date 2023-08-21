//P2 Tarea
public class ProcesarArgumentosParte2 {
    public static void main(String[] args) {

        int [] Arreglo = new int[args.length - 1];
        int x = Integer.parseInt(args[0]);
        System.out.println("Suma buscada: " + x);

        for (int i = 1; i < args.length; i++) {
            Arreglo[i-1] = Integer.parseInt(args[i]);
        }

        boolean respuesta = false;

        for (int i = 0; i < Arreglo.length - 1; i++) {
            for (int j = i + 1; j < Arreglo.length; j++) {
                if (Arreglo[i] + Arreglo[j] == x) {
                    respuesta = true;
                    break;
                }
            }if (respuesta) {
                break;
            }
        }

        if (respuesta) {
            System.out.println("Si");
        } else {
            System.out.println("No");
          }
    }
}//Salgueiro Duarte