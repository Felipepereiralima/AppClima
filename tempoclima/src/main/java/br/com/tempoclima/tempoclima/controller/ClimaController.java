package br.com.tempoclima.tempoclima.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tempoclima.tempoclima.service.ClimaService;

@RestController
@RequestMapping("/")
public class ClimaController {

@Autowired
private ClimaService climaService;

    @GetMapping("/temperatura")
    public String pegarTemperatura() throws IOException, InterruptedException{
        return climaService.inicio();
    }

    @GetMapping("/temperatura/{cityName}")
    public String mostrarPorCidade(@PathVariable String cityName)throws IOException, InterruptedException{
        climaService.pegarPorCidade(cityName);
        return climaService.inicio();
    }
}
