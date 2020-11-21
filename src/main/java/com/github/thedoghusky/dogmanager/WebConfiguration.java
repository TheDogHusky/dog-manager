package com.github.thedoghusky.dogmanager;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

@Configuration
@EnableWebMvc
public class WebConfiguration implements WebMvcConfigurer {


	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO Auto-generated method stub
		converters.add(new HttpMessageConverter<Dog>() {

			@Override
			public boolean canRead(Class<?> clazz, MediaType mediaType) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean canWrite(Class<?> clazz, MediaType mediaType) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public List<MediaType> getSupportedMediaTypes() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Dog read(Class<? extends Dog> clazz, HttpInputMessage inputMessage)
					throws IOException, HttpMessageNotReadableException {
				return null;
			}

			@Override
			public void write(Dog t, MediaType contentType, HttpOutputMessage outputMessage)
					throws IOException, HttpMessageNotWritableException {
				// TODO Auto-generated method stub
				
			}
		})
	}
    
    
}