// Generated with g9.

package com.juan.ex1.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Suministra implements Serializable {

    /** Primary key. */
    protected static final String PK = "idSum";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(name="id_sum", unique=true, nullable=false)
    private int idSum;
    @Column(name="id_cod_pieza")
    private int idCodPieza;
    @Column(name="id_cod_prov", length=4)
    private String idCodProv;
    private int precio;
    private String foreign1;
    private String foreign2;

    /** Default constructor. */
    public Suministra() {
        super();
    }

    /**
     * Access method for idSum.
     *
     * @return the current value of idSum
     */
    public int getIdSum() {
        return idSum;
    }

    /**
     * Setter method for idSum.
     *
     * @param aIdSum the new value for idSum
     */
    public void setIdSum(int aIdSum) {
        idSum = aIdSum;
    }

    /**
     * Access method for idCodPieza.
     *
     * @return the current value of idCodPieza
     */
    public int getIdCodPieza() {
        return idCodPieza;
    }

    /**
     * Setter method for idCodPieza.
     *
     * @param aIdCodPieza the new value for idCodPieza
     */
    public void setIdCodPieza(int aIdCodPieza) {
        idCodPieza = aIdCodPieza;
    }

    /**
     * Access method for idCodProv.
     *
     * @return the current value of idCodProv
     */
    public String getIdCodProv() {
        return idCodProv;
    }

    /**
     * Setter method for idCodProv.
     *
     * @param aIdCodProv the new value for idCodProv
     */
    public void setIdCodProv(String aIdCodProv) {
        idCodProv = aIdCodProv;
    }

    /**
     * Access method for precio.
     *
     * @return the current value of precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Setter method for precio.
     *
     * @param aPrecio the new value for precio
     */
    public void setPrecio(int aPrecio) {
        precio = aPrecio;
    }

    /**
     * Access method for foreign.
     *
     * @return the current value of foreign
     */
    public String getForeign1() {
        return foreign1;
    }

    /**
     * Setter method for foreign.
     *
     * @param aForeign the new value for foreign
     */
    public void setForeign1(String aForeign1) {
        foreign1 = aForeign1;
    }

    /**
     * Access method for foreign.
     *
     * @return the current value of foreign
     */
    public String getForeign2() {
        return foreign2;
    }

    /**
     * Setter method for foreign.
     *
     * @param aForeign the new value for foreign
     */
    public void setForeign2(String aForeign2) {
        foreign2 = aForeign2;
    }

    /**
     * Compares the key for this instance with another Suministra.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Suministra and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Suministra)) {
            return false;
        }
        Suministra that = (Suministra) other;
        if (this.getIdSum() != that.getIdSum()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Suministra.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Suministra)) return false;
        return this.equalKeys(other) && ((Suministra)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getIdSum();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Suministra |");
        sb.append(" idSum=").append(getIdSum());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idSum", Integer.valueOf(getIdSum()));
        return ret;
    }

}
