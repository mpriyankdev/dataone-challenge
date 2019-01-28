package com.dataone.jsontransformer.resource;

import com.dataone.jsontransformer.model.DataModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class JsonTransformResource {


    @GetMapping("/status")
    public String getStatus(){
        return "ALL OK";
    }

    @PostMapping("/flatten")
    public ResponseEntity<DataModel> getFlattenedStructure(@RequestBody DataModel model){

        return new ResponseEntity(model , HttpStatus.OK );

    }

    @PutMapping("/alpha")
    public ResponseEntity<DataModel> getAlphabeticalOrder(@RequestBody DataModel model){

        return new ResponseEntity(model , HttpStatus.ACCEPTED );

    }
}
