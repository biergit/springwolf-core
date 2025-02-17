package io.github.stavshamir.springwolf.asyncapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.github.stavshamir.springwolf.asyncapi.types.AsyncAPI;

public interface AsyncApiSerializerService {

    String toJsonString(AsyncAPI asyncAPI) throws JsonProcessingException;

}
