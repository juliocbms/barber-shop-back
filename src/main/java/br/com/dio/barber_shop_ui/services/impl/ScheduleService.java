package br.com.dio.barber_shop_ui.services.impl;

import br.com.dio.barber_shop_ui.entity.ScheduleEntity;
import br.com.dio.barber_shop_ui.repository.IScheduleRepository;
import br.com.dio.barber_shop_ui.services.IScheduleService;
import br.com.dio.barber_shop_ui.services.query.IScheduleQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class ScheduleService implements IScheduleService {

    private final IScheduleRepository repository;
    private final IScheduleQueryService queryService;


    @Override
    public ScheduleEntity save(final ScheduleEntity entity) {
        queryService.verifyIfScheduleExists(entity.getStartAt(), entity.getEndAt());
        return repository.save(entity);
    }

    @Override
    public void delete(long id) {
        queryService.findById(id);
        repository.deleteById(id);
    }
}
