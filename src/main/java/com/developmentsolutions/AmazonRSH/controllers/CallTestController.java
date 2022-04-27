package com.developmentsolutions.AmazonRSH.controllers;

import com.developmentsolutions.AmazonRSH.DTO.CallDTO;
import com.developmentsolutions.AmazonRSH.models.CallTest;
import com.developmentsolutions.AmazonRSH.services.CallTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static java.lang.Integer.parseInt;

@RestController
@RequestMapping("/calltest")
public class CallTestController {

    @Autowired
    CallTestService callTestService;

    //Create
    //Insert tuple
    @PostMapping("/create/save")
    public CallDTO save(@RequestBody CallDTO call) throws Exception {
        callTestService.createCall(call);
        return call;
    }

    //Read
    //select 1 tuple
    @GetMapping("/get/{agent_id},{call_reason}")
    public ResponseEntity<CallDTO> getOne(@PathVariable("agent_id") Integer agent_id, @PathVariable("call_reason") String call_reason)
    {
        if(!callTestService.existsID(agent_id,call_reason))
        {
            return new ResponseEntity("no existe", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(callTestService.getOne(agent_id,call_reason));
    }

    @GetMapping("/get/all")
    public ResponseEntity<Iterable<CallDTO>> getAll()
    {
        return ResponseEntity.ok(callTestService.lista());
    }

    //Update
    @PutMapping("/update/call")
    public ResponseEntity<CallDTO> update(@RequestBody CallDTO calldto)
    {
        if(!callTestService.existsID(calldto.getAgent_id(),calldto.getCall_reason()))
            return new ResponseEntity("no existe, no se puede actualizar", HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(callTestService.update(calldto));
    }

    //Delete
    @DeleteMapping("/delete/{agent_id},{call_reason}")
    public ResponseEntity<?> delete(@PathVariable("agent_id") String agent_id,@PathVariable("call_reason") String call_reason){
        if(!callTestService.existsID(parseInt(agent_id),call_reason))
            return new ResponseEntity("no existe", HttpStatus.NOT_FOUND);
        callTestService.delete(parseInt(agent_id),call_reason);
        return new ResponseEntity("persona eliminada", HttpStatus.OK);
    }



}
