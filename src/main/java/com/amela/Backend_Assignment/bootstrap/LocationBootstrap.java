package com.amela.Backend_Assignment.bootstrap;

import com.amela.Backend_Assignment.entities.City;
import com.amela.Backend_Assignment.entities.Location;
import com.amela.Backend_Assignment.repositories.LocationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LocationBootstrap implements CommandLineRunner {

    private final LocationRepository locationRepository;

    @Autowired
    public LocationBootstrap(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        locationRepository.deleteAll();

        //Sarajevo
        Location location1 = new Location();
        location1.setName("Bascarsija");
        location1.setAddress("Bascarsija 1");

        City sarajevo = new City();
        sarajevo.setName("Sarajevo");

        location1.setCity(sarajevo);
        location1.setLongitude(18.4131);
        location1.setLatitude(43.8563);

        //Beograd
        Location location2 = new Location();
        location2.setName("Kalemegdan");
        location2.setAddress("Kalemegdan");

        City belgrade = new City();
        belgrade.setName("Belgrade");

        location2.setCity(belgrade);
        location2.setLongitude(20.4612);
        location2.setLatitude(44.8125);

        //Berlin
        Location location3 = new Location();
        location3.setName("The Brandenburg Gate");
        location3.setAddress("Pariser Platz, 10117");

        City berlin = new City();
        berlin.setName("Berlin");

        location3.setCity(berlin);
        location3.setLongitude(13.4050);
        location3.setLatitude(52.5200);

        //Amsterdam
        Location location4 = new Location();
        location4.setName("Anne Frank House");
        location4.setAddress("Prinsengracht 263-267, 1016 GV");

        City amsterdam = new City();
        amsterdam.setName("Amsterdam");

        location4.setCity(amsterdam);
        location4.setLongitude(4.9041);
        location4.setLatitude(52.3676);

        //Ljubljana
        Location location5 = new Location();
        location5.setName("The Ljubljana Castle");
        location5.setAddress("Grajska planota 1, 1000");

        City ljubljana = new City();
        ljubljana.setName("Ljubljana");

        location5.setCity(ljubljana);
        location5.setLongitude(14.5058);
        location5.setLatitude(46.0569);

        //Zagreb
        Location location6 = new Location();
        location6.setName("Upper Town");
        location6.setAddress("Trg Sv Marka 5");

        City zagreb = new City();
        zagreb.setName("Zagreb");

        location6.setCity(zagreb);
        location6.setLongitude(15.9819);
        location6.setLatitude(45.8150);

        //Rome
        Location location7 = new Location();
        location7.setName("The Colosseum and the Arch of Constantine");
        location7.setAddress("Piazza del Colosseo, 1, 00184");

        City rome = new City();
        rome.setName("Rome");

        location7.setCity(rome);
        location7.setLongitude(12.4964);
        location7.setLatitude(41.9028);

        //Paris
        Location location8 = new Location();
        location8.setName("Eiffel Tower");
        location8.setAddress("Tour Eiffel, Champ de Mars, 75007");

        City paris = new City();
        paris.setName("Paris");

        location8.setCity(paris);
        location8.setLongitude(2.3522);
        location8.setLatitude(48.8566);

        //Madrid
        Location location9 = new Location();
        location9.setName("Prado Museum");
        location9.setAddress("Paseo del Prado");

        City madrid = new City();
        madrid.setName("Madrid");

        location9.setCity(madrid);
        location9.setLongitude(3.7038);
        location9.setLatitude(40.4168);

        //Istanbul
        Location location10 = new Location();
        location10.setName("Aya Sofya");
        location10.setAddress("Aya Sofya Meydani, Sultanahmet");

        City istanbul = new City();
        istanbul.setName("Istanbul");

        location10.setCity(istanbul);
        location10.setLongitude(28.9784);
        location10.setLatitude(41.0082);

        //Moscow
        Location location11 = new Location();
        location11.setName("Kremlin");
        location11.setAddress("Moscow, Russia, 103132");

        City moscow = new City();
        moscow.setName("Moscow");

        location11.setCity(moscow);
        location11.setLongitude(37.6173);
        location11.setLatitude(55.7558);

        //Stockholm
        Location location12 = new Location();
        location12.setName("The Royal Palace");
        location12.setAddress("Kungliga slottet, 107 70");

        City stockholm = new City();
        stockholm.setName("Stockholm");

        location12.setCity(stockholm);
        location12.setLongitude(18.0686);
        location12.setLatitude(59.3293);

        locationRepository.save(location1);
        locationRepository.save(location2);
        locationRepository.save(location3);
        locationRepository.save(location4);
        locationRepository.save(location5);
        locationRepository.save(location6);
        locationRepository.save(location7);
        locationRepository.save(location8);
        locationRepository.save(location9);
        locationRepository.save(location10);
        locationRepository.save(location11);
        locationRepository.save(location12);

        log.debug("Loading locations...");
    }
}
