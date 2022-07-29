public class MainAluno {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("Adelson", 8.5f);

        System.out.println(aluno.getNome());
        System.out.println(aluno.getNota());

        aluno.setNome("Rayssa");
        aluno.setNota(9);

        System.out.println("\n");

        System.out.println(aluno.getNome());
        System.out.println(aluno.getNota());
    }
}
