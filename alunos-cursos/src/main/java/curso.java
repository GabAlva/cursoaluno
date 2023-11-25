@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    private String código;

    private String nome;

    private int cargaHorária;

    @ManyToMany(mappedBy = "cursos")
    private List<Aluno> alunos;

    public Curso() {}

    public Curso(String código, String nome, int cargaHorária) {
        this.código = código;
        this.nome = nome;
        this.cargaHorária = cargaHorária;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHorária() {
        return cargaHorária;
    }

    public void setCargaHorária(int cargaHorária) {
        this.cargaHorária = cargaHorária;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
