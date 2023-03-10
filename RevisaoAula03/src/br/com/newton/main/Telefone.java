package br.com.newton.main;

import br.com.newton.agenda.Contato;

import java.util.Scanner;

public class Telefone{
    public static void main(String[] args) {
        Contato contato = new Contato();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome de contato: ");
        String nome = entrada.nextLine();
        contato.setNome(nome);


        System.out.println("Digite um numero de telefone: ");
        String numero = entrada.nextLine();
        contato.setNumero(numero);

        contato.Excluir(contato);



        if(contato.getNumero().length() != 9){
            System.out.println("Telefone inválido");
        }
        else{

        }
        System.out.println("Digite um contato para excluir: ");
        String nomeE = entrada.nextLine();
        contato.Excluir(contato);

        System.out.println("Digite um contato para incluir: ");
        String incluir = entrada.nextLine();
        contato.Incluir(incluir);
    }
}
