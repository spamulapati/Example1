package com.sample.account.services;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{
	
	public Account findByNumber(String accountNumber);
	
	
	public List<Account> findByOwner(String partialName);
	
	@Query("SELECT count(*) from Account")
	public int countAccounts();

}
