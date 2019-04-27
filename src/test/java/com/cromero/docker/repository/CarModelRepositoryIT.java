package com.cromero.docker.repository;


import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.CoreMatchers.is;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
public class CarModelRepositoryIT {

    @Autowired
    private CarRepository repository;

    @After
    public void tearDown(){
        repository.deleteAll();
    }

    @Test
    public void createCar() throws Exception {
        CarModel carModel = new CarModel();
        carModel.setModel("ford");
        carModel.setSeatingCapacity(4);
        final CarModel carModel1 = repository.save(carModel);
        Assert.assertNotNull(carModel1);

    }

    @Test
    public void getCar() throws Exception {
        CarModel carModel = new CarModel();
        carModel.setModel("ford");
        carModel.setSeatingCapacity(4);

        final CarModel carModel1 = repository.save(carModel);
        final CarModel aTodo = repository.getOne(carModel1.getId());
        Assert.assertNotNull(aTodo);

    }

    @Test
    public void updateCar() throws Exception {
        CarModel carModel = new CarModel();
        carModel.setModel("ford");
        carModel.setSeatingCapacity(4);

        final CarModel carModel1 = repository.save(carModel);
        carModel.setModel("seat");

        final CarModel carModel2 = repository.save(carModel1);
        Assert.assertNotNull(carModel2);
        Assert.assertThat(carModel2.getModel(), is("seat"));

    }

}
