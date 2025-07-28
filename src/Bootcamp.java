import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private Set<Curso> cursos = new HashSet<>();
    private Set<Mentoria> mentorias = new HashSet<>();
    private Set<Dev> devsInscritos = new HashSet<>();

    // Construtor
    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Getters e setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Set<Curso> getCursos() { return cursos; }
    public void adicionarCurso(Curso curso) { this.cursos.add(curso); }

    public Set<Mentoria> getMentorias() { return mentorias; }
    public void adicionarMentoria(Mentoria mentoria) { this.mentorias.add(mentoria); }

    public Set<Dev> getDevsInscritos() { return devsInscritos; }
    public void inscreverDev(Dev dev) { this.devsInscritos.add(dev); }
}
