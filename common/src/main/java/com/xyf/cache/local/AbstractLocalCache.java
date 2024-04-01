package com.xyf.cache.local;

public abstract class AbstractLocalCache<T> implements LocalCacheInterface<T>{
    @Override
    public T getCache(String key) {
        return null;
    }

    @Override
    public T removeCache(String key) {
        return null;
    }

    @Override
    public T refreshCache(String key) {
        return null;
    }


}
