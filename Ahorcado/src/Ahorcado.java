

import java.util.Scanner;


public class Ahorcado {
    static String palabraOculta ="";
    static int size, intentos = 1, aciertos = 0;
    static String[] caracteres , palabras = {"queso","macizo","java","anona"};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double word = Math.random()*(palabras.length);


        palabraOculta = palabras[(int) word];

        System.out.println("Palabra seleccionada");
        size = palabraOculta.length();
        caracteres = new String[size];

        System.out.println("Empieza el juego");

        for(int i=0;i<size;i++){
            caracteres[i]= "[_]";
        }

        for(int i=0;i<size;i++){
            System.out.print(caracteres[i]);
        }
        System.out.println("");

        while(intentos <= 10){
            char c = scan.next().charAt(0);
            for(int i =0; i<size;i++){
                if(palabraOculta.charAt(i) == c){
                    cambiar(c);
                    aciertos++;
                }

            }
            pintar();

            if(aciertos == size){
                System.out.println("Ganaste");
                break;
            }
            intentos++;

        }

        System.out.println("Game over!");


    }


    public static void cambiar(char search){
        for (int i = 0; i < caracteres.length; i++) {
            if(palabraOculta.charAt(i)==search){
                caracteres[i] = "["+palabraOculta.charAt(i)+"]";
            }
        }
    }

    public static void pintar(){
        System.out.println("Intentos: "+intentos);
        for (int i = 0; i < caracteres.length ; i++) {

            System.out.print(caracteres[i]);

        }
        System.out.println("");
    }
}
