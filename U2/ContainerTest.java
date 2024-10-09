package U2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    @Test
    void testAddMember() throws ContainerException {
        Container container = new Container();
        Member member1 = new ConcreteMember(1);
        Member member2 = new ConcreteMember(2);
        container.addMember(member1);
        container.addMember(member2);
        assertEquals(2, container.size());
    }

    @Test
    void testAddDuplicateMember() {
        Container container = new Container();
        Member member1 = new ConcreteMember(1);

        assertThrows(ContainerException.class, () -> {
            container.addMember(member1);
            container.addMember(member1);  // Duplicate
        });
    }

    @Test
    void testDeleteMember() throws ContainerException {
        Container container = new Container();
        Member member1 = new ConcreteMember(1);
        container.addMember(member1);
        assertEquals("Member mit ID 1 gelöscht.", container.deleteMember(1));
        assertEquals(0, container.size());
    }

    @Test
    void testDeleteNonExistentMember() {
        Container container = new Container();
        assertEquals("Kein Member mit ID 1 gefunden.", container.deleteMember(1));
    }

    @Test
    void testDump() throws ContainerException {
        Container container = new Container();
        Member member1 = new ConcreteMember(1);
        Member member2 = new ConcreteMember(2);
        container.addMember(member1);
        container.addMember(member2);

        container.dump();
        // This should print:
        // Member (ID = 1)
        // Member (ID = 2)
    }

    @Test
    void testSize() throws ContainerException {
        Container container = new Container();
        assertEquals(0, container.size());
        Member member1 = new ConcreteMember(1);
        container.addMember(member1);
        assertEquals(1, container.size());
    }
}
