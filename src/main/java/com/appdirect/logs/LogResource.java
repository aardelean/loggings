package com.appdirect.logs;


import org.springframework.data.repository.PagingAndSortingRepository;

public interface LogResource extends PagingAndSortingRepository<Log, Long>{
}
