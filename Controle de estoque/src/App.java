import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        boolean running = true;

    String nome;
    String codigo;
    int quantidade;
    float preco;
    String avaliacao;

        

        while(running){

            System.out.println("----MENU-----");
            System.out.print("1 - ADICIONAR UM PRODUTO\n2 - ADICIONA UM PRODUTO (SEM AVALIACAO)\n3 - ALTERAR UM PRODUTO\n4 - SAIR DO PROGRAMA\nRESPOSTA: ");
            String resposta = scanner.nextLine();
            Produto produto;
            int contador=0;


            switch(resposta){

                case "1":
                    System.out.print("NOME DO PRODUTO: ");
                    nome = scanner.nextLine();

                    System.out.print("CODIGO DO PRODUTO: ");
                    codigo = scanner.nextLine();

                    System.out.print("QUANTIDADE DO PRODUTO: ");
                    quantidade = scanner.nextInt();

                    System.out.print("PRECO DO PRODUTO: ");
                    preco = scanner.nextFloat();

                    scanner.nextLine();

                    System.out.print("AVALIACAO DO PRODUTO: ");
                    avaliacao = scanner.nextLine();

                    produto = new Produto(nome,codigo,quantidade,preco,avaliacao);
                    produtos.add(produto);
                    System.out.println("PRODUTO ADICIONADO COM SUCESSO!");
                    
                break;

                case "2":
                    System.out.print("NOME DO PRODUTO: ");
                    nome = scanner.nextLine();

                    System.out.print("CODIGO DO PRODUTO: ");
                    codigo = scanner.nextLine();

                    System.out.print("QUANTIDADE DO PRODUTO: ");
                    quantidade = scanner.nextInt();

                    System.out.print("PRECO DO PRODUTO: ");
                    preco = scanner.nextFloat();

                    produto = new Produto(nome,codigo,quantidade,preco);
                    produtos.add(produto);
                    System.out.println("PRODUTO ADICIONADO COM SUCESSO!");
                    scanner.nextLine();
                break;

                case "3":

                    if(produtos.isEmpty()){
                        System.out.println("Nenhum produto foi adicionado ainda");
                    }else{
                        System.out.println("Qual produto deseja alterar (Digite apenas o indice): ");

                        for(Produto e: produtos){
                            
                            System.out.println(contador +" - "+e.getNome());
                            contador++;
                        }

                        System.out.print("Resposta: ");
                        int indiceProdutoAlterar = scanner.nextInt();

                        scanner.nextLine(); //limpa o buffer
                        
                        System.out.print("NOME DO PRODUTO: ");
                        nome = scanner.nextLine();

                        System.out.print("CODIGO DO PRODUTO: ");
                        codigo = scanner.nextLine();

                        System.out.print("QUANTIDADE DO PRODUTO: ");
                        quantidade = scanner.nextInt();

                        System.out.print("PRECO DO PRODUTO: ");
                        preco = scanner.nextFloat();

                        System.out.print("AVALIACAO DO PRODUTO: ");
                        avaliacao = scanner.nextLine();

                        Produto produtoAlterado = produtos.get(indiceProdutoAlterar);
                        produtoAlterado.setNome(nome);
                        produtoAlterado.setCodigo(codigo);
                        produtoAlterado.setQuantidade(quantidade);
                        produtoAlterado.setPreco(preco);
                        scanner.nextLine();
                        produtoAlterado.setAvaliacao(avaliacao);
                        System.out.println("PRODUTO ALTERADO COM SUCESSO!");
                        scanner.nextLine();


                    }//endElse

                break;

                case "4":

                    System.out.println("Saindo...");
                    running = false;
                break;
                
                default:

                    System.out.println("OPCAO INVALIDA!");

                break;
            }

        }//endWhile

        System.out.println("PRODUTOS ADICIONADOS E SUAS ESPECIFICACOES: ");

            for(Produto e: produtos){
                
                System.out.println("\nPRODUTO: "+e.getNome()+"\nCODIGO: "+e.getCodigo()+"\nPRECO: "+e.getPreco()+"\nQUANTIDADE: "+e.getQuantidade()+"\nAVALICAO: "+e.getAvaliacao()+"\n"+e.toString());
            }


        scanner.close();
    }
}
