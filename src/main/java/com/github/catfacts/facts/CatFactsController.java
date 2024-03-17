package com.github.catfacts.facts;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@Slf4j
@RestController
@RequiredArgsConstructor
class CatFactsController {

    private final CatFactsService catFactsService;

    @GetMapping
    Map<String, Object> getPrediction() {
        return catFactsService.query();
    }
}
