package Java.SA04;

public class Tabuada {
    public static void main(String[] Args) {

    int multiplicador,multiplicando,resultado;
    multiplicando = 0; 
    resultado = 0;

        System.out.println("#------Tabuada!------#");
        for (multiplicador = 1; multiplicador < 11; multiplicador++){
            multiplicando = 1;
            while(multiplicando < 11){
                resultado = multiplicador * multiplicando;
                System.out.print("| " +multiplicador +" x "+ multiplicando+ " = " +resultado + " ");
                multiplicando++;
                resultado = 0;
                    if(multiplicando == 11){
                    System.out.println("\n");
                }
            }
        }   
    }  
}
