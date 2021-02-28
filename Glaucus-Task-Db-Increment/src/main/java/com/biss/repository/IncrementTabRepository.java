package com.biss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.biss.model.IncrementTab;

public interface IncrementTabRepository extends JpaRepository<IncrementTab,Integer>{
	/*Use update query for increment bcoz
	 *The UPDATE query takes a lock on the modified rows, 
	 *preventing other transactions from modifying 
	 *the same row before the current transaction commits 
	*/
	@Modifying
	@Query("UPDATE IncrementTab i set i.counter=i.counter+1 where i.id=1")
	void incrCounter();
}
