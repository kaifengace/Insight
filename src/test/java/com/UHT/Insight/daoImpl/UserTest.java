package com.UHT.Insight.daoImpl;

import com.UHT.Insight.pojo.Uuser;
import org.junit.Test;

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
    public void findUserByPhone() {
        Uuser user=userDao.findUserByPhone("18814233820");
        System.out.println(user.getUU_PHONE());
    }
    @Test
    public void deleteUser() {
        System.out.println(userDao.deleteUser(1212));
        }
    @Test
    public void updateUser() {
 //       Uuser uuser=new Uuser(1221,"小把","242","2321323",1,"213","2321");
 //       System.out.println(userDao.updateUser(uuser));
        }
    @Test
    public void saveUser() {
        Uuser uuser=new Uuser();
        uuser.setUU_PHONE("18814233822");
        uuser.setPASSWORD("123456");
        userDao.saveUser(uuser);
        //System.out.println(userDao.saveUser(uuser));
        //利用MBG生成了Uuser 的内容，以往测试用例已失效 --HN
        }
}

