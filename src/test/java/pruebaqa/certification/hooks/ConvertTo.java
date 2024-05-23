package pruebaqa.certification.hooks;

import io.cucumber.java.DataTableType;
import pruebaqa.certification.models.UserCredential;

import java.util.List;

public class ConvertTo {

    @DataTableType
    public UserCredential theModel(List<String> entry) {
        return new UserCredential(entry.get(0), entry.get(1));
    }

}