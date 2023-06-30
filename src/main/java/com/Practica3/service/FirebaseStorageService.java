
package com.Practica3.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {
    
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    
    final String BucketName = "xxPractica 3xx.appspot.com";
    
    //ruta basica del proyecto
    final String rutaSuperiorStorage = "Practica 3";
    
    //Ubicacion donde se encuentra el archivo de Json
    final String rutaJsonFile = "firebase";
    
    //nombre archivo Json
    final String archivoJsonFile = "practica-3-79de9-firebase-adminsdk-euf8r-f15ed15544";
}
