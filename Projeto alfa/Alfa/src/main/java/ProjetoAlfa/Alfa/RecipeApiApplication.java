package ProjetoAlfa.Alfa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RecipeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecipeApiApplication.class, args);
    }
}

@RestController
class RecipeController {

    // Valor padrão para a consulta
    private static final String QUERY_DEFAULT = "pizza";

    @GetMapping("/searchRecipes")
    public RecipeResponse searchRecipes(@RequestParam(required = false) String query) {
        if (query == null || query.isEmpty()) {
            // Usar o valor padrão se nenhum valor for especificado
            query = QUERY_DEFAULT;
        }

        String apiUrl = "https://forkify-api.herokuapp.com/api/search?q=" + query;
        RestTemplate restTemplate = new RestTemplate();
        RecipeResponse response = restTemplate.getForObject(apiUrl, RecipeResponse.class);
        return response;
    }
}