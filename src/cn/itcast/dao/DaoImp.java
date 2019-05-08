package cn.itcast.dao;

import cn.itcast.domain.User;
import cn.itcast.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class DaoImp {
    JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
    public User login(User u) {
        User user;
        try {
            String sql = "select * from user where username=? ";
            user = jt.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), u.getUsername());
        } catch (Exception e) {
            return null;
        }

        return user;
    }
}
