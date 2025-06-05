package com.rizwan.banking.services;

import java.util.List;

public interface AbstractService<T>{

    Integer save(T dto);

    List<T> findALl();

    T findById(Integer id);

    void delete(Integer id);
}
