package abstracao.livraria;
import java.util.Scanner;

public class Sistema {
    /* 1-Sair
     * 2-Adicionar livro
     * 3-Listar livros
     * 4-Detalhar livro
    */
 
    
    public static void main(String[] args) {
        
        int opcao = 0;
        Livraria livraria = new Livraria();
        Scanner scanner = new Scanner(System.in);
        
        while(opcao != 1){
            System.out.println("Escolha o que você quer fazer agora\n1-Sair\n2-Adicionar livro\n3- Listar livros\n4-Detalhar livro");
            opcao = scanner.nextInt();
            executarOpcao(opcao, scanner, livraria);          
        }
        scanner.close();
    }    
        
    public static void executarOpcao(int op, Scanner sc, Livraria livraria){
        switch (op){
            case 1:
                System.out.println("Saindo do programa");
                break;
            case 2:
                System.out.println("Adicionando livro");
                System.out.println("Escreva a ID");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Escreva o Titulo");
                String nome = sc.nextLine();
                System.out.println("Escreva o(a) autor(a)");
                String autor = sc.nextLine();
                System.out.println("Escreva o ano de lançamento");
                int anoPublicacao = sc.nextInt();
                Livro l = new Livro(id, autor, anoPublicacao, nome);
                livraria.adicionarLivro(l);
                //Testar se está funcionando essa parte ^
                break;
            case 3:
                for(int i=0; i<10; i++){
                    System.out.println();
                }
                break;
            case 4:

            case 5:

        }
        
    }
    

}
