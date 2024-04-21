package parameterTypes;

import io.cucumber.java.ParameterType;
import objects.Password;
import objects.Product;
import objects.Username;

public class CustomParameterTypes {

    @ParameterType(".*")
    public Product product(String name)
    {
        return new Product(name);
    }

    @ParameterType(".*")
    public Username username(String name)
    {
        return new Username(name);
    }

    @ParameterType(".*")
    public Password password(String name)
    {
        return new Password(name);
    }
}
