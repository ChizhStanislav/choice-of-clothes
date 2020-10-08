package com.example.choiceofclothes.util;

import com.example.choiceofclothes.exception.NotConnectionException;
import com.example.choiceofclothes.exception.NotFoundException;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;
import lombok.extern.log4j.Log4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static java.lang.String.format;

@Log4j
@Component
public class RequestTemperature {

    public Integer getTemperature(String city) {

        String callApi = format("https://api.openweathermap.org/data/2.5/weather?q=%s&appid=015d2a4f83a457746a1913f2ec53c246&units=metric&lang=ru", city);
        String jsonPath = "$.main.temp";

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

            HttpGet request = new HttpGet(callApi);

            try (CloseableHttpResponse response = httpClient.execute(request)) {

                HttpEntity entity = response.getEntity();

                String result = EntityUtils.toString(entity);

                try {
                    return ((Number) JsonPath.read(result, jsonPath)).intValue();
                } catch (PathNotFoundException e) {
                    log.info(format("City %s not found", city));
                    throw new NotFoundException(format("City %s not found", city));
                }
            }
        } catch (IOException e) {
            log.error(e.getMessage());
            throw new NotConnectionException("Not connection with Weather API");
        }
    }
}
