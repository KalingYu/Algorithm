package Graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kaling on 12/3/15.
 */
public class Bag<Item> implements Iterable<Item> {

    /**
     * 背包数目
     */
    private int N;

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    Bag() {

    }

    /**
     * 添加元素
     *
     * @param item
     */
    public void add(Item item) {

    }

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return N;
    }

    List list = new ArrayList<>();


}
