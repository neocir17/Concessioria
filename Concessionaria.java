public class Concessionaria {
      private string vendas;
       String classConcessioria;
       int quantidade, numvendidos;
        
       private String nomeCarro, marcaCarro;

       public  void  setnomeCarro ( String  nomeCarro ) {
        this . nomeCarro = nomeCarro;
    }
 

    public  String  getnomeCarro () {
        return nomeCarro ;
    }

    public  void  setmarcaCarro ( String  marcaCarro) {
        this . marcaCarro = marcaCarro;
    }

    public  String  getmarcaCarro () {
        return marcaCarro;
    }

    void  vendas () {
        System.out.println ( " Vendas para bater metas !! " );
    }
 
}






      