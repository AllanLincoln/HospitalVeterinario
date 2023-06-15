import java.util.List;

public class Programa {


    public static void main(String[] args) {
        HospitalVeterinario hospital = new HospitalVeterinario();

        // Adcionando veterinários
        Veterinario vet1 = new Veterinario("Dr. Silva", "1234 - 6789");
        Veterinario vet2 = new Veterinario("Dr. Souza", "9876 - 4321");
        hospital.adicionarVeterinario(vet1);
        hospital.adicionarVeterinario(vet2);
        System.out.println("========== ========== ========== ========= ========== ========== ========== ==========");

        // Adicionando nome dos animais
        Animal cachorro1 = new Animal("Scooby", new Tutor("Salsicha", "132465789"));
        Animal cachorro2 = new Animal("Floquinho", new Tutor("Cebolinha", "132465789"));
        Animal gato1 = new Animal("DeBotas",  new Tutor("Shrek", "132465789"));
        Animal gato2 = new Animal("Tom",  new Tutor("Jerry", "132465789"));
        hospital.adicionarAnimal(cachorro1);
        hospital.adicionarAnimal(cachorro2);
        hospital.adicionarAnimal(gato1);
        hospital.adicionarAnimal(gato2);
        System.out.println("========== ========== ========== ========= ========== ========== ========== ==========");


        // Registrando atendimentos
        hospital.registrarAtendimento(cachorro1, vet1, "Exame de rotina");
        hospital.registrarAtendimento(cachorro2, vet2, "Vacinação anual");
        hospital.registrarAtendimento(gato1, vet1, "Consulta de sintomas");
        hospital.registrarAtendimento(gato2, vet2, "Exame de rotina");
        System.out.println("========== ========== ========== ========= ========== ========== ========== ==========");

        System.out.println("Registro de atendimento: " + vet1.getNome() + ": " + "Animal: " +  cachorro1.getNome() + " Tutor: " + cachorro1.getTutor() +  " Modelo de exame: Exame de rotina" );
        System.out.println("========== ========== ========== ========= ========== ========== ========== ==========");
        System.out.println("Registro de atendimento: " + vet2.getNome() + ": " + "Animal: " +  cachorro2.getNome() + " Tutor: " + cachorro2.getTutor() +  " Modelo de exame: Vacinação anual" );
        System.out.println("========== ========== ========== ========= ========== ========== ========== ==========");
        System.out.println("Registro de atendimento: " + vet1.getNome() + ": " + "Animal: " +  gato1.getNome() + " Tutor: " + gato1.getTutor() +          " Modelo de exame: Consulta de sintomas" );
        System.out.println("========== ========== ========== ========= ========== ========== ========== ==========");
        System.out.println("Registro de atendimento: " + vet2.getNome() + ": " + "Animal: " +  gato2.getNome() + " Tutor: " + gato2.getTutor() +          " Modelo de exame: Exame de rotina" );

        // Listando atendimentos do animal
        List<Atendimento> atendimentosCachorro1 = hospital.listaAtendimentosAnimal(cachorro1);
        for (Atendimento atendimentos : atendimentosCachorro1);

    }


}
