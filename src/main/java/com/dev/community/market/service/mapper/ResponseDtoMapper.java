package com.dev.community.market.service.mapper;

public interface ResponseDtoMapper<D, T> {

    D mapToDto(T model);
}
