package Collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {

    @Test
    void add() {
        Animal a = new Animal("Pferd");
        AnimalList a_list = new AnimalList();

        a_list.add(a);

        assertEquals("", a_list.toString());
    }

    @Test
    void remove() {
    }

    @Test
    void testToString() {

        Animal a = new Animal("Pferd");
        Animal b = new Animal("Affe");
        Animal c = new Animal("Katze");
        AnimalList a_list = new AnimalList();

        a_list.add(a);
        a_list.add(b);
        a_list.add(c);

        assertEquals("", a_list.toString());
    }
}