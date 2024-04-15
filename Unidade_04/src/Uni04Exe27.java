import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni04Exe27 {
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      DecimalFormat deci = new DecimalFormat("0.000");
   
      System.out.println("Qual o horário de chegada... ");

      System.out.print("Hora de chegada: ");
      int horaChegada = input.nextInt();
      System.out.println("Chegada em minutos: ");
      int chegadaM = input.nextInt();

      System.out.println("Informe o horário de partida... ");

      System.out.print("Partida em horas: ");
      int horaPartida = input.nextInt();
      System.out.println("Partida em minutos");
      int partidaMinutos = input.nextInt();

      int totalChegada = horaChegada * 60 + chegadaM;
      int totalPartida = horaPartida * 60 + partidaMinutos;
      int totalTempoViagem = totalPartida - totalChegada;
       
      int totalHoras = totalTempoViagem / 60;
      int totalMinutos = totalTempoViagem % 60;
      
      System.out.println("O total de tempo gasto em estacionamento foi de" + totalHoras + ":" + totalMinutos);

      double precoEstacionamento;

      switch (totalTempoViagem / 60) {

         case 0:

         case 1:

         case 2:
            precoEstacionamento = 5.0;

            break;

         case 3:

         case 4:
            precoEstacionamento = 7.50;
 
            break;

         default:
            precoEstacionamento = 10.0;
 
            break;
      }

      System.out.println(deci.format("O preço a ser cobrado será de: " + precoEstacionamento));

      input.close();
    }

}
