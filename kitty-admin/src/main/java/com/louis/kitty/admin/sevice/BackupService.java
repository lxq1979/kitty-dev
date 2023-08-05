package com.louis.kitty.admin.sevice;
 import java.util.List;

import com.louis.kitty.admin.model.Backup;
import com.louis.kitty.core.service.CurdService;

public interface BackupService extends CurdService<Backup> {
	   List<Backup> findAll();
}