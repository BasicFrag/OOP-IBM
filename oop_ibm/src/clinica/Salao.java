package clinica;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Salao {
    private List<Funcionario> funcionarios;

    public Salao() {
        this.funcionarios = new ArrayList<>();
    }

    public List<Funcionario> getAll() {
        return funcionarios;
    }
    public List<Funcionario> getManicures() {
        return funcionarios.stream()
                .filter(funcionario ->funcionario instanceof Manicure && !(funcionario instanceof Pedicure))
                .peek(debug -> System.out.println("Add" + Funcionario.getNome()) )
                .map(funcionario -> (Manicure) funcionario)
                .collect(Collectors.toList());
    }
    public List<Funcionario> getPedicures() {
        return funcionarios.stream()
                .filter(funcionario -> funcionario instanceof Pedicure)
                .collect(Collectors.toList());
    }
    public Funcionario getPedicureById(int id) {
        return funcionarios.stream()
                .filter(funcionario -> funcionario instanceof Pedicure && Pedicure.getId() == id)
                .findAny().get();
    }
    public Funcionario getManicureById(int id) {
        return funcionarios.stream()
                .filter(funcionario -> funcionario instanceof Manicure && Manicure.getId() == id)
                .findFirst().orElse(null);


    }
    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
}
