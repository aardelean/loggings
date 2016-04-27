package com.appdirect.logs;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface LogRepository extends PagingAndSortingRepository<Log, String>{

	@RestResource(path = "type", rel = "type")
	public Page<Log> findByType(@Param("name") String type, Pageable p);
}
