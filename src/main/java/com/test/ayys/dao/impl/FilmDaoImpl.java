package com.test.ayys.dao.impl;

import com.test.ayys.dao.FilmDao;
import com.test.ayys.entity.Film;
import com.test.ayys.utils.DBUtils;
import com.test.ayys.utils.DbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmDaoImpl implements FilmDao {
    @Override
    public List<Film> selectList() {
        /*Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rSet = null;
        List<Film> list = new ArrayList<>();
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement("select id, image, name from film");
            rSet = ps.executeQuery();
            while (rSet.next()){
                String id = rSet.getString(1);
                String image = rSet.getString(2);
                String name = rSet.getString(3);
                Film film = new Film();
                film.setId(id);
                film.setImage(image);
                film.setName(name);
                list.add(film);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rSet,ps,conn);
        }
        return list;*/
        String sql = "select * from film";
        return DbManager.commonQuery(sql,Film.class,null);
    }
}
