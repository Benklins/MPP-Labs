package lab11.prob2;

import java.util.*;

public class GroupUtil {

    public static <E> Group<E> copy(Group<E> group) {
        List<E> elements = group.getElements();
        return new Group<>(group.getSpecialElement(), elements);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6);
        Group<Integer> group = new Group<>(0, list);
        System.out.println(group);
        System.out.println(GroupUtil.copy(group));
    }
}
