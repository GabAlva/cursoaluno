import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Principal {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("alunos-cursos");
        EntityManager em = emf.createEntityManager();

        Aluno aluno = new Aluno(1, "João da Silva");

        Curso curso = new Curso("INF001", "Programação Java", 60);

        aluno.getCursos().add(curso);
        curso.getAlunos().add(aluno);
        em.getTransaction().begin();
        em.persist(aluno);
        em.persist(curso);
        em.getTransaction().commit();

        Query query = em.createQuery("SELECT a FROM Aluno a");
        List<Aluno> alunos = query.getResultList();

        for (Aluno a : alunos) {
            System.out.println(a);
        }

        em.close();
        emf.close();
    }
}