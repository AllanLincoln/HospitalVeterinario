import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String nome;
    public Tutor tutor;
    private List<Atendimento> atendimentos;

    public Animal (String nome , Tutor tutor) {
        this.nome = nome;
        this.tutor = tutor;
        this.atendimentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }


    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }
}