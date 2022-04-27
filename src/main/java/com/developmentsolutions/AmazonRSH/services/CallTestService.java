package com.developmentsolutions.AmazonRSH.services;

import com.developmentsolutions.AmazonRSH.DTO.CallDTO;
import com.developmentsolutions.AmazonRSH.models.CallCompositeKey;
import com.developmentsolutions.AmazonRSH.models.CallTest;
import com.developmentsolutions.AmazonRSH.repositories.CallTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CallTestService {

    @Autowired
    CallTestRepository callTestRepository;

    //Create

    public void createCall(final CallDTO call)
    {
        CallTest c = new CallTest();
        c.setCall_reason(call.getCall_reason());
        c.setAgent_id(call.getAgent_id());
        c.setDescription(call.getDescription());
        c.setDuration(call.getDuration());
        c.setPermissions(call.getPermissions());
        c.setTags(call.getTags());
        c.setTimestamp(call.getTimestamp());
        c.setUser_name(call.getUser_name());
        c.setVideo_reference(call.getVideo_reference());

        callTestRepository.save(c);
    }

    //Read
    public List<CallDTO> lista() {
        List<CallDTO> dummy = null;
        for (CallTest item : callTestRepository.findAll()) {
            CallDTO c = new CallDTO();
            c.setCall_reason(item.getCall_reason());
            c.setAgent_id(item.getAgent_id());
            c.setDescription(item.getDescription());
            c.setDuration(item.getDuration());
            c.setPermissions(item.getPermissions());
            c.setTags(item.getTags());
            c.setTimestamp(item.getTimestamp());
            c.setUser_name(item.getUser_name());
            c.setVideo_reference(item.getVideo_reference());
            dummy.add(c);
        }
        return dummy;
    }

    public CallDTO getOne(Integer agent_id,String call_Reason)
    {
        CallCompositeKey callCompositeKey = new CallCompositeKey(agent_id,call_Reason);
        CallTest item = callTestRepository.findById(callCompositeKey).get();
        CallDTO c = new CallDTO();
        c.setCall_reason(item.getCall_reason());
        c.setAgent_id(item.getAgent_id());
        c.setDescription(item.getDescription());
        c.setDuration(item.getDuration());
        c.setPermissions(item.getPermissions());
        c.setTags(item.getTags());
        c.setTimestamp(item.getTimestamp());
        c.setUser_name(item.getUser_name());
        c.setVideo_reference(item.getVideo_reference());

        return c;
    }

    public boolean existsID(Integer agent_id, String call_reason)
    {
        CallCompositeKey callCompositeKey = new CallCompositeKey(agent_id, call_reason);
        return callTestRepository.existsById(callCompositeKey);
    }

    //Update

    public CallDTO update(CallDTO item)
    {
        CallCompositeKey callCompositeKey = new CallCompositeKey(item.getAgent_id(), item.getCall_reason());
        CallTest c = callTestRepository.findById(callCompositeKey).get();
        c.setCall_reason(item.getCall_reason());
        c.setAgent_id(item.getAgent_id());
        c.setDescription(item.getDescription());
        c.setDuration(item.getDuration());
        c.setPermissions(item.getPermissions());
        c.setTags(item.getTags());
        c.setTimestamp(item.getTimestamp());
        c.setUser_name(item.getUser_name());
        c.setVideo_reference(item.getVideo_reference());

        callTestRepository.save(c);
        return item;
    }

    //Delete

    public void delete(Integer agent_id, String call_reason)
    {
        CallCompositeKey callCompositeKey = new CallCompositeKey(agent_id, call_reason);
        callTestRepository.deleteById(callCompositeKey);
    }

}
