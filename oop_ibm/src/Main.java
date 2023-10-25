import clinica.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Pedicure amanda = new Pedicure(1,"Amanda","Aplicação de unhas em gel");
        Manicure regina = new Manicure(2,"Regina", "Pintura das unhas");




        Salao spa = new Salao();
        spa.addFuncionario(amanda);
        spa.addFuncionario(regina);
        int escolhaMenu = 1;
        while (escolhaMenu == 1) {
            System.out.println("Bem-vindo ao o nosso Spa!");
            System.out.println("Quais procedimentos gostaria de marcar?");
            System.out.println("1. Manicure");
            System.out.println("2. Pedicure");
            System.out.println("Digite sua opção:");
            int escolhaProc = input.nextInt();
            System.out.printf("Opção %d escolhida %n", escolhaProc);
            if (escolhaProc > 2 && escolhaProc <= 0) {
                System.out.printf("Opção %d invãlida! Tente novamente", escolhaProc);
            } else if (escolhaProc == 1) {
                int escolhaProf;
                double precoServico = 300;
                int tempoServico = 60;
                int escolhaMarc;

                System.out.println("Escolha um dos nossos profissionais");
                spa.getManicures().forEach(funcionario -> System.out.println("ID: " + Funcionario.getId() + " Nome: " + Funcionario.getNome()));
                System.out.println("Selecione o ID do profissional");
                escolhaProf = input.nextInt();
                if (spa.getManicureById(escolhaProf).getId() != escolhaProf) {
                    System.out.println("ID inexistente! Tente outro ID");
                } else if (spa.getManicureById(escolhaProf).getId() == escolhaProf) {
                    spa.getManicureById(escolhaProf).tipoServico(", Esfoliação e hidratação de mãos e cutículas");
                    spa.getManicureById(escolhaProf).precoServico(precoServico);
                    spa.getManicureById(escolhaProf).tempoServico(tempoServico);
                    System.out.println("Gostaria de marcar o procedimento?");
                    System.out.println("Digite 1 para Sim, 2 para não");
                    escolhaMarc = input.nextInt();
                    switch (escolhaMarc) {
                        case 1:
                            System.out.println("Procedimento marcado com " + spa.getManicureById(escolhaProf).getNome() + "!");
                            break;
                        case 2:
                            System.out.println("Que pena! volte sempre!");
                            break;
                        default:
                            System.out.println("Escolha inválida!");
                            break;
                    }
                }

            } else {
                int escolhaProf;
                double precoServico = 0.0;
                int tempoServico = 0;
                int escolhaMarc;
                System.out.println("Escolha um dos nossos profissionais");
                spa.getPedicures().forEach(manicures -> System.out.println("ID: " + manicures.getId() + " Nome: " + manicures.getNome()));
                System.out.println("Selecione o ID do profissional");
                escolhaProf = input.nextInt();
                if (spa.getPedicureById(escolhaProf).getId() != escolhaProf) {
                    System.out.println("ID inexistente! Tente outro ID");
                } else if (spa.getPedicureById(escolhaProf).getId() == escolhaProf) {
                    spa.getPedicureById(escolhaProf).tipoServico(", aplicação de adesivos, desenhos e decoração nas unhas");
                    spa.getPedicureById(escolhaProf).precoServico(precoServico = 500);
                    spa.getPedicureById(escolhaProf).tempoServico(tempoServico = 90);
                    System.out.println("Gostaria de marcar o procedimento?");
                    System.out.println("Digite 1 para Sim, 2 para não");
                    escolhaMarc = input.nextInt();
                    switch (escolhaMarc) {
                        case 1:
                            System.out.println("Procedimento marcado com " + spa.getPedicureById(escolhaProf).getNome() + "!");
                            break;
                        case 2:
                            System.out.println("Que pena! volte sempre!");
                            break;
                        default:
                            System.out.println("Escolha inválida!");
                            break;
                    }
                }

            }
            System.out.println("Muito obrigado por visitar nosso Spa!");
            System.out.println("Gostaria de marcar mais procedimentos?");
            System.out.println("Digite 1 para Sim, 2 para Não");
            escolhaMenu = input.nextInt();
        }
        input.close();
    }
}