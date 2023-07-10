import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class TesteJson {
    static Map<String, String> dadosTesteMap = new HashMap<String, String>(); //Criação do Map para abrigar o Json
    static Gson gson = new Gson(); //Biblicoteca do Google para fazer a manipulação de Json
    static Reader reader; //Leitura de arquivos do sistema para o java

    public static void main(String[] args) throws FileNotFoundException {
        reader = new FileReader("./src/main/resources/massaTeste.json"); //Faz a leitura do arquivo do sistema operacional para o java
        dadosTesteMap = gson.fromJson(reader, Map.class); //Convertendo o reader para Map.class e o resultado disso ele gaurda no dadosTesteMap

        System.out.println(dadosTesteMap.get("url"));
        System.out.println(dadosTesteMap.get("produto"));
        System.out.println(dadosTesteMap.get("valor"));




    }
}
