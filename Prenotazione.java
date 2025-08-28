public class Prenotazione {
    private String cliente;
    private String data;
    private int postiRichiesti;

    public Prenotazione(String cliente, String data, int postiRichiesti){
        this.cliente = cliente;
        this.data = data;
        this.postiRichiesti = postiRichiesti;
    }

    public String getCliente(){
        return cliente;
    }

    public void dettagliPrenotazione(){
        System.out.println("cliente: " + cliente + "data: " + data + "posti: " + postiRichiesti);
    }

    public String getData(){
        return data;
    }

    public int getPostiRichiesti(){
        return postiRichiesti;
    }

    public void setCliente(String nuovoCliente){
        this.cliente = nuovoCliente;

    }

    public void setData(String nuovaData){
        this.data = nuovaData;

    }

    public void setPostiRichiesti(int nuoviPosti){
        this.postiRichiesti = nuoviPosti;

    }


    
    
}
