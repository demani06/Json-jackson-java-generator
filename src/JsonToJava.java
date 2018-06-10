import com.fasterxml.jackson.databind.node.ObjectNode;
import com.sun.codemodel.JCodeModel;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsonToJava {

    public static void main(String[] args) throws IOException {
        JCodeModel codeModel = new JCodeModel();

        URL source = new URL("file:///C://Deepak//Temp//temp.json");


        SchemaGenerator sg = new SchemaGenerator();

        ObjectNode jsonschema = sg.schemaFromExample(source);
        SchemaMapper mapper = new SchemaMapper();

        mapper.generate(codeModel, "ClassName", "com.deepak", jsonschema.toString());

        codeModel.build(new File("C://Deepak//Temp//"));

        System.out.println("Generated");
    }
}
