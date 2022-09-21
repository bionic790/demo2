package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = DemoApplication.class)
@WebMvcTest
public class GeoCodeControllerTest {
	
	@Autowired
    private MockMvc mockMvc;
 
    //@MockBean
    //private StudentService studentService;
 
    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void ControllerTest( ) throws Exception{
    	String uri = "/geocode";
    	   MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(uri)
    	      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
    	   
    	   int status = mvcResult.getResponse().getStatus();
    	   assertEquals(400, status);
//    	   String content = mvcResult.getResponse().getContentAsString();

 

}
}
