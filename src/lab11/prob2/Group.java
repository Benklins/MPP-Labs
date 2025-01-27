package lab11.prob2;

import java.util.*;

public class Group<E> {
    private final E specialElement;
    private List<E> elements = new ArrayList<>();

    public Group(E special, List<E> elements) {
        this.specialElement = special;
        this.elements = elements;
    }

    public E getSpecialElement() {
        return specialElement;
    }

    public List<E> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return "[special : " + specialElement.toString()
                + ", elements :\n   " + elements.toString() + "]";
    }


}
