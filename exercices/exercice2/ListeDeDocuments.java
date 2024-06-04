import java.util.HashSet;
import java.util.Set;

public class ListeDeDocuments implements ActionsDocument {
    //propriété(s) de la classe
    protected Set<AbstractDocument> listeDeAbstractDocuments;


    //constructeur(s)
    public ListeDeDocuments() {
        this.listeDeAbstractDocuments = new HashSet<AbstractDocument>();
    }
    public ListeDeDocuments(Set<AbstractDocument> listeDeAbstractDocuments) {
        this.listeDeAbstractDocuments = listeDeAbstractDocuments;
    }



    @Override
    public boolean ajouterDocument(AbstractDocument abstractDocument) {
        return this.listeDeAbstractDocuments.add(abstractDocument);
    }
    @Override
    public boolean retirerDocument(AbstractDocument abstractDocument) {
        return this.listeDeAbstractDocuments.remove(abstractDocument);
    }
    @Override
    public boolean retirerDocument(int numeroDocument) {
        return this.listeDeAbstractDocuments.removeIf(document -> document.getNumero() == numeroDocument);
    }
    //liste des numéros des documents de la liste avec, pour chacun, l'auteur
    @Override
    public void tousLesAuteurs() {
        if(this.listeDeAbstractDocuments.isEmpty()) {
            System.out.println("La liste est vide");

        }else {
            for (AbstractDocument abstractDocument : this.listeDeAbstractDocuments) {
                System.out.println("N° "+abstractDocument.getNumero()+" "+abstractDocument.getAuteur());
            }
        }
    }
    @Override
    public void tousLesDocuments() {
        for(AbstractDocument abstractDocument : this.listeDeAbstractDocuments) {
            System.out.println(abstractDocument);
        }
    }


    //mutateur(s) et accesseur(s)
    public Set<AbstractDocument> getListeDeAbstractDocuments() {
        return listeDeAbstractDocuments;
    }
    public void setListeDeAbstractDocuments(Set<AbstractDocument> listeDeAbstractDocuments) {
        this.listeDeAbstractDocuments = listeDeAbstractDocuments;
    }
}
