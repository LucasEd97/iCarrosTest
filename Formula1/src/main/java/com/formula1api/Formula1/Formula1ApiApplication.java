package com.formula1api.Formula1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;


@SpringBootApplication
public class Formula1ApiApplication {

	public static void main(String[] args) throws IOException {

//		SpringApplication.run(Formula1ApiApplication.class, args);

		String urlParaChamada = "https://ergast.com/api/f1/2017/last/results.json";
		int codigoSucesso = 200;

		URL url = new URL(urlParaChamada);
		HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

		if (conexao.getResponseCode() != codigoSucesso) {
			throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
		}
		BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
		String jsonAsString = Tools.converteJsonEmString(resposta);

		System.out.println("Parsing...");

		Gson gson = new Gson();
//		Type type = new TypeToken<Data>(){}.getType();

		Data data = gson.fromJson(jsonAsString, Data.class);

		System.out.println("Json Convertido: " + jsonAsString);

		System.out.println("Classe Convertida: " + data.getSeries());

//		System.out.println("Season: " + raceData);

	}

}
