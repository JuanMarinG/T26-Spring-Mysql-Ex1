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
public class Proveedores implements Serializable {

    /** Primary key. */
    protected static final String PK = "idProv";

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
    @Column(name="id_prov", unique=true, nullable=false, length=4)
    private String idProv;
    @Column(length=100)
    private String nombre;

    /** Default constructor. */
    public Proveedores() {
        super();
    }

    /**
     * Access method for idProv.
     *
     * @return the current value of idProv
     */
    public String getIdProv() {
        return idProv;
    }

    /**
     * Setter method for idProv.
     *
     * @param aIdProv the new value for idProv
     */
    public void setIdProv(String aIdProv) {
        idProv = aIdProv;
    }

    /**
     * Access method for nombre.
     *
     * @return the current value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter method for nombre.
     *
     * @param aNombre the new value for nombre
     */
    public void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * Compares the key for this instance with another Proveedores.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Proveedores and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Proveedores)) {
            return false;
        }
        Proveedores that = (Proveedores) other;
        Object myIdProv = this.getIdProv();
        Object yourIdProv = that.getIdProv();
        if (myIdProv==null ? yourIdProv!=null : !myIdProv.equals(yourIdProv)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Proveedores.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Proveedores)) return false;
        return this.equalKeys(other) && ((Proveedores)other).equalKeys(this);
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
        if (getIdProv() == null) {
            i = 0;
        } else {
            i = getIdProv().hashCode();
        }
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
        StringBuffer sb = new StringBuffer("[Proveedores |");
        sb.append(" idProv=").append(getIdProv());
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
        ret.put("idProv", getIdProv());
        return ret;
    }

}
