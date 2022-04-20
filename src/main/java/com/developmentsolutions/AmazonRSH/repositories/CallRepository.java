package com.developmentsolutions.AmazonRSH.repositories;

import com.developmentsolutions.AmazonRSH.models.Call;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class CallRepository {

    private List<Call> calls = new ArrayList<>();

    public List<Call> findAll(){
        return this.calls;
    }


}
