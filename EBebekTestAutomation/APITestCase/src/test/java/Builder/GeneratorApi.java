package Builder;

import datas.GeneratorPath;
import io.restassured.response.Response;
import model.Generator;

public class GeneratorApi {


    public static Response post(String id, Generator requestGenerator){
        return ResponseCreator.post(GeneratorPath.CLIENT_POST + id, requestGenerator);
    }

    public static Response get(String id) {
        return ResponseCreator.get(GeneratorPath.CLIENT_GET + id);
    }


}
