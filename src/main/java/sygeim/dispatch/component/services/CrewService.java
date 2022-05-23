package sygeim.dispatch.component.services;

import io.micronaut.http.client.annotation.Client;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import sygeim.dispatch.component.dto.Crew;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

@Singleton
public class CrewService {

    @Inject
    @Client("/")
    HttpClient http;



}
