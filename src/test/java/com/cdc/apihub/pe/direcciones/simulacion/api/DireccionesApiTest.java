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
		apiClient.setBasePath("the_url");
    }
    
    @Test
    public void direccionesTest() throws ApiException {
        
        String xApiKey = "your_api_key";
        
        Peticion request = new Peticion();
        request.setTipoDocumento("XX");
        request.setNumeroDocumento("XXXXXX");
        
        
        try {
        	Respuesta response = api.direcciones(xApiKey, request);
    		Assert.assertNotNull(response);
    		System.out.println(response);
    	} catch (ApiException e) {
    		System.out.println(e);
    	}
    }
    
}
