
//abstraction offrant des méthodes pouvant être réutilisé par d'autres classes
public interface ActionsDocument {
    //Ajouter un document à la liste
    public boolean ajouterDocument(AbstractDocument abstractDocument);
    //retirer un document grâce à son objet directement (nécessite la redéfinition du equals/hashcode)
    public boolean retirerDocument(AbstractDocument abstractDocument);
    //retirer un document grâce à son "numéro"  (nécessite la redéfinition du equals/hashcode)
    public boolean retirerDocument(int numeroDocument);
    //n°, nom et prénom puis la classe/type du document
    public void tousLesAuteurs();
    //Description de tous les documents
    public void tousLesDocuments();
}
