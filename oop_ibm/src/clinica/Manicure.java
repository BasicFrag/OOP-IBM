package clinica;

public class Manicure extends Funcionario {


    public Manicure(int id, String nome, String especializacao) {
        super(id, nome, especializacao);
    }

    @Override
    public void tipoServico(String nomeServico) {
        System.out.println(getNome() + " é profissional em vários procedimentos com as mãos, se especializando em " + getEspecializacao() + " " + nomeServico);
    }


}
