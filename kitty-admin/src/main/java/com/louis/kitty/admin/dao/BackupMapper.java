package com.louis.kitty.admin.dao;

import java.util.List;

import com.louis.kitty.admin.model.Backup;

 

public interface BackupMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Backup record);

    int insertSelective(Backup record);

    Backup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Backup record);

    int updateByPrimaryKey(Backup record);
    
    List<Backup> findPage();
    
    List<Backup> findAll();
}
