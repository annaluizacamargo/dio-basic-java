// Pacote: edu.anna.firstmodule // ESSE É UM PACOTE JAVA (pacote é um agrupamento de classes)
/*
 * Pacotes são usados para organizar classes em um diretório
 * O nome do pacote deve ser o primeiro comando do arquivo
 *   package <nome do pacote>;
 *   Exemplo: package edu.anna.firstmodule;
 *      edu -> porque é um diretório educacional
 *      org -> porque é um diretório organizacional
 *      com -> porque é um diretório comercial
 *      br -> porque é um diretório brasileiro
 *      net -> porque é um diretório de rede
 *      gov -> porque é um diretório governamental
 */

package edu.anna.firstmodule;

public class Students {
    public static void main(String[] args) {
        int mediaFinal = 6;
        
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}
