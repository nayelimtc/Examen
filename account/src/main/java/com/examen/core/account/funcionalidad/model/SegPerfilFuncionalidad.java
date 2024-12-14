package com.examen.core.account.funcionalidad.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "SEG_PERFIL_FUNCIONALIDAD")
public class SegPerfilFuncionalidad {
    @EmbeddedId
    private String id;

    @Column(name = "ORDEN", length = 2)
    private Integer orden;

    @Column(name = "ESTADO", length = 3)
    private String estado;

    @Column(name = "ADMITE_CREACION")
    private Boolean admiteCreacion;

    @Column(name = "ADMITE_MODIFICACION")
    private Boolean admiteModificacion;

    public SegPerfilFuncionalidad(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getAdmiteCreacion() {
        return admiteCreacion;
    }

    public void setAdmiteCreacion(Boolean admiteCreacion) {
        this.admiteCreacion = admiteCreacion;
    }

    public Boolean getAdmiteModificacion() {
        return admiteModificacion;
    }

    public void setAdmiteModificacion(Boolean admiteModificacion) {
        this.admiteModificacion = admiteModificacion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        SegPerfilFuncionalidad other = (SegPerfilFuncionalidad) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegPerfilFuncionalidad [id=" + id + ", orden=" + orden + ", estado=" + estado + ", admiteCreacion="
                + admiteCreacion + ", admiteModificacion=" + admiteModificacion + "]";
    }

}
