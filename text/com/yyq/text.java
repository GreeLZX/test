package com.yyq;

import com.bitzh.entity.StudentEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class text {
    Configuration config = null;
    SessionFactory sessionFactory = null;
    Session session = null;
    Transaction tx = null;
    @Before
    public void init() {
        config = new Configuration().configure("hibernate.cfg.xml");
        sessionFactory = config.buildSessionFactory();
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
    }
    //增加
    @Test
    public void insert() {
        StudentEntity st = new StudentEntity();
        st.setName("Anny");
        st.setId(10);
        st.setAge(18);
        st.setCname("软工五班");
        st.setSex("男");
        session.save(st);
        tx.commit();
        session.close();
    }
    //修改
    @Test
    public void update() {
        StudentEntity student = (StudentEntity) session.get(StudentEntity.class, new Integer(7));
        student.setName("Penny");
        session.update(student);
        tx.commit();
        session.close();
    }
    //查找
    @Test
    public void getById() {
        StudentEntity student = (StudentEntity) session.get(StudentEntity.class, new Integer(7));
        tx.commit();
        session.close();
        System.out.println("学号：" + student.getId() + "；姓名：" + student.getName() +
                "；年龄：" + student.getAge() + "；班级：" + student.getCname() + ";年龄：" + student.getAge());
    }
    //删除
    @Test
    public void delete() {
        StudentEntity student = session.get(StudentEntity.class, new Integer(9));
        session.delete(student);
        tx.commit();
        session.close();
    }
}