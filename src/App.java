public class App {
    public static void main(String[] args) throws Exception {
        try {
            System.out.print("Por favor, introduzca la altura (número mayor igual a 5): ");
            int altura = Integer.parseInt(System.console().readLine());

            int AlturaInt = (altura - 3) / 2;

            if (altura % 2 != 0 && altura >= 5) {
                System.out.println("MMMMMM");

                for (int i = 0; i < AlturaInt; i++) {
                    System.out.println("M    M");
                }

                System.out.println("MMMMMM");

                for (int i = 0; i < AlturaInt; i++) {
                    System.out.println("M    M");
                }

                System.out.println("MMMMMM");
            } else {
                System.out.println("La altura introducida no es la correcta.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Número mal introducido.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}