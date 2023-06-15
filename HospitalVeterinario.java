import java.util.ArrayList;
import java.util.List;

public class HospitalVeterinario {


    private List<Atendimento> atendimentos;
    private List<Animal> animais;
    private List<Tutor> tutors;
    private List<Veterinario> veterinarios;

    public HospitalVeterinario() {

        animais = new ArrayList<>();
        veterinarios = new ArrayList<>();
        atendimentos = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println("Animal adicionado: " + animal.getNome());
    }

    public void adicionarVeterinario(Veterinario veterinario) {
        veterinarios.add(veterinario);
        System.out.println("Veterinário adicionado: " + veterinario.getNome() +  " Telefone " + veterinario.getTelefone());
    }


    public void registrarAtendimento(Animal animal, Veterinario veterinario, String descricao) {
        Atendimento atendimento = new Atendimento(animal, veterinario, descricao);
        animal.adicionarAtendimento(atendimento);
        System.out.println("Atendimentos registrado para o animal: " + animal.getNome());
    }




    public List<Atendimento> listaAtendimentosAnimal(Animal animal) {
        List<Atendimento> atendimentosAnimal = new ArrayList<>();
        for (Atendimento atendimento : atendimentos) {
            if (atendimento.getAnimal() == animal) {
                atendimentosAnimal.add(atendimento);
            }
        }
        return atendimentosAnimal;
    }

}