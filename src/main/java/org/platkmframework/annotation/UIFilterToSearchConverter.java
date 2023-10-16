package org.platkmframework.annotation;

import java.lang.reflect.Parameter;

import org.platkmframework.annotation.exception.UIFilterToSearchConverterException;

public interface UIFilterToSearchConverter {
	
	
	public Object convert(String strBody, Parameter parameter) throws UIFilterToSearchConverterException;
	

}
