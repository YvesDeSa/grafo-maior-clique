package grafo.server.grafos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import grafo.server.grafos.services.GrafoService;

@RestController
@RequestMapping("/api/grafo")
public class GrafoController {

  @Autowired
  private GrafoService grafoService;

  @PostMapping
  public ResponseEntity<List<Integer>> processarGrafo(@RequestParam("file") MultipartFile file) {
    try {
      List<Integer> maiorClique = grafoService.processarArquivo(file);
      return ResponseEntity.ok(maiorClique);
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }
}
