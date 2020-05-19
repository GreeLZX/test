package com.bitzh.dao;

    import com.bitzh.entity.StudentEntity;
    import org.hibernate.*;
    import org.hibernate.cfg.Configuration;
    import org.hibernate.query.Query;


    import java.util.ArrayList;
    import java.util.List;

public class StudentDao {
    Configuration config = new Configuration().configure("hibernate.cfg.xml");
    SessionFactory sessionFactory = config.buildSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction tx = session.beginTransaction();
    public List<StudentEntity> listProduct(){
        Query query = session.createQuery("from StudentEntity ");
        List<StudentEntity> result = query.list();
        tx.commit();
        session.close();
        return result;
    }
    public void deleteProduct(int id){
        StudentEntity studentEntity=session.get(StudentEntity.class,id);
        session.delete(studentEntity);
        tx.commit();
        session.close();
    }
    public void addProduct(StudentEntity studentEntity){
        session.save(studentEntity);
        tx.commit();
        session.close();
    }
    public StudentEntity getDetail(int id) {
        StudentEntity result;
        result= session.get(StudentEntity.class,id);
        tx.commit();
        session.close();
        return result;
    }
    public void updateProduct(StudentEntity studentEntity){
        session.update(studentEntity);
        tx.commit();
        session.close();
    }
}
