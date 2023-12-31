package uniderp.poo.dominio;

public class Aviao extends baseVeiculo  {

    private int assentos;
    private int portas;
    private int qtdeMotores;
    
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    
    public Aviao(int codigo, String nome, String modelo, String cor, String placa, int anoModelo, int anoFabricação,
    int rodas, String fabricante, double potencia, String tipoCombustivel, String tipoVeiculo, int eixo,
    int qtdeOcupantes, String estadoUF, String cidadeUF, int assentos, int portas, int qtdeMotores) {
        super(codigo, nome, modelo, cor, placa, anoModelo, anoFabricação, rodas, fabricante, potencia, tipoCombustivel,
        tipoVeiculo, eixo, qtdeOcupantes, estadoUF, cidadeUF);
        this.assentos = assentos;
        this.portas = portas;
        this.qtdeMotores = qtdeMotores;
    }

    @Override
    public void imprimir() {
        System.out.println("Codigo:  " +  this.codigo);
        System.out.println("nome:" + this.nome);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano do modelo: " + this.anoModelo);
        System.out.println("Ano de fabricação: " + this.anoFabricação);
        System.out.println("Quantidade de rodas: " + this.rodas);
        System.out.println("Nome do fabricante: " + this.fabricante);
        System.out.println("Potência: " + this.potencia);
        System.out.println("Tipo de combustivel: " + this.tipoCombustivel);
        System.out.println("Eixo: " + this.eixo);
        System.out.println("Quantidade de ocupantes: " + this.qtdeOcupantes);
        System.out.println("Estado UF: " + this.estadoUF);
        System.out.println("CidadeUF: " + this.cidadeUF);
        System.out.println("Assentos: " + this.assentos);
        System.out.println("Portas: " + this.portas);
        System.out.println("Quantidade de motores: " + this.qtdeMotores);
        System.out.println("\n --------------------------- " );

    }
}
    
    
