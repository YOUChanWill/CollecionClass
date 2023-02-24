package HashSet;

import java.util.HashSet;
import java.util.Objects;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        A p1 = new A(1001, "AA");
        A p2 = new A(1002, "BB");

        set.add(p1);// 经过hash运算放在1
        set.add(p2);// 经过hash运算放在2

        p1.str = "CC";// 修改之后经过hash运算得到p1不在原先的1位置
        set.remove(p1);// 但是实际上p1还是在原先的位置，因此无法删除
        System.out.println(set);

        set.add(new A(1001,"CC"));
        System.out.println(set);

        set.add(new A(1001,"AA"));
        System.out.println(set);
    }
}

class A{
    public int num;
    public String str;

    public A(int num, String str) {
        this.num = num;
        this.str = str;
    }

    // 重写equals和hashcode方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return num == a.num && Objects.equals(str, a.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, str);
    }

    @Override
    public String toString() {
        return "A{" +
                "num=" + num +
                ", str='" + str + '\'' +
                '}';
    }
}