@Entity
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matrícula;

    private String nome;

    @ManyToMany(mappedBy = "alunos")
    private List<Curso> cursos;

    public Aluno() {}

    public Aluno(int matrícula, String nome) {
        this.matrícula = matrícula;
        this.nome = nome;
    }

    public int getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(int matrícula) {
        this.matrícula = matrícula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
