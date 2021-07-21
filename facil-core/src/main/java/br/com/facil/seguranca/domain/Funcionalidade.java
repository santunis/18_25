package br.com.facil.seguranca.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

import br.com.facil.seguranca.base.AbstractEntity;

import javax.persistence.ForeignKey;

@Entity(name = "Funcionalidade")
@Table(name = "FUNCIONALIDADE", schema = "SAD")

@NamedQueries({
		@NamedQuery(name = "Funcionalidade.allFuncionalidade", query = "select a from Funcionalidade a order by a.label"),

		@NamedQuery(name = "Funcionalidade.nomeFuncionalidade", query = "select a from Funcionalidade a where a.label =:param0"),

		@NamedQuery(name = "Funcionalidade.funcPublicas", query = "select a from Funcionalidade a where a.visibility ='T'"),

		@NamedQuery(name = "Funcionalidade.funcNaoPublicas", query = "select a from Funcionalidade a where a.visibility ='F'") })
public class Funcionalidade extends AbstractEntity<Long> {

	private static final long serialVersionUID = 1375865644391358255L;

	/*
	 * A funcionalidade deve ser persistida no instante da criacao de cada menu, em
	 * nenhum outro local mais, a nao ser no SETUP do sistema. Ao modificar, inserir
	 * ou excluir cada menu, reflete-se a acao para a funcionalidade correspondente:
	 * um label de menu eh igual a um label de funcionalidade.
	 * 
	 * Funcionalidade travada (desabilitada ou disabled) aparece desabilitada na
	 * lista de funcionalidades, no momento da criacao ou modificacao de um perfil.
	 * Assim sendo, o operador nao poderah atribuir ou retirar uma funcionalidade de
	 * um perfil se ela estiver travada.
	 * 
	 */

	@Id
	@SequenceGenerator(initialValue = 1, name = "func_id_func_seq", schema = "SAD", sequenceName = "func_id_func_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "func_id_func_seq")
	@Column(name = "ID_FUNCIONALIDADE", columnDefinition = "NUMBER(19,0)")
	private Long id;

	@Column(name = "label", columnDefinition = "VARCHAR2(300)")
	private String label;

	@Column(columnDefinition = "char(1) default 'F'")
	private String disabled;

	@Column(columnDefinition = "char(1) default 'F'")
	private String visibility;

	/*
	 * Associacao *:* com perfil: LEITURA BIDIRECIONAL: perfil <----(LAZY)--->
	 * funcionalidade ESCRITA BIDIRECINAL: perfil <----(write)--> funcionalidade
	 */
	@ManyToMany(fetch = FetchType.LAZY)
//	@Cascade(org.hibernate.annotations.CascadeType.ALL)	

	@JoinTable(name = "PERFIL_FUNCIONALIDADE", schema = "SAD", joinColumns = @JoinColumn(name = "ID_FUNCIONALIDADE", columnDefinition = "NUMBER(19,0)", foreignKey = @ForeignKey(name = "funcionalidade_perfil_fkey")), inverseJoinColumns = @JoinColumn(name = "ID_PERFIL", columnDefinition = "NUMBER(19,0)"))
	private List<Perfil> perfis;

	@Transient
	private String labelTraduzido;

	@Version
	@Column(name = "VERSAO", columnDefinition = "Integer default 0")
	private Integer version;

	/*--------
	 * get/set
	 ---------*/
	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

//	public String getDisabled() {
//		return disabled;
//	}
//	public void setDisabled(String disabled) {
//		this.disabled = disabled;
//	}
	public String getLabelTraduzido() {
		return labelTraduzido;
	}

	public void setLabelTraduzido(String labelTraduzido) {
		this.labelTraduzido = labelTraduzido;
	}

	public List<Perfil> getPerfis() {
		return perfis;
	}

	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}

}
