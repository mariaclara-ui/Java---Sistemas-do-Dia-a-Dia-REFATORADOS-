package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_03.Entidades;

public class Clinica {
    private String nome;
    private String cpf;
    private String especialidade;
    private String horario;
    private String consulta;

    public Clinica(String nome, String cpf,
                   String especialidade,
                   String horario,
                   String consulta) {

        this.nome = nome;
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.horario = horario;
        this.consulta = consulta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getConsulta() {
        return consulta;
    }
}

