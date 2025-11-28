package Lab7;

import java.io.File;
import java.io.IOException;

public interface Validator
{
    boolean checking(String nickname) throws InvalidEmailException;
}
