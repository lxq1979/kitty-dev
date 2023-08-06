package com.louis.kitty.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.louis.kitty.admin.sevice.BackupService;
import com.louis.kitty.core.http.HttpResult;

@RestController
@RequestMapping("backup")
public class BackupController {

    @Autowired
    private BackupService backupService;


    //	@GetMapping(value="/findrecords")
//	public HttpResult findrecords(@RequestParam String id) {
//		System.out.println("received id:"+id);
//		return HttpResult.ok(backupService.findById(Long.valueOf(id)));
//	}
    @GetMapping(value = "/findRecords")
    public HttpResult findrecords() {
        return HttpResult.ok(backupService.findAll());
    }
}
