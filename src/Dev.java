import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Curso> cursosInscritos = new LinkedHashSet<>();
    private Set<Curso> cursosConcluidos = new LinkedHashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Set<Curso> getCursosInscritos() { return cursosInscritos; }
    public Set<Curso> getCursosConcluidos() { return cursosConcluidos; }

    // Método para inscrever em curso
    public void inscreverCurso(Curso curso) {
        cursosInscritos.add(curso);
    }

    // Método para concluir curso
    public void concluirCurso(Curso curso) {
        if(cursosInscritos.contains(curso)) {
            cursosInscritos.remove(curso);
            cursosConcluidos.add(curso);
        }
    }
}
