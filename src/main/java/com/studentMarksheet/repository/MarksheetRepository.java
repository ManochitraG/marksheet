package com.studentMarksheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentMarksheet.entity.MarkSheet;

public interface MarksheetRepository extends JpaRepository<MarkSheet, Integer>{
	
	@Query(value="SELECT * FROM mark_sheet WHERE roll_number=?",nativeQuery = true)
	MarkSheet getByRollNum(int rollNo);

}
