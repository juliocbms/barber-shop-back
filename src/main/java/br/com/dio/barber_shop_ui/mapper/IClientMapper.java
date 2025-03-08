package br.com.dio.barber_shop_ui.mapper;


import br.com.dio.barber_shop_ui.controller.request.SaveClientRequest;
import br.com.dio.barber_shop_ui.controller.request.UpdateClientRequest;
import br.com.dio.barber_shop_ui.controller.response.ClientDetailResponse;
import br.com.dio.barber_shop_ui.controller.response.ListClientResponse;
import br.com.dio.barber_shop_ui.controller.response.SaveClientResponse;
import br.com.dio.barber_shop_ui.controller.response.UpdateClientResponse;
import br.com.dio.barber_shop_ui.entity.ClientEntity;
import jakarta.validation.Valid;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;
import static org.springframework.http.HttpStatus.CREATED;

@Mapper(componentModel = SPRING)
public interface IClientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final SaveClientRequest request);

    SaveClientResponse toSaveResponse(final ClientEntity entity);

    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final long id, final UpdateClientRequest request);

    UpdateClientResponse toUpdateResponse(final ClientEntity entity);

    ClientDetailResponse toDetailResponse(final ClientEntity entity);

    List<ListClientResponse> toListResponse(final List<ClientEntity> entities);

}
