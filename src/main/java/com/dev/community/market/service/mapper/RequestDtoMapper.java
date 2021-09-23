package com.dev.community.market.service.mapper;

import com.dev.community.market.model.User;

public interface RequestDtoMapper<D, T> {

    T mapToModel(D dto);
}
