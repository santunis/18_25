package br.com.facil.seguranca.base;

import java.io.Serializable;

/**
 * Classe base para entidades que possuem um id. Sobrescrevendo corretamente os
 * metodos hashCode() e equals().
 * 
 * @author Santunis.Oliveira
 *
 */
public abstract class AbstractEntity<ID> implements Serializable {

	private static final long serialVersionUID = 7181443465891111629L;

	public abstract ID getId();

	@Override
	public int hashCode() {
		return 31 + ((getId() == null) ? 0 : getId().hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		return (this == obj) || (obj instanceof AbstractEntity
				&& (this.getId() != null && this.getId().equals(((AbstractEntity<?>) obj).getId()))
				|| (this.getId() == null && obj != null && ((AbstractEntity<?>) obj).getId() == null));
	}

}