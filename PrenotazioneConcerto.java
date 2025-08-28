public class PrenotazioneConcerto extends Prenotazione {
    private int postiDisponibiliConcerto;
    public boolean validaPrenotazioneConcerto;


    public PrenotazioneConcerto(String cliente, String data, int postiRichiesti){
        super(cliente, data, postiRichiesti);
   
    }


    public void validazioneConcerto(){
        if(getPostiRichiesti() <= postiDisponibiliConcerto && getPostiRichiesti() <= 5){
            validaPrenotazioneConcerto = true;
            System.out.println("Prenotazione valida");
        }else{
            validaPrenotazioneConcerto = false;
            System.out.println("Prenotazione non valida");
        }
    }

    @Override
    public void dettagliPrenotazione(){
        if(validaPrenotazioneConcerto = true){
        System.out.println("Cliente: " + getCliente() + "data: " + getData() + "Posti: " + getPostiRichiesti() + "Prenotazione valida" );
        }else{
            System.out.println("Prenotazione non valida effettua prima la validazione");
        }
    }

}
