package br.com.facil.seguranca.domain;

import java.util.List;

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
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import br.com.facil.seguranca.base.AbstractEntity;

import javax.persistence.ForeignKey;

@Entity(name = "Menu")
@Table(name = "MENU", schema = "SAD")
@NamedQueries({ @NamedQuery(name = "Menu.allMenus", query = "select a from Menu a"),
		@NamedQuery(name = "Menu.rootMenus", query = " select distinct a from Menu a left join FETCH a.menus ms where a.menu.id is null or a.menu.id=a.id order by a.ordem"),

		@NamedQuery(name = "Menu.itensMenus", query = "select a from Menu a where a.tipo='2'"),

		@NamedQuery(name = "Menu.singleMenu", query = "select a from Menu a where a.label=:param0") })
public class Menu extends AbstractEntity<Long> {

	private static final long serialVersionUID = 6203892887562236610L;

	@Id
	@SequenceGenerator(initialValue = 1, name = "menu_id_menu_seq", schema = "SAD", sequenceName = "menu_id_menu_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "menu_id_menu_seq")
	@Column(name = "ID_MENU", columnDefinition = "NUMBER(19,0)")
	private Long id;

	@Column(length = 70, nullable = false)
	private String label;

	@Column(length = 30)
	private String title;

	@Column(length = 30, nullable = false)
	private String icon;

	@Column(columnDefinition = "Integer", nullable = false)
	private Integer ordem;

	@Column(columnDefinition = "char(1) default '1'", nullable = false)
	private String tipo;

	@Column(length = 70)
	private String metodo;

	// se o menu eh publico(T) ou privado(F) - privado soh eh visto por pessoas
	// logadas
	@Column(columnDefinition = "char(1) default 'F'", nullable = false)
	private String visibility;

	// se o menu serah disabled(T) ou nao(F) - apenas na apresentacao do menu
	@Column(columnDefinition = "char(1) default 'F'", nullable = false)
	private String disabled;

	// se o menu serah selectable(T) ou nao(F) - apenas no caso de uso
	// habilitar/desabilitar funcionalidades
	// menu, quando selectable(T) eh tamb�m disabled(F) e vice-versa.
	@Column(columnDefinition = "char(1) default 'T'", nullable = false)
	private String selectable;

	// se o menu terah ou nao um separador.
	@Column(columnDefinition = "char(1) default 'F'", nullable = false)
	private String separator;

	/*
	 * Associacao selfRelation: Uma selfRelation é a associacao de um objeto com uma
	 * lista do mesmo objeto, envolvendo, por exemplo, duas associacoes: 1:* e *:1
	 * para uma mesma entidade. Exemplo: um menu contem uma lista de menus. uma
	 * lista de menus possui um unico menu.
	 * 
	 * LEITURA BIDIRECIONAL: menu <---(EAGER)---> menu ESCRITA:Nao hah escrita em
	 * cascata.
	 */
	@ManyToOne(targetEntity = Menu.class, fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "id_menu_fk", columnDefinition = "Integer", foreignKey = @ForeignKey(name = "menu_menu_fkey"))
	private Menu menu;

	@OneToMany(targetEntity = Menu.class, mappedBy = "menu", fetch = FetchType.LAZY)
	@OrderBy("ordem")
//	@Fetch(FetchMode.SUBSELECT)
//	@BatchSize(size=10)
	private List<Menu> menus;

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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
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

	public String getDisabled() {
		return disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	public String getSelectable() {
		return selectable;
	}

	public void setSelectable(String selectable) {
		this.selectable = selectable;
	}

	public String getSeparator() {
		return separator;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
