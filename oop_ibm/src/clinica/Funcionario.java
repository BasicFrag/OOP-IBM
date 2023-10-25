package clinica;

public abstract class Funcionario implements IServicos{
    private static int id;
    private static String nome;
    private static String especializacao;

    public Funcionario(int id, String nome, String especializacao) {
        this.id = id;
        this.nome = nome;
        this.especializacao = especializacao;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public void tipoServico(String nome){

    }
    @Override
    public void tempoServico(int tempoServico) {
        System.out.println("O tempo do serviço pode demorar até " + tempoServico + " minutos");
    }

    @Override
    public void precoServico(double precoServico) {
        System.out.printf("O servico custa %.2f reais%n",precoServico);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especializacao='" + especializacao + '\'' +
                '}';
    }


}