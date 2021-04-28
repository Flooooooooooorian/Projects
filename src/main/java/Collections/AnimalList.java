package Collections;

public class AnimalList {
    private AnimalListItem head;


    public void add(Animal animal) {
        AnimalListItem new_item = new AnimalListItem(animal);
        if (head == null) {
            head = new_item;
            return;
        }
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
        String result = "";
        AnimalListItem item = head;

        if (head != null) {
            result = head.toString();

            while (item.getNext() != null) {
                result += " -> " + item.getNext();

                item = item.getNext();
            }
        } else {
            return "List is empty!";
        }

        return result;
    }
}
