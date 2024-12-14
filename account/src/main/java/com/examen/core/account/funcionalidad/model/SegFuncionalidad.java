package com.examen.core.account.funcionalidad.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SEG_FUNCIONALIDAD")
public class SegFuncionalidad {
    @Id
    @Column(name = "COD_FUNCIONALIDAD", length = 16)
    private String codFuncionalidad;

    @Column(name = "NOMBRE", length = 200)
    private String nombre;

    @Column(name = "ESTADO", length = 3)
    private String estado;

    @Column(name = "DESCRIPCION", length = 500)
    private String descripcion;

    public SegFuncionalidad(String codFuncionalidad) {
        this.codFuncionalidad = codFuncionalidad;
    }

    public String getCodFuncionalidad() {
        return codFuncionalidad;
    }

    public void setCodFuncionalidad(String codFuncionalidad) {
        this.codFuncionalidad = codFuncionalidad;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codFuncionalidad == null) ? 0 : codFuncionalidad.hashCode());
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
        SegFuncionalidad other = (SegFuncionalidad) obj;
        if (codFuncionalidad == null) {
            if (other.codFuncionalidad != null)
                return false;
        } else if (!codFuncionalidad.equals(other.codFuncionalidad))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegFuncionalidad [codFuncionalidad=" + codFuncionalidad + ", nombre=" + nombre + ", estado=" + estado
                + ", descripcion=" + descripcion + "]";
    }

}
