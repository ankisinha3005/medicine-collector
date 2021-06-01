package com.rabbitmq.consumer.rabbitmqconsumer;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class MedController {

    @Autowired
    private StoreService storeService;
    @PostMapping("/store")
    @ApiOperation("getStore")
    public List<String> storeMedicine(@RequestBody Onemg onemg)throws Exception{

      return   storeService.storeMedicine(onemg);
    }

    @GetMapping("/get")
    @ApiOperation("getMed")
    public OneMgMed storeMeds()throws Exception{

        return   storeService.getMetadata();
    }
    @GetMapping("/get2")
    @ApiOperation("getMed")
    public Onemg storeMeds2()throws Exception{

        return   storeService.getMetadata2();
    }
}
