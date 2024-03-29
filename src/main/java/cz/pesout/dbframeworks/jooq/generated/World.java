/*
 * This file is generated by jOOQ.
 */
package cz.pesout.dbframeworks.jooq.generated;


import cz.pesout.dbframeworks.jooq.generated.tables.City;
import cz.pesout.dbframeworks.jooq.generated.tables.Country;
import cz.pesout.dbframeworks.jooq.generated.tables.Countrylanguage;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class World extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>world</code>
     */
    public static final World WORLD = new World();

    /**
     * The table <code>world.city</code>.
     */
    public final City CITY = City.CITY;

    /**
     * The table <code>world.country</code>.
     */
    public final Country COUNTRY = Country.COUNTRY;

    /**
     * The table <code>world.countrylanguage</code>.
     */
    public final Countrylanguage COUNTRYLANGUAGE = Countrylanguage.COUNTRYLANGUAGE;

    /**
     * No further instances allowed
     */
    private World() {
        super("world", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            City.CITY,
            Country.COUNTRY,
            Countrylanguage.COUNTRYLANGUAGE
        );
    }
}
