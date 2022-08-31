package br.com.tempoclima.tempoclima.service;

import java.io.IOException;
import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import br.com.tempoclima.tempoclima.model.ClimaModel;

@Service
public class ClimaService {
    
ClimaModel climaModel = new ClimaModel();

    public String inicio() throws IOException, InterruptedException{
        String url = "https://api.openweathermap.org/data/2.5/weather?q="+climaModel.getCityName()+","+ climaModel.getStateCode() +","+climaModel.getCountryCode()
        +"&appid=" + climaModel.getApiKey() + "&units=metric&lang=" + climaModel.getLanguage();
        URI endereco = URI.create(url.replace(" ","%20"));
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao =  HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> resposta = cliente.send(requisicao, BodyHandlers.ofString());
        String body = resposta.body();
        JSONObject objeto = new JSONObject(body);
        int temperatura = objeto.getJSONObject("main").getInt("temp");
        return "A temperatura é de "+ temperatura+ "°C em " + climaModel.getCityName().toUpperCase() +" - "+climaModel.getStateCode().toUpperCase()+".";
    }

    public void pegarPorCidade(String cityName){
        climaModel.setCityName(cityName);
    }

    public void pegarPorCidadeEstado(String cityName, String stateCode){
        climaModel.setCityName(cityName);
        climaModel.setStateCode(stateCode);
    }
}
