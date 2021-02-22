package professeur;

@SuppressWarnings("serial")
public class ExceptionProfesseurIntrouvable
    extends Exception {

    public ExceptionProfesseurIntrouvable() {

    }

    @Override
    public final String getMessage() {

        return "Le professeur est introuvable.";
    }

}
