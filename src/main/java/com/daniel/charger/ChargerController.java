package com.daniel.charger;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

@RestController
public class ChargerController {
    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }

    @GetMapping("/chargers")
    public List<ResponseObject.ChargeDevice> getChargers(@RequestParam float lat, @RequestParam float lng) {
        String uri = "https://chargepoints.dft.gov.uk/api/retrieve/registry/lat/" + lat + "/long/" + lng + "/limit/3/dist/10/format/json";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        ObjectMapper mapper = new ObjectMapper();
        ResponseObject chargers = null;
        try {
            chargers = mapper.readValue(result, ResponseObject.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return
                chargers.getChargeDevices();
    }
}