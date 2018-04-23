package org.homeage.domain.repositories;

import java.util.Optional;

import org.homeage.business.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
	Optional<Account> getByAcctNumber(String acctNumber);

	boolean existsByAcctNumber(String acctNumber);

	boolean existsByEmailAddress(String emailAddress);
}