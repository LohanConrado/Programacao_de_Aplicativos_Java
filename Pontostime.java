package Java.SA04;

import java.util.Scanner;

public class Pontostime { 
    public static void main(String agrs[]) {
        Scanner entrada = new Scanner(System.in);
        int gol = 0,golsofrido = 0,totalgol = 0,totalgolsofrido = 0,pontos = 0;
        for(int i = 1; i < 6; i++){
            System.out.print("Digite o número de gols do nosso time na partida: " +i+ " ");
            gol = entrada.nextInt();
            totalgol += gol;
            
            System.out.print("Digite o número de gols do adversário na partida: " +i+ " ");
            golsofrido = entrada.nextInt();
            totalgolsofrido += golsofrido;
            
            if(gol > golsofrido){
                pontos += 3;
            } else if(gol == golsofrido){
                pontos += 1;
            }
            gol = 0; golsofrido = 0;
        }
        System.out.println("A pontuação total do nosso time no campeonato é: " +pontos);
        if(pontos > 10){
            System.out.println("Nosso time está classificado para o mata-mata!");
        } else {
            System.out.println("Nosso time NÃO esta classificado para o mata-mata!");
        }
        System.out.println("Nosso time marcou: "+totalgol);
        System.out.println("Nosso time sofreu: "+totalgolsofrido);
        entrada.close();
    }  
}
