package com.learning.service;

import com.amazonaws.util.EC2MetadataUtils;
import com.learning.domain.Request;
import com.learning.domain.Response;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LearningService {

    public Response learn(Request request){
        Response response = new Response();
        String msg = String.format("Hi %s, welcome to learning centre", request.getFirstName() + " " + request.getLastName());
        response.setFullName(request.getFirstName() + " " + request.getLastName());
        response.setMessage(msg);
        response.setInstance(getInstanceDetails());
        return response;
    }

    public Response learn(){
        Response response = new Response();
        response.setFullName("Hi, welcome to learning centre");
        response.setInstance(getInstanceDetails());
        return response;
    }

    private Map<String, String> getInstanceDetails(){
        Map<String, String> instance = new HashMap<>();

        String instanceId = EC2MetadataUtils.getInstanceId();

        String privateIp = EC2MetadataUtils.getInstanceInfo().getPrivateIp();

        String availabilityZone = EC2MetadataUtils.getInstanceInfo().getAvailabilityZone();

        instance.put("instanceId", instanceId);
        instance.put("privateIp", privateIp);
        instance.put("availabilityZone", availabilityZone);
        return instance;
    }
}
