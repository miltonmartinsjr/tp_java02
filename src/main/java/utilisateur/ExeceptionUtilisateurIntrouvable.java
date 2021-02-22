package utilisateur;

import org.apache.commons.lang3.exception.ExceptionUtils;

public class ExeceptionUtilisateurIntrouvable
    extends ExceptionUtils {

    public ExeceptionUtilisateurIntrouvable() {

    }

    public final String getMessage() {

        return "L'utilisateur introuvable";
    }

}
