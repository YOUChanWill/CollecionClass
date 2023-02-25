package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Iterator {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new A(111,"A"));
        list.add(new A(222,"B"));
        list.add(new A(333,"C"));

        // 得到实现类对象的迭代器
        java.util.Iterator iterator = list.iterator();

        // 快捷键itit，迭代器遍历
        while (iterator.hasNext()) {// 判断接下来是否还有数据，返回值为bool
            Object obj =  iterator.next();// 得到元素
            System.out.println(obj);
        }

        iterator = list.iterator();// 对迭代器进行重置

        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }


    }


}

class A{
    public int nums;
    public String name;

    public A(int nums, String name) {
        this.nums = nums;
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "nums=" + nums +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return nums == a.nums && Objects.equals(name, a.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nums, name);
    }
}
