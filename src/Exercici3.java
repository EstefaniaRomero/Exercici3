public class Exercici3 {
    public static void main(String[] args) {

        int num = 5;
        int resultado = 0;
        int par = 2;

        for (int contador = 0; contador <= 15; contador++) {
            resultado = contador * num;

            if (resultado % par == 0) {

                System.out.println(contador + " X 5 = " + resultado + " PAR");
            } else {

                System.out.println(contador + " X 5 = " + resultado + " IMPAR");

            }
        }
    }
}





