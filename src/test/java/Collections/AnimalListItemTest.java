package Collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListItemTest {

    @Test
    void getValue() {
        Animal a = new Animal("Pferd");
        AnimalListItem a_item = new AnimalListItem(a);

        assertEquals(a, a_item.getValue());
    }

    @Test
    void setValue() {
        Animal a = new Animal("Pferd");
        Animal b = new Animal("Affe");
        AnimalListItem a_item = new AnimalListItem(b);
        a_item.setValue(a);

        assertEquals(a, a_item.getValue());
    }

    @Test
    void getNext() {
        Animal b = new Animal("Pferd");
        AnimalListItem a_item = new AnimalListItem(b);
        AnimalListItem b_item = new AnimalListItem(b);

        b_item.setNext(a_item);

        assertEquals(a_item, b_item.getNext());
    }

    @Test
    void setNext() {
        Animal b = new Animal("Pferd");
        AnimalListItem a_item = new AnimalListItem(b);
        AnimalListItem b_item = new AnimalListItem(b);
        a_item.setNext(b_item);

        assertEquals(b_item, a_item.getNext());
    }

    @Test
    void testToString() {
        Animal b = new Animal("Pferd");
        AnimalListItem a_item = new AnimalListItem(b);

        assertEquals("Pferd", a_item.toString());
    }
}