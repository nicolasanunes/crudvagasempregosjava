package dominio;

public class Vaga {
    
    private Integer id;
    private String tipo;
    private Integer quantidade;
    private String contratante;
    private Float salario;
    private String necessitaExperiencia;
    private String diplomaArea;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getContratante() {
        return contratante;
    }

    public void setContratante(String contratante) {
        this.contratante = contratante;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getNecessitaExperiencia() {
        return necessitaExperiencia;
    }

    public void setNecessitaExperiencia(String necessitaExperiencia) {
        this.necessitaExperiencia = necessitaExperiencia;
    }

    public String getDiplomaArea() {
        return diplomaArea;
    }

    public void setDiplomaArea(String diplomaArea) {
        this.diplomaArea = diplomaArea;
    }

    
}