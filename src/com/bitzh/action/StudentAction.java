package com.bitzh.action;

import com.bitzh.dao.StudentDao;
import com.bitzh.entity.StudentEntity;

import java.util.List;


public class StudentAction {
    StudentDao studentDao=new StudentDao();
    StudentEntity studentEntity;
    List<StudentEntity> studentEntityList;
    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    public List<StudentEntity> getStudentEntityList() {
        return studentEntityList;
    }

    public void setStudentEntityList(List<StudentEntity> studentEntityList) {
        this.studentEntityList = studentEntityList;
    }
    public String GetList(){
        studentEntityList = studentDao.listProduct();
        return "showList";
    }
    public String GetDelete(){
        studentDao.deleteProduct(studentEntity.getId());
        return "GetList";
    }
    public String GetDetail(){
        studentDao.getDetail(studentEntity.getId());
        return "showDetail";
    }
    public String GetUpdate(){
        studentDao.updateProduct(studentEntity);
        return "GetList";
    }
    public String GetInsert(){
        studentDao.addProduct(studentEntity);
        return "GetList";
    }


}
