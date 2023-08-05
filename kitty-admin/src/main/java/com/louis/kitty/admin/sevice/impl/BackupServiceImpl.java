package com.louis.kitty.admin.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.admin.model.Backup;
import com.louis.kitty.admin.model.SysDept;
import com.louis.kitty.admin.dao.BackupMapper;
 
import com.louis.kitty.admin.sevice.BackupService;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

@Service
public class BackupServiceImpl implements BackupService{

	@Autowired
	private BackupMapper backupMapper;
	
	@Override
	public int save(Backup record) {
		if(record.getId() == null || record.getId() == 0) {
			return backupMapper.insertSelective(record);
		}
		return backupMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int delete(Backup record) {
		// TODO Auto-generated method stub
		return backupMapper.deleteByPrimaryKey(record.getId());
	}

	@Override
	public int delete(List<Backup> records) {
		// TODO Auto-generated method stub
		for(Backup record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public Backup findById(Long id) {
		return backupMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, backupMapper);
	}

	@Override
	public List<Backup> findAll() {
		return backupMapper.findAll();
	}
	
	

}
