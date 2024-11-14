package com.studentMarksheet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentMarksheet.dao.MarksheetDAO;
import com.studentMarksheet.entity.MarkSheet;

@Service
public class MarksheetService {
	@Autowired
	private MarksheetDAO md;

	public List<MarkSheet> getAllMarkSheet() {
		return md.getAllMarkSheet();
	}

	public String postMarkSheets(List<MarkSheet> markSheet) {
		markSheet.stream().forEach(x->{
			x.setSem1Total(x.getSem1Theory()+x.getSem1Practicals());
			x.setSem2Total(x.getSem2Theory()+x.getSem2Practicals());			
			});
		return md.postMarkSheets(markSheet);
	}

	public MarkSheet getByRollNum(int rollNo) {
		return md.getByRollNum(rollNo);
	}
}
