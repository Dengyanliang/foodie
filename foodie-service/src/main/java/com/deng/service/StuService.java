package com.deng.service;

import com.deng.pojo.Stu;

public interface StuService {

    public Stu getStuInfo(int id);

    public void saveStu();

    public void updateStu(int id);

    public void deleteStu(int id);

    public void saveParent(int parentId);
    public void saveChildren();
}
