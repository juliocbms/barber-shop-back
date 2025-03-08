package br.com.dio.barber_shop_ui.services;

import br.com.dio.barber_shop_ui.entity.ScheduleEntity;

public interface IScheduleService {

    ScheduleEntity save(final ScheduleEntity entity);

    void delete(final long id);

}
