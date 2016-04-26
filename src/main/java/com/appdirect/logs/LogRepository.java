package com.appdirect.logs;


import org.springframework.data.repository.PagingAndSortingRepository;

public interface LogRepository extends PagingAndSortingRepository<Log, Long>{
}
