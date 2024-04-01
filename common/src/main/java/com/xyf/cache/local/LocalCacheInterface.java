package com.xyf.cache.local;

public interface LocalCacheInterface<T> {
    T getCache(String key);

    T removeCache(String key);

    T refreshCache(String key);
}
