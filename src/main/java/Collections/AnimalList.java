package Collections;

public class AnimalList {
    private AnimalListItem head;


    public void add(Animal animal) {
        AnimalListItem new_item = new AnimalListItem(animal);
        AnimalListItem last_item = head;
        while (last_item.getNext() != null) {
            last_item = last_item.getNext();
        }

        last_item.setNext(new_item);
    }

    public void remove(Animal animal) {
        AnimalListItem item = head;

        while (item.getNext() != null) {
            if (item.getNext().getValue().equals(animal)) {
                item.setNext(item.getNext().getNext());
            }
        }

        if (head.getValue().equals(animal)) {
            head = head.getNext();
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        AnimalListItem item = head;
        while (item.getNext() != null) {
            result.append(item).append("->");
        }
        return result.toString();
    }
}
