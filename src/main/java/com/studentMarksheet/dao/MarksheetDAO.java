package com.studentMarksheet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentMarksheet.entity.MarkSheet;
import com.studentMarksheet.repository.MarksheetRepository;

@Repository
public class MarksheetDAO {
	@Autowired
	private MarksheetRepository mr;

	public List<MarkSheet> getAllMarkSheet() {
		return mr.findAll();
	}

	public String postMarkSheets(List<MarkSheet> markSheet) {
		mr.saveAll(markSheet);
		return "Posted!!";
	}

	public MarkSheet getByRollNum(int rollNo) {
		return mr.getByRollNum(rollNo);
	}
}
