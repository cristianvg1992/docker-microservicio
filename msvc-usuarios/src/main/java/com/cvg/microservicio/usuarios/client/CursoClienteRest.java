package com.cvg.microservicio.usuarios.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "msvc-cursos", url = "localhost:8002")
public interface CursoClienteRest {

    @DeleteMapping("/api/cursos/eliminar-curso-usuario/{id}")
    void eliminarCursoUsuario(@PathVariable Long id);

}
