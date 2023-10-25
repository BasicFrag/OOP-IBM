package clinica;

public interface IServicos {
    abstract void tipoServico(String nome);
    abstract void tempoServico(int tempo);
    abstract void precoServico(double preco);

}
