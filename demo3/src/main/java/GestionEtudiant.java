public class GestionEtudiant {
    private EntityManagementFactory emf = Persistence.createEntityManagementFactory("StudentPU");
  public void addStudent(Student student){
      EntityManager em = emf.createEntityManager();
      em.getTransaction().begin();
      em.persist(student);
      em.geTransaction().commit();
      em.close();
  }
}
