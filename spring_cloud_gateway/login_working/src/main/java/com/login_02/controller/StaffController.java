package com.login_02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login_02.entity.Staff;
import com.login_02.myconfig.repo.StaffRepo;

@RestController
@RequestMapping("/admin")
public class StaffController {
	@Autowired
	private StaffRepo staffRepo;

//	@RequestMapping("/welcome")
//	public String welocome() {
//		return "siddu";
//	}
	
	@PostMapping("/addStaff")
	public ResponseEntity<Staff> addStaff(@RequestBody Staff staff){
		Staff save = staffRepo.save(staff);
		return new ResponseEntity<Staff>(save,HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Staff>> getAllStaff(){
		List<Staff> findAll = staffRepo.findAll();
		return new ResponseEntity<List<Staff>>(findAll,HttpStatus.OK);
	}
	@GetMapping("/delete/{id}")
	public ResponseEntity<String> deleteStaffById(@PathVariable Integer id){
		staffRepo.deleteById(id);
		return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);
	}
	
}
