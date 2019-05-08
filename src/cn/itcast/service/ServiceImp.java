package cn.itcast.service;

import cn.itcast.dao.DaoImp;
import cn.itcast.domain.User;

public class ServiceImp {
    public User login(User u) {
        DaoImp d = new DaoImp();
        return d.login(u);
    }
}
