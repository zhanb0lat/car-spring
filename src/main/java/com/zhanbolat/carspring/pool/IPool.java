package com.zhanbolat.carspring.pool;

import java.util.Collection;

/**
 * Created by Computer308 on 27.12.2016.
 */
public interface IPool<T> {
    Collection<T> getItems();
    void setItems(Collection<T> items);
}
