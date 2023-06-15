public class Atendimento {
    private Animal animal;
    private Veterinario veterinario;
    private String descricao;
    public Atendimento(Animal animal, Veterinario veterinario, String descricao) {
        this.animal = animal;
        this.veterinario = veterinario;
        this.descricao = descricao;
    }

    public Animal getAnimal(){
        return animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public String getDescricao() {
        return descricao;
    }
}
