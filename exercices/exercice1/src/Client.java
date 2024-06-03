import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    //permet de générer un ID unique (threads safe) si on avait plusieurs clients
    private static AtomicInteger codeClient = new AtomicInteger(0);
    private int id;

    protected String nomClient;
    protected String prenomClient;

    //un Client est lié à un Magasin
    protected Magasin magasin;

    public Client() {
        this.id = codeClient.incrementAndGet();
        this.nomClient = "Inconnu";
        this.prenomClient = "Inconnu";
    }
    public Client(String nomClient, String prenomClient) {
        this.id = codeClient.incrementAndGet();//utilise fonction static de AtomicInteger

        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
    }

    //intialise la variable membre "magasin". Ce n'est qu'un setter
    public void rentreDansUnMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public void afficherVueClient() {
        this.magasin.afficherVueClient(this);
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //On utilise l'ID comme discriminant pour comparer nos potentiels clients
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return getId() == client.getId();
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
