/*
 * This file is generated by jOOQ.
 */
package net.tongark.springboot.releasesqljooq.generated;


import net.tongark.springboot.releasesqljooq.generated.tables.TAccount;
import net.tongark.springboot.releasesqljooq.generated.tables.records.AccountRecord;

import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>test01</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AccountRecord, Integer> IDENTITY_T_ACCOUNT = Identities0.IDENTITY_T_ACCOUNT;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccountRecord> KEY_T_ACCOUNT_PRIMARY = UniqueKeys0.KEY_T_ACCOUNT_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<AccountRecord, Integer> IDENTITY_T_ACCOUNT = Internal.createIdentity(TAccount.T_ACCOUNT, TAccount.T_ACCOUNT.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AccountRecord> KEY_T_ACCOUNT_PRIMARY = Internal.createUniqueKey(TAccount.T_ACCOUNT, "KEY_t_account_PRIMARY", new TableField[] { TAccount.T_ACCOUNT.ID }, true);
    }
}
