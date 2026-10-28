package com.example.hito4.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.hito4.models.Estudiante;

@Controller 
public class EstudianteController {
    private static Map<String, Estudiante>  estudiantes = new HashMap <>() ;   // esta parte es la creacion del mapa 
    static {
        Estudiante estudiante1 = new Estudiante("Liz","Quispe",19,"SIS24519778","ingenieria de sistemas");
        Estudiante estudiante2 = new Estudiante("Luz", "Zegarra", 20, "SIS78945612","Ingenieria de sistemas");
        Estudiante estudiante3 = new Estudiante("Sofia", "Ibañez", 19, "SIS123546789","Ingenieria de sistemas");
        estudiantes.put(estudiante1.getCodigo(), estudiante1);
        estudiantes.put(estudiante2.getCodigo(), estudiante2);
        estudiantes.put(estudiante3.getCodigo(), estudiante3);
    }                                                // cuando trabaja con recursos es una URI osea una direccion URL que retorna recursos y el end point es la parte final de la direccion
    @GetMapping ("/estudiantes")
    public ResponseEntity<Object> getestudiantes(){
        return new ResponseEntity<>(estudiantes.values(),HttpStatus.OK);

    }
}
