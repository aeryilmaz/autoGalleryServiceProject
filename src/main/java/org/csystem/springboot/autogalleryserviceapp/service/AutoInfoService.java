package org.csystem.springboot.autogalleryserviceapp.service;

import org.csystem.springboot.autogalleryserviceapp.repository.IAutoInfoRepository;
import org.springframework.stereotype.Service;

import org.csystem.springboot.autogalleryserviceapp.entity.AutoInfo;

@Service
public class AutoInfoService implements IAutoInfoService {

    private final IAutoInfoRepository m_autoInfoRepository;

    public AutoInfoService(IAutoInfoRepository m_autoInfoRepository) {
        this.m_autoInfoRepository = m_autoInfoRepository;
    }

    @Override
    public Iterable<AutoInfo> getAutosByMake(String type) {
        return m_autoInfoRepository.findByMake(type);
    }

    @Override
    public Iterable<AutoInfo> getAutosByModel(String model) {
        return m_autoInfoRepository.findByModel(model);
    }

    @Override
    public Iterable<AutoInfo> getAutosByKmInterval(int min, int max) {
        return m_autoInfoRepository.findByKmInterval(min,max);
    }

    @Override
    public Iterable<AutoInfo> findByYearInterval(int min, int max) {
        return m_autoInfoRepository.findByYearInterval(min,max);
    }

    @Override
    public Iterable<AutoInfo> getAutosByKmIntervalAndRent(int min, int max, boolean rent) {
        return m_autoInfoRepository.findByKmIntervalAndRent(min,max,rent);
    }

    @Override
    public Iterable<AutoInfo> findTop(int limit) {
        return m_autoInfoRepository.findTop(limit);
    }

    @Override
    public AutoInfo save(AutoInfo autoInfo) {
        return m_autoInfoRepository.save(autoInfo);
    }
}
