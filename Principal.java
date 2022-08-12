package serializacao;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Principal {
    public static void main(String[] args) {
        serializaAluno();
      

    }

    private static void serializaAluno() {
        Aluno aluno = new Aluno(862,"Paula");
        try (ObjectOutputStream exem = new ObjectOutputStream(new FileOutputStream("PaulaBeatriz.io"))){
        	exem.writeObject(aluno);
        	exem.close();
            } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

private static void desserializarAluno() {
Aluno aluno = null;
   try {
    FileInputStream exem = new FileInputStream("PaulaBeatriz.io");
    ObjectInputStream entradaAluno = new ObjectInputStream(exem);
    aluno = (Aluno) entradaAluno.readObject();
    System.out.printf("Nome", aluno.getNome(), aluno.getMatricula());
    exem.close();
} catch (IOException e) {
    System.out.println("Erro");
} catch (ClassNotFoundException ex) {
    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
} 
}
}