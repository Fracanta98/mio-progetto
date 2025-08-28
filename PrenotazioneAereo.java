public class PrenotazioneAereo extends Prenotazione {
    private int postiDisponibiliAereo;
    private int capacitaEconomy;
    private int capacitaBusiness;
    public boolean validazionePrenotazioneAereo;

    public PrenotazioneAereo(String cliente,  String data, int postiRichiesti, int postiDisponibiliAereo, int capacitaEconomy, int capacitaBusiness, boolean validaPrenotazioneAereo ){
        super(cliente, data, postiRichiesti);
        this.postiDisponibiliAereo = postiDisponibiliAereo;
        this.capacitaEconomy = capacitaEconomy;
        this.capacitaBusiness = capacitaBusiness;
        this.validazionePrenotazioneAereo = validaPrenotazioneAereo;
    }
    
   public void validazioneAereo(){
        if(getPostiRichiesti() <= postiDisponibiliAereo && (getPostiRichiesti() <= capacitaEconomy || getPostiRichiesti() <= capacitaBusiness)){
            validazionePrenotazioneAereo = true;
            System.out.println("Validazione aereo confermata");
        }else{
            validazionePrenotazioneAereo = false;
            System.out.println("Posti non disponibili");
        }
   }

   @Override
   public void dettagliPrenotazione(){
        if(validazionePrenotazioneAereo = true){
            System.out.println("Cliente: " + getCliente() + "data: " + getData() + "Posti: " + getPostiRichiesti() + "Prenotazione valida");
        }else{
            System.out.println("Prenotazione non valida effettua la validazione");
        }
   }


}
