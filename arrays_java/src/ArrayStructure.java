public class ArrayStructure {
    public static void main(String[] args) {
        String [] tarefas = {"Estudar Java", "Fazer exercícios", "Tomar café"};

        System.out.println(tarefas[0]);
        System.out.println(tarefas[1]);
        System.out.println(tarefas[2]);

        tarefas[2] = "Limpar a casa";
        System.out.println(tarefas[2]);

        System.out.println("Você possui " + tarefas.length + " tarefas.");
    }
}
