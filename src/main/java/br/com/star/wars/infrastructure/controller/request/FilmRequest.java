package br.com.star.wars.infrastructure.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class FilmRequest {

    private Integer id;

}
