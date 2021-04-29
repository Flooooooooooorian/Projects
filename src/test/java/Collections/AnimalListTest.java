package Collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {

    @Test
    void add() {
        Animal a = new Animal("Pferd");
        AnimalList a_list = new AnimalList();

        a_list.add(a);

        assertEquals("Pferd", a_list.toString());
    }

    @Test
    void removeFirst() {
        Animal a = new Animal("Affe");
        Animal b = new Animal("Pferd");
        AnimalList a_list = new AnimalList();

        a_list.add(a);
        a_list.add(b);


        assertEquals("Affe -> Pferd", a_list.toString());

        a_list.remove(a);

        assertEquals("Pferd", a_list.toString());
    }

    @Test
    void removeMultiple() {
        Animal a = new Animal("Affe");
        Animal b = new Animal("Pferd");
        Animal c = new Animal("Affe");
        Animal d = new Animal("Affe");
        Animal e = new Animal("Hund");
        Animal f = new Animal("Affe");
        AnimalList a_list = new AnimalList();

        a_list.add(a);
        a_list.add(b);
        a_list.add(c);
        a_list.add(d);
        a_list.add(e);
        a_list.add(f);

        assertEquals("Affe -> Pferd -> Affe -> Affe -> Hund -> Affe", a_list.toString());

        a_list.remove(a);

        assertEquals("Pferd -> Hund", a_list.toString());
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

        assertEquals("Pferd -> Affe -> Katze", a_list.toString());
    }
}