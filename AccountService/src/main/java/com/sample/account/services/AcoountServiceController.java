package com.sample.account.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class AcoountServiceController {
	
	@Autowired
	protected AccountRepository accountRepository;
	
	@RequestMapping("/accounts/{accountNumber}")
	public Account fetchAccByNumber(@PathVariable("accountNumber") String accountNumber){
		
		Account account=null;
		 account=accountRepository.findByNumber(accountNumber);
		
		 if (account == null)
				throw new AccountNotFoundException(accountNumber);
			else {
				return account;
			}
		
	}
	@RequestMapping("/accounts/owner/{name}")
	public List<Account> fetchByName(@PathVariable("name") String name){
		
		
		List<Account> accounts=accountRepository.findByOwner(name);
		
		if (accounts == null || accounts.size() == 0)
			throw new AccountNotFoundException(name);
		else {
			return accounts;
		}
		
	}
	
	
	

}
