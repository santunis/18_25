package br.com.facil.seguranca.domain;

/*
 * 	1	ADMINISTRADOR ADM
 * 	"Militar com o perfil de Administrador:
	- Chefe da 3� Se��o / DA Prom
	Miss�o
	- Respons�vel por gerenciar o Sistema de Avalia��o do Desempenho."	
		
	2	GESTOR OM	GOM
	"O Gestor OM � o Gestor da Avalia��o (G Avl) da OM.
	O G Avl selecionar� os militares que atuar�o como Avaliadores e os que ser�o Avaliados por parte de cada Avaliador. Em seguida, submeter� a sua proposta de Avaliadores e Avaliados � aprova��o do Cmt, Ch ou Dir da OM.
	Cabe ao G Avl acessorar o Cmt OM quanto ao processo de avalia��o a ser desenvolvido no �mbito da OM.
	Tamb�m � responsabilidade do G Avl importar os militares que dever�o ser avaliados na OM (Avl Interna ou Externa)."	

	3	AUDITOR SISTEMA	AUS
	"Militares com o perfil de Auditor do Sistema:
	- Dir Avl Prom
	- SDir Avl Prom
	- Ch 3� Se��o - Se��o de Avalia��o *
	- Ch SSe� Processamento
	- Adj SSe� Processamento"	

	4	AUDITOR ANALISE	AUA
	"MIlitares com o perfil de Auditor An�lise:
	- Dir Avl Prom
	- SDir Avl Prom
	- Ch 3� Se��o - Se��o de Avalia��o *
	- Ch SSe� Produtos
	- Ch SSe� An�lise
	- Adj SSe� Produtos
	- Adj SSe� An�lise"	

	5	HOMOLOGADOR	HOM	
	"O Homologador � o militar respons�vel por Homologar as avalia��es realizadas no �mbito de determinada OM.
	Normalmente o Homologador � o Comandante da OM.

	6	AVALIADOR	AVR	
	"A avalia��o deve ser justa, imparcial e precisa, sendo impositivo que o Avaliador possua v�nculo funcional direto ou indireto com o Avaliado.
	O trabalho do Avaliador come�a, t�o logo seja designado pelo G Avl da OM, com a observa��o e o acompanhamento do desempenho de seus Avaliados.
	Para facilitar seu trabalho, o Avaliador poder� utilizar o programa de avalia��o para registrar os fatos relevantes do desempenho do Avaliado.
	
	7	AVALIADO	ADO	
	"Todo militar da gradua��o de 3� Sgt ao posto de Coronel ser� avaliado no Sistema de Avalia��o do Desempenho.
	No in�cio do per�odo de avalia��o, o Avaliado dever� preencher a Autoavalia��o Diagn�stica para que fique dispon�vel aos seus avaliadores verticais."	

	8	GESTOR ESCOLAR	GES
	"Militar pertencente ao EE que adotar� a Avalia��o Escolar para avaliar os alunos.
	Ser� o respons�vel por gerenciar os diversos processos de Avalia��o Escolar que ocorrerem durante o ano de instru��o.
	Sugere-se que seja escalado para esta fun��o um Instrutor do curso em realiza��o.
	Poder� haver mais de um Gestor Escolar no mesmo EE.
	Ex: EsAO - 01 Gestor Escolar por Arma/Quadro/Servi�o: Inf, Cav, Art. Eng, Int, Com, Mat Bel. M�dicos."	

	9	HOMOLOGADOR ESCOLAR	HES	
	"Militar pertencente ao EE que adotar� a Avalia��o Escolar para avaliar os alunos.
	Ser� o respons�vel por homologar as diversas avalia��es resultantes dos processos de Avalia��o Escolar que ocorrerem durante o ano de instru��o.
	Sugere-se que seja escalado para esta fun��o um Instrutor do curso em realiza��o.
	Poder� haver mais de um Homologador Escolar no mesmo EE.
	Ex: EsAO - 01 Homologador Escolar por Arma/Quadro/Servi�o: Inf, Cav, Art. Eng, Int, Com, Mat Bel. M�dicos."	

	10	INSTRUTOR	INS	
	"Militar nomeado Instrutor de EE que utilizar� a Avalia��o Escolar como m�todo de avalia��o dos alunos.
	Realizar� a avalia��o dos alunos inserido nos processos de avalia��o criados pelo Gestor Escolar durante o ano de instru��o."

	11	ALUNO	ALU
	"Militar na condi��o de Aluno dos diversos cursos militares, desde que o EE utilize a Avalia��o Escolar durante o ano de instru��o.

	22	COMANDANTE	CMT	"O Cmt, Ch ou Dir � o respons�vel pelo processo de Avalia��o do Desempenho dos militares de sua OM.
	Normalmente o Comandante da OM tamb�m ser� o Homologador."	

	162	REVISOR REV	
	"Militar encarregado de analisar as avalia��es realizadas �pelo Comandante/Homologador, no caso de existirem observa��es do Avaliado.
	Dever� ter ascend�ncia hier�rquica sobre o Comandante/Homologador."
 */

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

import br.com.facil.seguranca.base.AbstractEntity;

import javax.persistence.ForeignKey;

@Entity(name = "Perfil")
@Table(name = "PERFIL", schema = "SAD")

@NamedQueries({
		@NamedQuery(name = "Perfil.allPerfis", query = "select distinct a from Perfil a left join FETCH a.funcionalidades where a.id <> 162 and a.id <> 242 and a.id < 244 order by a.nrOrdem"),
		@NamedQuery(name = "Perfil.allPerfisExcetoRev", query = "select a from Perfil a where a.id <> 162 and a.id <> 242 order by a.nrOrdem"),
		@NamedQuery(name = "Perfil.todosDoMilitar", query = "select p from Perfil p join FETCH p.militares m where m.id =:param0"),
		@NamedQuery(name = "Perfil.perfisMilExt", query = "select a from Perfil a where " + "a.id = 6 or "
				+ "a.id = 7 or " + "a.id = 8 or " + "a.id = 9 or " + "a.id = 10 or " + "a.id = 11 or "
				+ "a.id = 162 order by a.nrOrdem"),

		@NamedQuery(name = "Perfil.defaultPerfis", query = "select a from Perfil a where a.codPerfil = '1' or a.codPerfil = '2' or "
				+ "a.codPerfil = '3' or a.codPerfil='4' order by a.nrOrdem"),

		@NamedQuery(name = "Perfil.nomePerfil", query = "select a from Perfil a where a.nome=:param0 and a.id <> 162 and a.id <> 242 and a.id < 244"),
		@NamedQuery(name = "Perfil.siglaPerfil", query = "select a from Perfil a where a.sigla=:param0 and a.id <> 162 and a.id <> 242 and a.id < 244"),
		@NamedQuery(name = "Perfil.codPerfil", query = "select a from Perfil a where a.codPerfil=:param0 and a.id <> 162 and a.id <> 242 and a.id < 244"),
		@NamedQuery(name = "Perfil.defaultOMPerfil", query = "select a from Perfil a where a.id = 2 or a.id = 5 or a.id = 6 or a.id = 7 or a.id = 22 or "
				+ "a.id = 23 or a.id = 24 or a.id = 243 order by a.nrOrdem"),
		@NamedQuery(name = "Perfil.defaultOMEscolaPerfil", query = "select a from Perfil a where a.id = 2 or a.id = 5 or a.id = 6 or a.id = 7 or "
				+ "a.id = 8 or a.id = 9 or a.id = 10 or a.id = 11 or a.id = 22 or a.id = 23 or a.id = 24 or a.id = 243 order by a.nrOrdem") })
public class Perfil extends AbstractEntity<Long> {

	private static final long serialVersionUID = -3193231678374610732L;

	@Id
	@SequenceGenerator(initialValue = 1, name = "perf_id_perf_seq", schema = "SAD", sequenceName = "perf_id_perf_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "perf_id_perf_seq")
	@Column(name = "ID_PERFIL", columnDefinition = "NUMBER(19,0)")
	private Long id;

	public Perfil() {
	}

	public Perfil(Long id) {
		this.id = id;
	}

	@Column(length = 50, nullable = false, unique = true)
	private String nome;

	@Column(length = 750)
	private String caracteristicas;

	@Column(length = 3)
	private String sigla;

	@Column(name = "COD_PERFIL", nullable = false, unique = true)
	private Integer codPerfil;

	@Column(name = "NR_ORDEM", columnDefinition = "NUMBER")
	private Long nrOrdem;

	/*
	 * Associacao *:* com perfil: LEITURA BIDIRECIONAL: perfil <----(LAZY)--->
	 * funcionalidade ESCRITA BIDIRECINAL: perfil <----(write)--> funcionalidade
	 */
//	@ManyToMany(fetch=FetchType.LAZY)
//	@Cascade(org.hibernate.annotations.CascadeType.ALL)	
//	@JoinTable(name = "MILITAR_PERFIL", schema="SAD",
//		joinColumns = @JoinColumn(name = "ID_PERFIL", columnDefinition = "NUMBER(19,0)", foreignKey=@ForeignKey(name = "perfil_militar_fkey")), 
//		inverseJoinColumns = @JoinColumn(name = "PES_IDENTIFICADOR_COD", columnDefinition = "varchar(12)"))	
//	private List<Militar> militares;

	@ManyToMany(fetch = FetchType.EAGER)
//	@Cascade(org.hibernate.annotations.CascadeType.ALL)	
	@JoinTable(name = "PERFIL_FUNCIONALIDADE", schema = "SAD", joinColumns = @JoinColumn(name = "ID_PERFIL", columnDefinition = "NUMBER(19,0)", foreignKey = @ForeignKey(name = "perfil_funcionalidade_fkey")), inverseJoinColumns = @JoinColumn(name = "ID_FUNCIONALIDADE", columnDefinition = "NUMBER(19,0)"))
	private List<Funcionalidade> funcionalidades;

//	@Version
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public Integer getCodPerfil() {
		return codPerfil;
	}

	public void setCodPerfil(Integer codPerfil) {
		this.codPerfil = codPerfil;
	}

//	public List<Militar> getMilitares() {
//		return militares;
//	}
//	public void setMilitares(List<Militar> militares) {
//		this.militares = militares;
//	}
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public List<Funcionalidade> getFuncionalidades() {
		return funcionalidades;
	}

	public void setFuncionalidades(List<Funcionalidade> funcionalidades) {
		this.funcionalidades = funcionalidades;
	}

	public Long getNrOrdem() {
		return nrOrdem;
	}

	public void setNrOrdem(Long nrOrdem) {
		this.nrOrdem = nrOrdem;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
