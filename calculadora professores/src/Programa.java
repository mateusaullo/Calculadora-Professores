//Nome Aluno: Mateus Saullo Felizardo
//RA: 12523137684
//Nome do Programa: Calculadora de Salário de Professores
// Data: 19/06/2023


import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual o nome do professor?:");
        String nome_professor = teclado.nextLine();

        System.out.print("\nQual seu regime de pagamento?\n1 - CLT \n2 - HORISTA \n3 - PJ\nEscolha um numero: ");
        int regime_pagamento = teclado.nextInt();
        
        Professor professor = null;
        if(regime_pagamento == 1){
            System.out.printf("\nOpcao escolhida %d - CLT",regime_pagamento);

            System.out.print("\nQual seu salário mensal como professor: ");
            double salario_mensal = teclado.nextDouble();

            professor = new ProfessorCLT(nome_professor,salario_mensal);

        }
        else if(regime_pagamento == 2){
            System.out.printf("\nOpcao escolhida %d - HORISTA",regime_pagamento);

            System.out.print("\nDigite o numero de horas trabalhadas: ");
            int horas_trabalhadas = teclado.nextInt();
             
            System.out.print("Digite o valor da hora de trabalho: ");
            double valor_hora = teclado.nextDouble();

            professor = new ProfessorHorista(nome_professor, horas_trabalhadas, valor_hora);
        }
        else if(regime_pagamento == 3){
            System.out.printf("\nOpcao escolhida %d - PJ",regime_pagamento);

            System.out.print("\nQual o valor do contrato?: ");
            int salarioigual = teclado.nextInt();

            professor = new ProfessorPJ(nome_professor,salarioigual);
        }
        else{
            System.out.println("\nOpcao invalida!");
        }
        teclado.close();
        
        String regime;
        if (regime_pagamento == 1) {
            regime = "CLT";
        } 
        else if (regime_pagamento == 2) {
            regime = "HORISTA";
        } 
        else {
            regime = "PJ";
        } 
        professor.exibirvalor(regime);
    }
}
   

