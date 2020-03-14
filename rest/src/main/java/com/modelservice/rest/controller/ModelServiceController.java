package com.modelservice.rest.controller;


import org.springframework.context.annotation.Lazy;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelservice.contract.api.PetsApi;

import io.swagger.annotations.Api;

@Api(value = "v1_models")
@RestController
@RequestMapping(value = "V1", produces = MediaType.APPLICATION_JSON_VALUE)
@Lazy
public class ModelServiceController implements PetsApi {
	
}

