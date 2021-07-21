package br.com.facil.seguranca.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.facil.seguranca.base.AbstractEntity;

import javax.persistence.ForeignKey;


@Entity(name = "VersaoSistemaDetalhe")
@Table(name = "VERSAO_SISTEMA_DETALHE", schema = "SAD")
@NamedQueries({ @NamedQuery(name = "VersaoSistemaDetalhe.allVersaoSistemaDetalhe", query = "select v from VersaoSistemaDetalhe v order by v.id desc") })
public class VersaoSistemaDetalhe extends AbstractEntity<Long> {

	private static final long serialVersionUID = -3519914183705475497L;

	@Id
	@SequenceGenerator(initialValue = 1, name = "versao_sistema_detalhe_seq", schema="SAD", sequenceName = "versao_sistema_detalhe_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "versao_sistema_detalhe_seq")
	@Column(name = "ID_VERSAO_SISTEMA_DETALHE", columnDefinition = "NUMBER(19,0)")
	private Long id;

	@Column(name = "DESCRICAO", nullable = false, length = 10000)
	private String descricao;

	@ManyToOne(targetEntity = VersaoSistema.class, fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "ID_VERSAO_SISTEMA", columnDefinition = "NUMBER(19,0)", nullable = false, foreignKey=@ForeignKey(name = "versao_sitema_fkey"))
	private VersaoSistema versaoSistema;

	/*--------
	 * get/set
	 --------*/
	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public VersaoSistema getVersaoSistema() {
		return versaoSistema;
	}

	public void setVersaoSistema(VersaoSistema versaoSistema) {
		this.versaoSistema = versaoSistema;
	}

}
