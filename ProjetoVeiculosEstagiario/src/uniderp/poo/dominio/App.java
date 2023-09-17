package uniderp.poo.dominio;

public class App {
    public static void main(String[] args) {
        Aviao aviao = new Aviao(
            13,                    
            "Boeing 747",          
            "747-400",             
            "Branco",              
            "XYZ123",              
            2022,                  
            2021,                  
            6,                     
            "Boeing Company",      
            400.0,                 
            "Querosene",           
            "Avião",               
            2,                     
            389,                   
            "MG",                  
            "Belo Horizonte",           
            400,                   
            4,                     
            4                      
        );
    
        aviao.imprimir();

        Caminhao caminhao = new Caminhao(
            2,                     
            "Volvo",          
            "FH16 750",             
            "Vermelho",              
            "OOH3564",              
            1998,                  
            1997,                  
            4,                     
            "Volvo",      
            6.0,                 
            "Diesel",           
            "Caminhão",               
            3,                     
            2,                   
            "SP",                  
            "São Paulo",           
            3,                   
            2,                     
            "1234567890",
            "Luizão A. Rodriguez",
            "ABC123XYZ"
        );

        caminhao.imprimir();

        Carro carro = new Carro(
            3,                     
            "Honda",          
            "Civic Sedan",             
            "Preto",              
            "CWB4010",              
            2023,                  
            2022,                  
            4,                     
            "Honda",      
            2.8,                 
            "Flex",           
            "Carro",               
            2,                     
            5,                   
            "MS",                  
            "Campo Grande",           
            "Sedan",                   
            5,                     
            5,                     
            "9876543210",
            "Matheus Moreira Rangel"
        );

        carro.imprimir();
        
        Motocicleta motocicleta = new Motocicleta(
            4,                     
            "Honda CB 500",          
            "CB 500X",             
            "Verde e Preto",              
            "XYZ987",              
            2015,                  
            2016,                  
            2,                     
            "Honda",      
            125,                
            "Flex",           
            "Motocicleta",               
            2,                     
            2,                   
            "SP",                  
            "São Paulo",           
            "ABC123XYZ",
            "9876543210",
            "Kemylla Alves"
        );

        motocicleta.imprimir();


        Onibus onibus = new Onibus(
            5,                     
            "Mercedes-Benz",          
            "MB O500",             
            "Azul",              
            "LMN789",              
            2013,                  
            2012,                  
            6,                     
            "Mercedes-Benz",      
            4.0,                 
            "Diesel",           
            "Ônibus",               
            3,                     
            45,                   
            "RJ",                  
            "Rio de Janeiro",           
            "ABC987XYZ",
            50,   
            3    
        );

        onibus.imprimir();
    }

    
}
