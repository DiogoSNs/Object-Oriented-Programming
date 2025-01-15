
public class Produto {

    private String nome;
    private String codigo;
    private int quantidade;
    private float preco;
    private String avaliacao;
    private boolean disponivel;

    public Produto(String nome, String codigo, int quantidade, float preco, String avaliacao){

        this.nome=nome;
        this.codigo=codigo;
        this.quantidade=quantidade;
        this.preco=preco;
        this.avaliacao=avaliacao;
        this.disponivel = quantidade>0;
    }
    public Produto(String nome, String codigo, int quantidade, float preco){

        this.nome=nome;
        this.codigo=codigo;
        this.quantidade=quantidade;
        this.preco=preco;
        this.avaliacao="Sem Avaliacao";
        this.disponivel = quantidade>0;
    }

    //METODOS ACESSORES

    public String getNome(){

        return nome;
    }

    public String getCodigo(){

        return codigo;
    }

    public int getQuantidade(){

        return quantidade;
    }

    public float getPreco(){

        return preco;
    }

    public String getAvaliacao(){

        return avaliacao;
    }

    public boolean getDisponivel(){

        return disponivel;
    }

    //METODOS MUTADORES

    public void setNome(String nome){

        this.nome=nome;
    }

    public void setCodigo(String codigo){

        this.codigo=codigo;
    }

    public void setQuantidade(int quantidade){

        this.quantidade=quantidade;
        this.disponivel = quantidade>0;
    }

    public void setPreco(float preco){

        this.preco=preco;
    }

    public void setAvaliacao(String avaliacao){

        this.avaliacao=avaliacao;
    }

    //condicional ternario

    public float calcularValorTotal(){
        return this.preco*this.quantidade;
    }

    public String toString(){

        return (disponivel? "Disponivel":"Indisponivel")+"\nValor Total do Estoque: R$ "+calcularValorTotal();
    }


}
