package U2;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private List<Member> members;  // Liste zur Speicherung von Member-Objekten

    public Container() {
        this.members = new ArrayList<>();
    }

    // FA1
    public void addMember(Member member) throws ContainerException {
        for (Member m : members) {
            if (m.getID().equals(member.getID())) {
                throw new ContainerException("Das Member-Objekt mit der ID " + member.getID() + " ist bereits vorhanden!");
            }
        }
        members.add(member);
    }

    // FA2
    public String deleteMember(Integer id) {
        for (Member m : members) {
            if (m.getID().equals(id)) {
                members.remove(m);
                return "Member mit ID " + id + " gelöscht.";
            }
        }
        return "Kein Member mit ID " + id + " gefunden.";
    }

    // FA3
    public void dump() {
        for (Member m : members) {
            System.out.println(m.toString());
        }
    }

    // FA4
    public int size() {
        return members.size();
    }
}