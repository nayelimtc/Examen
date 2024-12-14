package com.examen.core.account.modulo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SEG_MODULO")
public class SegModulo {
    @Id
    @Column(name = "COD_MODULO", length = 16)
    private String codModulo;

    @Column(name = "NOMBRE", length = 50)
    private String nombre;

    @Column(name = "ESTADO", length = 3)
    private String estado;

    @Column(name = "VERSION")
    private Integer version;

    public SegModulo(String codModulo) {
        this.codModulo = codModulo;
    }

    public String getCodModulo() {
        return codModulo;
    }

    public void setCodModulo(String codModulo) {
        this.codModulo = codModulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codModulo == null) ? 0 : codModulo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SegModulo other = (SegModulo) obj;
        if (codModulo == null) {
            if (other.codModulo != null)
                return false;
        } else if (!codModulo.equals(other.codModulo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegModulo [codModulo=" + codModulo + ", nombre=" + nombre + ", estado=" + estado + ", version="
                + version + "]";
    }

}
