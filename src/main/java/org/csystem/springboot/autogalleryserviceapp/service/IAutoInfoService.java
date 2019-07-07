package org.csystem.springboot.autogalleryserviceapp.service;

import org.csystem.springboot.autogalleryserviceapp.entity.AutoInfo;

public interface IAutoInfoService {
    Iterable<AutoInfo> findTop(int limit);
    Iterable<AutoInfo> getAutosByMake(String make);
    Iterable<AutoInfo> getAutosByModel(String model);
    Iterable<AutoInfo> getAutosByKmInterval(int min,int max);
    Iterable<AutoInfo> findByYearInterval(int min,int max);
    Iterable<AutoInfo> getAutosByKmIntervalAndRent(int min,int max,boolean rent);
    AutoInfo save(AutoInfo autoInfo);

}
