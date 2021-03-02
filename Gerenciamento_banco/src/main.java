import java.util.Scanner;

import javax.swing.Timer;


//fazer um arquivo que contenha as funções de inserir, remover, transferencias e buscar.

public class main {
    public static void main(String[] args){

        System.out.println("Bem vindo ao sistema de gerenciamento contas banc�rias");
        System.out.println("Para inserir basta escrever: 'inserir;nome;saldo inicial'");
        System.out.println("Para remover basta escrever: 'remover;id'");
        System.out.println("Para transferir basta escrever: 'transferir;id que executa;id que recebe;valor'");
        System.out.println("Para mostrar as contas basta escrever: 'dados'");
        System.out.println("Para mostrar dados de um pelo id basta escrever: 'infoId;id'");
        System.out.println("Para aplicar na poupan�a basta escrever: 'p_inserir;id;money'");
        System.out.println("Para resgatar da poupan�a basta escrever: 'p_resgatar;id;money'");
        System.out.println("Para finalizar basta escrever: 'fim'");
        
        Functions.setTimer();

        Scanner entrada = new Scanner(System.in);
        String info;
        info = entrada.next();
        while(!info.equals("fim")){
            if (info.equals("dados")){
                Functions.ShowData();
            }
            else{
                String[] infoVector = info.split(";");
                switch (infoVector[0]){
                    case "inserir":
                        Functions.add(infoVector[1],  Double.parseDouble(infoVector[2]));
                        break;
                    case "remover":
                        Functions.remove(Integer.parseInt(infoVector[1]));
                        break;
                    case "transferir":
                        Functions.transfer(Integer.parseInt(infoVector[1]),Integer.parseInt(infoVector[2]),Double.parseDouble(infoVector[3]));
                        break;
                    case "infoId":
                        Functions.ShowInfoById(Integer.parseInt(infoVector[1]));
                        break;
                    case "p_inserir":
                    	Functions.apply(Integer.parseInt(infoVector[1]), Double.parseDouble(infoVector[2]));
                    	break;
                    case "p_resgatar":
                    	Functions.rescue(Integer.parseInt(infoVector[1]), Double.parseDouble(infoVector[2]));
                    	break;
                    default:
                        System.out.println("entrada inv�lida!");
                }
            }

            info = entrada.next();
        }
        
        Functions.stopTimer();

    }
}
