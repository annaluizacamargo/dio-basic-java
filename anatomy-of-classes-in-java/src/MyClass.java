// Na hora da compilação vira classe
// Sempre inicia com "public class" (porque é o ponto de entrada do programa) e o nome do arquivo usando CamelCase
public class MyClass { // ESSE É UMA CLASSE JAVA (classe é um molde para criar objetos)
    // Se a minha classe é executável, ou seja, ela é o ponto de entrada do programa, eu preciso de um método main
        // public -> visibilidade do método
        // static -> método de classe, não de instância
        // void -> não retorna nada porque é um método de execução
        // main -> nome do método
        // String[] args -> argumentos que podem ser passados para o método main
    public static void main(String[] args) throws Exception { // ESSE É UM MÉTODO JAVA
        final String TEXT_TO_PRINT = "Hello, World!"; // ESSE É UMA CONSTANTE JAVA
        final double  PI = 3.14159;

        int year = 2000; // ESSE É UMA VARIÁVEL JAVA
        year = 2024; // ESSE É UM COMANDO JAVA

        System.out.print (year); // ESSE É UM COMANDO JAVA
            // print -> não pula linha

        System.out.println(TEXT_TO_PRINT + " " + PI); // ESSE É UM COMANDO JAVA
            // println -> pula linha

        String firstName = "Anna";
        String lastName = "Fistarol";
        String completeName = completeName(firstName, lastName);
        System.out.println(completeName);
    }

    public static String completeName (String firstName, String lastName) { // ESSE É UM MÉTODO JAVA
        return firstName.concat(" ").concat(lastName); // ESSE É UM COMANDO JAVA
    }
}

/*
 * Regras de escrita:
 * Nome do arquivo deve ser igual ao nome da classe
 * Nome da classe: CamelCase
 * Nome do método: camelCase
 * Nome da variável: camelCase
 * Nome da constante: SNAKE_CASE
 *     inicia com "final" (para ser constante) e tudo em maiúsculo
 * Nome da classe: PascalCase
 * Nome do pacote: lowercase
*/

/*
 * Estrutura para declarar variável em Java:
 * <tipo> <nome da variável com camelCase> = <atribuição do valor (opcional)>;
 *   Exemplo: int a = 10;
 * 
 * Estrutura para declarar método em Java:
 * <modificador de acesso> <modificador de não instância> <tipo de retorno> <nome do método com camelCase> (<parâmetros>) throws <exceções> {
 *    <corpo do método>
 * }
 *    Forma reduzida:
 *      <tipo de retorno> <nome do método com camelCase no infinitivo> (<parâmetros>) throws <exceções> -> <corpo do método>
 *    Exemplo: int Sum(int a, int b) throws Exception -> return a + b;
*/

/*
 *  TIPOS PRIMITIVOS:
 *     int -> números inteiros
 *     double -> números decimais
 *     boolean -> true ou false
 *     char -> caractere
 *     byte -> números inteiros
 *     short -> números inteiros
 *     long -> números inteiros
 *     float -> números decimais
 * 
 *  TIPOS NÃO PRIMITIVOS:
 *     String -> texto
 *     Object -> qualquer objeto
 *     Array -> lista de elementos
 *       int[], double[], boolean[], char[], byte[], short[], long[], float[]
 *       String[], Object[], Array[], int[][], double[][], boolean[][], char[][], byte[][], short[][], long[][], float[][]
 *  OPERADORES:
 *     + -> soma
 *     - -> subtração
 *     * -> multiplicação
 *     / -> divisão
 *     % -> resto da divisão
 *     ++ -> incremento
 *     -- -> decremento
 *     += -> soma e atribui
 *     -= -> subtrai e atribui
 *     *= -> multiplica e atribui
 *     /= -> divide e atribui
 *     %= -> resto da divisão e atribui
 *     == -> igual
 *     != -> diferente
 *     > -> maior
 *     < -> menor
 *     >= -> maior ou igual
 *     <= -> menor ou igual
 *     && -> e
 *     || -> ou
 *     ! -> negação
 *     & -> e binário
 *     | -> ou binário
 *     ^ -> ou exclusivo binário
 *     ~ -> negação binária
 *     << -> deslocamento para a esquerda
 *     >> -> deslocamento para a direita
 *     >>> -> deslocamento para a direita sem sinal
 * 
 *  ESTRUTURAS DE CONTROLE:
 *     instanceof -> verifica se um objeto é uma instância de uma classe
 *     (tipo) -> cast
 *     ? : -> operador ternário
 *     new -> cria um novo objeto
 *     . -> acessa um atributo ou método de um objeto
 *     [] -> acessa um elemento de um array
 *     () -> chama um método
 *     {} -> bloco de código
 *     ; -> fim de instrução
 *     // -> comentário de linha
 *     import -> importa uma classe
 *     package -> declara o pacote de uma classe
 *     class -> declara uma classe
 *     interface -> declara uma interface
 *     extends -> herda de uma classe
 *     implements -> implementa uma interface
 *     abstract -> declara uma classe abstrata
 *     final -> declara uma constante ou impede a sobrescrita de um método
 *     static -> declara um método ou atributo de classe
 *     void -> declara um método que não retorna nada
 *     return -> retorna um valor de um método
 *     super -> acessa um método ou atributo da superclasse
 *     this -> acessa um método ou atributo da própria classe
 *     instanceof -> verifica se um objeto é uma instância de uma classe
 *     throw -> lança uma exceção
 *     throws -> declara que um método pode lançar uma exceção
 *     try -> tenta executar um bloco de código
 *     catch -> captura uma exceção
 *     finally -> executa um bloco de código após o try ou catch
 *     if -> se
 *     else -> senão
 *     switch -> seleciona um bloco de código
 *     case -> caso
 *     default -> padrão
 *     for -> para
 *     while -> enquanto
 *     do -> faça
 *     break -> interrompe um laço
 *     continue -> pula uma iteração de um laço
 *     synchronized -> sincroniza um bloco de código
 *     volatile -> declara uma variável volátil
 *     transient -> declara um atributo transiente
 *     strictfp -> declara um método ou classe com ponto flutuante estrito
 *     native -> declara um método nativo
 *     assert -> declara uma asserção
 *     enum -> declara um enum
 *     var -> declara uma variável local com inferência de tipo
 *     record -> declara um record
 *     module -> declara um módulo
 *     open -> declara um módulo aberto
 *     opens -> abre um pacote para reflexão
 *     exports -> exporta um pacote
 *     requires -> requer um módulo
 *     to -> para
 *     with -> com
 *     yield -> retorna um valor de um método
 *     non-sealed -> declara uma classe não selada
 *     permits -> declara classes permitidas
 *     sealed -> declara uma classe selada
 */