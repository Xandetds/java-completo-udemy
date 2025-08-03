    package IOeSerialization.inputOutput;

    import java.nio.file.Path;
    import java.nio.file.Paths;
    import java.nio.file.Files;
    import java.io.IOException;


    public class exercicio05 {
        public static void main(String[] args) {
            
            Path path = Paths.get("meuArquivo2.txt");

            try {

                Files.write(path, "oi mundo 2!".getBytes());

                byte[] bytes = Files.readAllBytes(path);

                String content = new String(bytes); 

                System.out.println(content);
            
            } catch (IOException e){
                System.out.println("Problemas de exception" + e.getMessage());
            }

        }
    }
