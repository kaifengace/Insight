package com.UHT.Insight.daoimpl;

import com.UHT.Insight.dao.UserDao;
import com.UHT.Insight.daoImpl.UserDaoImpl;
import com.UHT.Insight.pojo.Uuser;
import org.junit.Test;

import java.util.List;

public class UserTest {
    private UserDaoImpl userDao=new UserDaoImpl();
    @Test
    public void findAll() {
           System.out.println(userDao.findAll());
        }
    @Test
    public void findUserById() {
            System.out.println(userDao.findUserById(1212));
        }
    @Test
    public void deleteUser() {
        System.out.println(userDao.deleteUser(1212));
        }
    @Test
    public void updateUser() {
        Uuser uuser=new Uuser(122,"小把","242","2321323",1,"213","2321");
        System.out.println(userDao.updateUser(uuser));
        }
    @Test
    public void saveUser() {
        Uuser uuser=new Uuser(122,"小艾","2232133132","2321323",1,"213","2321");
        System.out.println(userDao.saveUser(uuser));
        }
}

