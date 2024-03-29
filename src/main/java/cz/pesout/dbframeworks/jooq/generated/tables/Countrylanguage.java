/*
 * This file is generated by jOOQ.
 */
package cz.pesout.dbframeworks.jooq.generated.tables;


import cz.pesout.dbframeworks.jooq.generated.Indexes;
import cz.pesout.dbframeworks.jooq.generated.Keys;
import cz.pesout.dbframeworks.jooq.generated.tables.records.CountrylanguageRecord;
import cz.pesout.dbframeworks.jooq.generated.World;
import cz.pesout.dbframeworks.jooq.generated.enums.CountrylanguageIsofficial;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Countrylanguage extends TableImpl<CountrylanguageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>world.countrylanguage</code>
     */
    public static final Countrylanguage COUNTRYLANGUAGE = new Countrylanguage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CountrylanguageRecord> getRecordType() {
        return CountrylanguageRecord.class;
    }

    /**
     * The column <code>world.countrylanguage.CountryCode</code>.
     */
    public final TableField<CountrylanguageRecord, String> COUNTRYCODE = createField(DSL.name("CountryCode"), SQLDataType.CHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>world.countrylanguage.Language</code>.
     */
    public final TableField<CountrylanguageRecord, String> LANGUAGE = createField(DSL.name("Language"), SQLDataType.CHAR(30).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>world.countrylanguage.IsOfficial</code>.
     */
    public final TableField<CountrylanguageRecord, CountrylanguageIsofficial> ISOFFICIAL = createField(DSL.name("IsOfficial"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("F", SQLDataType.VARCHAR)).asEnumDataType(CountrylanguageIsofficial.class), this, "");

    /**
     * The column <code>world.countrylanguage.Percentage</code>.
     */
    public final TableField<CountrylanguageRecord, Double> PERCENTAGE = createField(DSL.name("Percentage"), SQLDataType.FLOAT.nullable(false).defaultValue(DSL.inline("0.0", SQLDataType.FLOAT)), this, "");

    private Countrylanguage(Name alias, Table<CountrylanguageRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Countrylanguage(Name alias, Table<CountrylanguageRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>world.countrylanguage</code> table reference
     */
    public Countrylanguage(String alias) {
        this(DSL.name(alias), COUNTRYLANGUAGE);
    }

    /**
     * Create an aliased <code>world.countrylanguage</code> table reference
     */
    public Countrylanguage(Name alias) {
        this(alias, COUNTRYLANGUAGE);
    }

    /**
     * Create a <code>world.countrylanguage</code> table reference
     */
    public Countrylanguage() {
        this(DSL.name("countrylanguage"), null);
    }

    public <O extends Record> Countrylanguage(Table<O> path, ForeignKey<O, CountrylanguageRecord> childPath, InverseForeignKey<O, CountrylanguageRecord> parentPath) {
        super(path, childPath, parentPath, COUNTRYLANGUAGE);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class CountrylanguagePath extends Countrylanguage implements Path<CountrylanguageRecord> {
        public <O extends Record> CountrylanguagePath(Table<O> path, ForeignKey<O, CountrylanguageRecord> childPath, InverseForeignKey<O, CountrylanguageRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private CountrylanguagePath(Name alias, Table<CountrylanguageRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public CountrylanguagePath as(String alias) {
            return new CountrylanguagePath(DSL.name(alias), this);
        }

        @Override
        public CountrylanguagePath as(Name alias) {
            return new CountrylanguagePath(alias, this);
        }

        @Override
        public CountrylanguagePath as(Table<?> alias) {
            return new CountrylanguagePath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : World.WORLD;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.COUNTRYLANGUAGE_COUNTRYCODE);
    }

    @Override
    public UniqueKey<CountrylanguageRecord> getPrimaryKey() {
        return Keys.KEY_COUNTRYLANGUAGE_PRIMARY;
    }

    @Override
    public List<ForeignKey<CountrylanguageRecord, ?>> getReferences() {
        return Arrays.asList(Keys.COUNTRYLANGUAGE_IBFK_1);
    }

    private transient Country.CountryPath _country;

    /**
     * Get the implicit join path to the <code>world.country</code> table.
     */
    public Country.CountryPath country() {
        if (_country == null)
            _country = new Country.CountryPath(this, Keys.COUNTRYLANGUAGE_IBFK_1, null);

        return _country;
    }

    @Override
    public Countrylanguage as(String alias) {
        return new Countrylanguage(DSL.name(alias), this);
    }

    @Override
    public Countrylanguage as(Name alias) {
        return new Countrylanguage(alias, this);
    }

    @Override
    public Countrylanguage as(Table<?> alias) {
        return new Countrylanguage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Countrylanguage rename(String name) {
        return new Countrylanguage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Countrylanguage rename(Name name) {
        return new Countrylanguage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Countrylanguage rename(Table<?> name) {
        return new Countrylanguage(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Countrylanguage where(Condition condition) {
        return new Countrylanguage(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Countrylanguage where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Countrylanguage where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Countrylanguage where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Countrylanguage where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Countrylanguage where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Countrylanguage where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Countrylanguage where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Countrylanguage whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Countrylanguage whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
