package com.studentMarksheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.studentMarksheet.entity.MarkSheet;
import com.studentMarksheet.service.MarksheetService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class MarksheetController {
	@Autowired
	private MarksheetService ms;
	
	@GetMapping("/getMarkSheet")
	public List<MarkSheet> getAllMarkSheet() {
		return ms.getAllMarkSheet();
	}
	
	@PostMapping("/postMarkSheets")
	public String postMarkSheets(@RequestBody List<MarkSheet> markSheet) {
		return ms.postMarkSheets(markSheet);		
	}
	
	@GetMapping("/getByRollNum/{rollNo}")
	public MarkSheet getByRollNum(@PathVariable int rollNo) {
		return ms.getByRollNum(rollNo);
	}
}
