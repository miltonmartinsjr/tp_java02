package facture;

public class StatusFacture {

    private final boolean status;

    public StatusFacture(final boolean status_) {

        this.status = status_;

    }

    public final boolean isValide() {

        return this.status;
    }

}
