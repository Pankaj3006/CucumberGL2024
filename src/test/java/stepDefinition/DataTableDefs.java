package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class DataTableDefs {

//    @DataTableType
//    public Customer customerEntry(List<String> entry){
//        return new Customer(entry.get(0), entry.get(1));
//    }

    @Given("my credentials")
    public void my_credentials(DataTable dataTable) {
        //List<List<String>> list = dataTable.asLists();
        List<Map<String, String>> list = dataTable.asMaps();

        System.out.println("Username is:"+ list.get(0).get("username"));
        System.out.println("password is:"+ list.get(0).get("password"));
        System.out.println("Username is:"+ list.get(1).get("username"));
        System.out.println("password is:"+ list.get(1).get("password"));
            }
}
