package com.example.workflow.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.workflow.model.EsignResponse;

@FeignClient(name = "external-service", url = "http://localhost:8090", path = "/monoDbExample")
public interface ExternalServiceOne {

    @GetMapping("/first/sayHelllo")
    EsignResponse sayHello();
	
}
