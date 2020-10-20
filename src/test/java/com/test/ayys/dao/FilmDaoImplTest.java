package com.test.ayys.dao;

import com.test.ayys.dao.impl.FilmDaoImpl;
import com.test.ayys.entity.Film;

import java.util.List;

public class FilmDaoImplTest {
    public static void main(String[] args) {
        FilmDao filmDao = new FilmDaoImpl();
        List<Film> films = filmDao.selectList();
        System.out.println(films);
    }
}
