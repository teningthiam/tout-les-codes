@Entity
public class Etudiant {
    private long id;
    private String nom;
    private  int age;

    public long getInt(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public Strng getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
