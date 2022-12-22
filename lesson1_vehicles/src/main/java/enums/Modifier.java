package enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum Modifier {
    PUBLIC, PRIVATE, PROTECTED;
    private static final Logger LOGGER = LogManager.getLogger(Modifier.class);

    public static Modifier getModifier(int modifierNum) throws Exception{
        try {
            switch(modifierNum) {
                case 1:
                    return PUBLIC;
                case 2:
                    return PRIVATE;
                case 3:
                    return PROTECTED;
                default:
                    throw new Exception("Modifier couldn't be found");
            }
        } catch(Exception e) {
               LOGGER.error(e.getMessage());
        }

        return null;
    }
}
