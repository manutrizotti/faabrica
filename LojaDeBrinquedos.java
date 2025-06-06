package com.mycompany.lojadebrinquedos;

import java.util.Scanner;

// Interface do brinquedo
interface Brinquedo {
    void brincar();
}

// Implementações dos brinquedos
class Ursinho implements Brinquedo {
    public void brincar() {
        System.out.println("Abraçando o ursinho!");
    }
}

class Caminhao implements Brinquedo {
    public void brincar() {
        System.out.println("Dirigindo o caminhão!");
    }
}

class Bola implements Brinquedo {
    public void brincar() {
        System.out.println("Chutando a bola!");
    }
}

class Boneca implements Brinquedo {
    public void brincar() {
        System.out.println("Cuidando da boneca!");
    }
}

public class LojaDeBrinquedos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("\nEscolha um brinquedo:");
            System.out.println("1 - Ursinho");
            System.out.println("2 - Caminhão");
            System.out.println("3 - Bola");
            System.out.println("4 - Boneca");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando o programa.");
                break;
            }

            Brinquedo brinquedo = null;

            switch (opcao) {
                case 1:
                    brinquedo = new Ursinho();
                    break;
                case 2:
                    brinquedo = new Caminhao();
                    break;
                case 3:
                    brinquedo = new Bola();
                    break;
                case 4:
                    brinquedo = new Boneca();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            System.out.println("Entregando brinquedo:");
            brinquedo.brincar();
        }

        scanner.close();
    }
}