package com.demo.mybatis.model;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;

public class JsonSeralize {
  public String serialize(Xy xy){
    String xyjson=null;
    try{

      ObjectMapper objectMapper = new ObjectMapper();
      StringWriter stringWriter = new StringWriter();
      JsonGenerator jsonGenerator = new JsonFactory().createJsonGenerator(stringWriter);
      objectMapper.writeValue(jsonGenerator, xy);
      jsonGenerator.close();
      xyjson = stringWriter.toString();

    } catch (JsonGenerationException e) {
      e.printStackTrace();
    } catch (JsonMappingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return xyjson;
  }
}
