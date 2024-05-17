interface DesenhadorRetangulo {
    void desenharRetangulo(int largura, int altura);
}

abstract class RetanguloBase implements DesenhadorRetangulo {
    @Override
    public void desenharRetangulo(int largura, int altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == largura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class RetanguloComBordasArredondadas extends RetanguloBase {
    @Override
    public void desenharRetangulo(int largura, int altura) {
        System.out.println("Desenhando retângulo com bordas arredondadas:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                if ((i == 0 || i == altura - 1) && (j == 0 || j == largura - 1)) {
                    System.out.print("+");
                } else if (i == 0 || i == altura - 1) {
                    System.out.print("-");
                } else if (j == 0 || j == largura - 1) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class RetanguloComLinhasDuplas extends RetanguloBase {
    @Override
    public void desenharRetangulo(int largura, int altura) {
        System.out.println("Desenhando retângulo com linhas duplas:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                if (i == 0 || i == altura - 1) {
                    System.out.print("=");
                } else if (j == 0 || j == largura - 1) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class RetanguloComAsciiArt extends RetanguloBase {
    @Override
    public void desenharRetangulo(int largura, int altura) {
        System.out.println("Desenhando retângulo com arte ASCII:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                if ((i == 0 || i == altura - 1) && (j == 0 || j == largura - 1)) {
                    System.out.print("+");
                } else if (i == 0 || i == altura - 1) {
                    System.out.print("-");
                } else if (j == 0 || j == largura - 1) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class Exercicio2 {
    public static void main(String[] args) {
        DesenhadorRetangulo[] desenhistas = {
            new RetanguloComBordasArredondadas(),
            new RetanguloComLinhasDuplas(),
            new RetanguloComAsciiArt()
        };

        int largura = 20;
        int altura = 10;

        for (DesenhadorRetangulo desenhista : desenhistas) {
            desenhista.desenharRetangulo(largura, altura);
            System.out.println();
        }
    }
}


