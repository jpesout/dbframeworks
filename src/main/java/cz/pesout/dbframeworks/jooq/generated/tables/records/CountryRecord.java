/*
 * This file is generated by jOOQ.
 */
package cz.pesout.dbframeworks.jooq.generated.tables.records;


import cz.pesout.dbframeworks.jooq.generated.enums.CountryContinent;
import cz.pesout.dbframeworks.jooq.generated.tables.Country;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CountryRecord extends UpdatableRecordImpl<CountryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>world.country.Code</code>.
     */
    public void setCode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>world.country.Code</code>.
     */
    public String getCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>world.country.Name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>world.country.Name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>world.country.Continent</code>.
     */
    public void setContinent(CountryContinent value) {
        set(2, value);
    }

    /**
     * Getter for <code>world.country.Continent</code>.
     */
    public CountryContinent getContinent() {
        return (CountryContinent) get(2);
    }

    /**
     * Setter for <code>world.country.Region</code>.
     */
    public void setRegion(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>world.country.Region</code>.
     */
    public String getRegion() {
        return (String) get(3);
    }

    /**
     * Setter for <code>world.country.SurfaceArea</code>.
     */
    public void setSurfacearea(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>world.country.SurfaceArea</code>.
     */
    public Double getSurfacearea() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>world.country.IndepYear</code>.
     */
    public void setIndepyear(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>world.country.IndepYear</code>.
     */
    public Short getIndepyear() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>world.country.Population</code>.
     */
    public void setPopulation(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>world.country.Population</code>.
     */
    public Integer getPopulation() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>world.country.LifeExpectancy</code>.
     */
    public void setLifeexpectancy(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>world.country.LifeExpectancy</code>.
     */
    public Double getLifeexpectancy() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>world.country.GNP</code>.
     */
    public void setGnp(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>world.country.GNP</code>.
     */
    public Double getGnp() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>world.country.GNPOld</code>.
     */
    public void setGnpold(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>world.country.GNPOld</code>.
     */
    public Double getGnpold() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>world.country.LocalName</code>.
     */
    public void setLocalname(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>world.country.LocalName</code>.
     */
    public String getLocalname() {
        return (String) get(10);
    }

    /**
     * Setter for <code>world.country.GovernmentForm</code>.
     */
    public void setGovernmentform(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>world.country.GovernmentForm</code>.
     */
    public String getGovernmentform() {
        return (String) get(11);
    }

    /**
     * Setter for <code>world.country.HeadOfState</code>.
     */
    public void setHeadofstate(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>world.country.HeadOfState</code>.
     */
    public String getHeadofstate() {
        return (String) get(12);
    }

    /**
     * Setter for <code>world.country.Capital</code>.
     */
    public void setCapital(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>world.country.Capital</code>.
     */
    public Integer getCapital() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>world.country.Code2</code>.
     */
    public void setCode2(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>world.country.Code2</code>.
     */
    public String getCode2() {
        return (String) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CountryRecord
     */
    public CountryRecord() {
        super(Country.COUNTRY);
    }

    /**
     * Create a detached, initialised CountryRecord
     */
    public CountryRecord(String code, String name, CountryContinent continent, String region, Double surfacearea, Short indepyear, Integer population, Double lifeexpectancy, Double gnp, Double gnpold, String localname, String governmentform, String headofstate, Integer capital, String code2) {
        super(Country.COUNTRY);

        setCode(code);
        setName(name);
        setContinent(continent);
        setRegion(region);
        setSurfacearea(surfacearea);
        setIndepyear(indepyear);
        setPopulation(population);
        setLifeexpectancy(lifeexpectancy);
        setGnp(gnp);
        setGnpold(gnpold);
        setLocalname(localname);
        setGovernmentform(governmentform);
        setHeadofstate(headofstate);
        setCapital(capital);
        setCode2(code2);
        resetChangedOnNotNull();
    }
}
