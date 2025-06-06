package com.mycompany.lojadebrinquedos;

import java.util.Scanner;

// Produto abstrato
interface Brinquedo {
    void brincar();
}

// Produtos concretos
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

// Criador abstrato (fábrica)
abstract class FabricaBrinquedo {
    public abstract Brinquedo criarBrinquedo();

    public void entregarBrinquedo() {
        Brinquedo brinquedo = criarBrinquedo();
        System.out.println("Entregando brinquedo:");
        brinquedo.brincar();
    }
}

// Fábricas concretas
class FabricaUrsinho extends FabricaBrinquedo {
    public Brinquedo criarBrinquedo() {
        return new Ursinho();
    }
}

class FabricaCaminhao extends FabricaBrinquedo {
    public Brinquedo criarBrinquedo() {
        return new Caminhao();
    }
}

class FabricaBola extends FabricaBrinquedo {
    public Brinquedo criarBrinquedo() {
        return new Bola();
    }
}

class FabricaBoneca extends FabricaBrinquedo {
    public Brinquedo criarBrinquedo() {
        return new Boneca();
    }
}

// Teste com entrada do usuário
public class LojaDeBrinquedos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um brinquedo (1 - Ursinho, 2 - Caminhão, 3 - Bola, 4 - Boneca):");
        int opcao = scanner.nextInt();

        FabricaBrinquedo fabrica = null;

        switch (opcao) {
            case 1:
                fabrica = new FabricaUrsinho();
                break;
            case 2:
                fabrica = new FabricaCaminhao();
                break;
            case 3:
                fabrica = new FabricaBola();
                break;
            case 4:
                fabrica = new FabricaBoneca();
                break;
            default:
                System.out.println("Opção inválida. Escolha um número de 1 a 4.");
                System.exit(1);
        }

        fabrica.entregarBrinquedo();
    }
}