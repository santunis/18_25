package br.com.facil.seguranca.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.facil.seguranca.base.AbstractEntity;

@Entity(name = "VersaoSistema")
@Table(name = "VERSAO_SISTEMA", schema = "SAD")
@NamedQueries({
		@NamedQuery(name = "VersaoSistema.allVersaoSistema", query = "select v from VersaoSistema v order by v.id desc") })
public class VersaoSistema extends AbstractEntity<Long> {

	private static final long serialVersionUID = -2828361276330278197L;

	@Id
	@SequenceGenerator(initialValue = 1, name = "versao_sistema_seq", schema = "SAD", sequenceName = "versao_sistema_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "versao_sistema_seq")
	@Column(name = "ID_VERSAO_SISTEMA", columnDefinition = "NUMBER(19,0)")
	private Long id;

	@Column(name = "VERSAO", columnDefinition = "VARCHAR2(20)")
	private String versao;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "DATA_VERSAO", nullable = false)
	private Date data;

	@OneToMany(targetEntity = VersaoSistemaDetalhe.class, mappedBy = "versaoSistema", fetch = FetchType.LAZY)
	private List<VersaoSistemaDetalhe> versaoSistemaDetalhes;

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

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<VersaoSistemaDetalhe> getVersaoSistemaDetalhes() {
		return versaoSistemaDetalhes;
	}

	public void setVersaoSistemaDetalhes(List<VersaoSistemaDetalhe> versaoSistemaDetalhes) {
		this.versaoSistemaDetalhes = versaoSistemaDetalhes;
	}

}
