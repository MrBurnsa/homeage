package org.homeage.domain.repositories;

import org.homeage.business.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
	Account getByAcctNumber(String acctNumber);
}