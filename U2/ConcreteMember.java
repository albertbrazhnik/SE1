package U2;

public class ConcreteMember implements Member {
    private final Integer id;  // ID wird einmal gesetzt und darf nicht verändert werden

    // Konstruktor
    public ConcreteMember(Integer id) {
        this.id = id;
    }

    //getID aus Interface
    @Override
    public Integer getID() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Member (ID = " + id + ")";
    }
}
