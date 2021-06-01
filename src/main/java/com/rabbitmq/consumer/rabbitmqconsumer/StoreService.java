package com.rabbitmq.consumer.rabbitmqconsumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class StoreService {

    @Autowired
    private MedicineRepository medicineRepository;

    private ObjectMapper objectMapper = new ObjectMapper();


    @Autowired
    private OneMgRepository oneMgRepository;
    public List<String>storeMedicine(Onemg onemg)throws Exception{

        val data = onemg.getData().getSkus();
        List<String> medicines = new ArrayList<>();

        for(Onemg.Sku dat : data){

            Medicine medicine = Medicine.builder()
                    .manufacturerName(dat.getManufacturer_name())
                    .type(dat.getType())
                    .price(dat.getPrice())
                    .name(dat.getName())
                    .foreignId(dat.getId())
                    .skuId(dat.getSku_id())
                    .packSizeLabel(dat.getPack_size_label())
                    .rxRequiredHeader(dat.getRx_required() != null ?dat.getRx_required().getHeader():""  )
                    .iconUrl(dat.getRx_required() != null ?dat.getRx_required().getIcon_url(): "")
                    .slug(dat.getSlug())
                    .shortComposition(dat.getShort_composition())
                    .imageUrl(dat.getImage_url())
                    .build();
            try {
                medicineRepository.save(medicine);
                medicines.add(dat.getName());

            }catch (Exception ex){
                String temp ="ERROR in +"+dat.getName() +"for"+ ex.getMessage() ;
                medicines.add( temp);


            }

        }

        byte[] metadata = objectMapper.writeValueAsBytes(onemg);
        log.info("Metadata = {}", metadata);
        System.out.println();
        OneMgMed oneMgMed = new OneMgMed();
        oneMgMed.setMetadata(metadata);
        oneMgMed = oneMgRepository.save(oneMgMed);
        log.info("oneMgMed = {}",oneMgMed);


        return medicines;

    }


    public OneMgMed getMetadata(){
        return oneMgRepository.findAll().get(0);
    }
    public Onemg getMetadata2()throws IOException {
        return objectMapper.readValue(oneMgRepository.findAll().get(0).getMetadata(), Onemg.class);
    }
}
