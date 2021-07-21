package br.com.facil.seguranca.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.facil.seguranca.base.AbstractEntity;

@Entity(name = "Usuario")
@Table(name = "USUARIO", schema = "LOTO")

@NamedQueries({ @NamedQuery(name = "Usuario.allUsuarios", query = "select u from Usuario u") })
public class Usuario extends AbstractEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Long getId() {
		return null;
	}

	@Id
	@SequenceGenerator(initialValue = 1, name = "perf_id_perf_seq", schema = "SAD", sequenceName = "perf_id_perf_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "perf_id_perf_seq")
	@Column(name = "ID_PERFIL", columnDefinition = "NUMBER(19,0)")
	private Long id;

}
