package lojadebrinquedos;

import java.util.Scanner;

interface Brinquedo {
    void brincar();
}

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

abstract class FabricaBrinquedo {
    public abstract Brinquedo criarBrinquedo();

    public void entregarBrinquedo() {
        Brinquedo brinquedo = criarBrinquedo();
        System.out.println("Entregando brinquedo:");
        brinquedo.brincar();
    }
}

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

public class Lojadebrinquedos {
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
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            fabrica.entregarBrinquedo();
        }

        scanner.close();
    }
}
