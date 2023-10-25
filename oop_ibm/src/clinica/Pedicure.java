package clinica;

public class Pedicure extends Funcionario{

    public Pedicure(int id, String nome, String especializacao) {
        super(id, nome, especializacao);
    }

    @Override
    public void tipoServico(String nomeServico) {
        System.out.println(getNome() + "é profissional em vários procedimentos com os pês, se especializando em " + getEspecializacao());
    }
}
