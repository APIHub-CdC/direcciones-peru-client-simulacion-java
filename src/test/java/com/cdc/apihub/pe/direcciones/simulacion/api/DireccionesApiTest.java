package com.cdc.apihub.pe.direcciones.simulacion.api;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cdc.apihub.pe.direcciones.simulacion.client.ApiClient;
import com.cdc.apihub.pe.direcciones.simulacion.client.ApiException;
import com.cdc.apihub.pe.direcciones.simulacion.model.Peticion;
import com.cdc.apihub.pe.direcciones.simulacion.model.Respuesta;


public class DireccionesApiTest {
	
    private final DireccionesApi api = new DireccionesApi();
    	
        
    @Before()
    public void setUp() {
    	ApiClient apiClient = api.getApiClient();
		apiClient.setBasePath("https://circulodecredito-dev.apigee.net/sandbox/v1/direcciones");
    }
    
    @Test
    public void direccionesTest() throws ApiException {
        
        String xApiKey = "dx9zHqQITXVSLdHIUde0uGraM5kPqTkz";
        
        Peticion request = new Peticion();
        request.setTipoDocumento("1");
        request.setNumeroDocumento("00439813");
        
        
        try {
        	Respuesta response = api.direcciones(xApiKey, request);
    		Assert.assertNotNull(response);
    		System.out.println(response);
    	} catch (ApiException e) {
    		System.out.println(e);
    	}
    }
    
}
