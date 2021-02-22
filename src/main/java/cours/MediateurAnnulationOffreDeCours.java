package cours;

public class MediateurAnnulationOffreDeCours {

    private final RegistreOffreDeCours registreOffreDeCours;

    public MediateurAnnulationOffreDeCours(final RegistreOffreDeCours registreOffreDeCours_) {

        super();
        this.registreOffreDeCours = registreOffreDeCours_;
    }

    public final void executer(
        final OffreDeCours offreDeCours_) {

        @SuppressWarnings("unused")
        OffreDeCours reponse = this.registreOffreDeCours.modifier(offreDeCours_);

    }

}
