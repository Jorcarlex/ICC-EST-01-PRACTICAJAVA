public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String cadena = "Hola mundo";
        int edad = 10;

        System.out.println(cadena);
        System.out.println("Tamanio de la cadena ");
        System.out.println(cadena.length());
        System.out.println(cadena.split(" ")[0]);

        for (int i = 0; i < cadena.length(); i++) {
            if (i == cadena.length() - 1) {
                System.out.println(cadena.charAt(i));
            } else {
                System.out.print(cadena.charAt(i) + "-");
            }
        }

        /// CONTAR PALABRAS
        int palabras = cadena.split(" ").length;
        System.out.println(palabras);

        /// CUANTAS PALABRAS "a" hay en la cadena
        int a = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a') {
                a++;
            }
        }
        System.out.println("Hay en total " + a + " 'a'");
    }
}
