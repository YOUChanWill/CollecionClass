package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new A(1,"Q"));
        list.add(new A(2,"W"));
        list.add(new A(3,"E"));

        // 增强for，底层使用的是迭代器，快捷键I
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
