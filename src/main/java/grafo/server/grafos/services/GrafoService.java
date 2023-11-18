package grafo.server.grafos.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import grafo.server.grafos.estruturas.AlgoritmoMaiorClique;
import grafo.server.grafos.estruturas.Grafo;
import grafo.server.grafos.estruturas.In;

@Service
public class GrafoService {

  public List<Integer> processarArquivo(MultipartFile file) throws IOException {
    Path tempPath = Files.createTempFile(null, null);
    file.transferTo(tempPath.toFile());
    
    In in = new In(tempPath.toFile());
    Grafo G = new Grafo(in);
    System.out.println(G);

    AlgoritmoMaiorClique algoritmoClique = new AlgoritmoMaiorClique(G);
    List<Integer> maiorClique = algoritmoClique.encontrarMaiorClique();

    return maiorClique;
  }
}
