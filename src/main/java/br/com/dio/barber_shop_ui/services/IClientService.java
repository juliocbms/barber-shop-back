package br.com.dio.barber_shop_ui.services;

import br.com.dio.barber_shop_ui.entity.ClientEntity;

public interface IClientService {

    ClientEntity save(final ClientEntity entity);

    ClientEntity update(final ClientEntity entity);

    void delete(final long id);

}
