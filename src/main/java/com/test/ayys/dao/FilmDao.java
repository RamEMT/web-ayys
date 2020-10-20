package com.test.ayys.dao;

import com.test.ayys.entity.Film;

import java.util.List;

public interface FilmDao {

    /**
     * 获取字段数据
     * @return 数据集合
     */
    List<Film> selectList();
}
