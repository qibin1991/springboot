/*
 * This file is generated by jOOQ.
 */
package net.tongark.springboot.releasesqljooq.generated.tables.daos;


import java.util.List;

import net.tongark.springboot.releasesqljooq.generated.tables.TAccount;
import net.tongark.springboot.releasesqljooq.generated.tables.pojos.Account;
import net.tongark.springboot.releasesqljooq.generated.tables.records.AccountRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountDao extends DAOImpl<AccountRecord, Account, Integer> {

    /**
     * Create a new TAccountDao without any configuration
     */
    public AccountDao() {
        super(TAccount.T_ACCOUNT, Account.class);
    }

    /**
     * Create a new TAccountDao with an attached configuration
     */
    public AccountDao(Configuration configuration) {
        super(TAccount.T_ACCOUNT, Account.class, configuration);
    }

    @Override
    public Integer getId(Account object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<Account> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(TAccount.T_ACCOUNT.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<Account> fetchById(Integer... values) {
        return fetch(TAccount.T_ACCOUNT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Account fetchOneById(Integer value) {
        return fetchOne(TAccount.T_ACCOUNT.ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<Account> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(TAccount.T_ACCOUNT.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<Account> fetchByName(String... values) {
        return fetch(TAccount.T_ACCOUNT.NAME, values);
    }
}
