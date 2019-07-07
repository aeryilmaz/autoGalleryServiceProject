package org.csystem.springboot.autogalleryserviceapp.controller;


import org.csystem.springboot.autogalleryserviceapp.entity.AutoInfo;
import org.csystem.springboot.autogalleryserviceapp.service.IAutoInfoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autosrest")
public class AutoInfoRest {
    private final IAutoInfoService m_AutoInfoService;

    public AutoInfoRest(IAutoInfoService m_AutoInfoService) {
        this.m_AutoInfoService = m_AutoInfoService;
    }

    @GetMapping("/autoscount")
    public Iterable<AutoInfo> getTop(@RequestParam("limit") int limit)
    {
        return m_AutoInfoService.findTop(limit);
    }

    @GetMapping("/autos")
    public Iterable<AutoInfo> getAutosByKmIntervalAndRent(@RequestParam("kmin") int kmin,
                                                          @RequestParam("kmax") int kmax,
                                                          @RequestParam("rent") boolean rent){
        return m_AutoInfoService.getAutosByKmIntervalAndRent(kmin,kmax,rent);
    }

    @PostMapping
    public AutoInfo save(@RequestBody AutoInfo autoInfo){
        return m_AutoInfoService.save(autoInfo);
    }





}
