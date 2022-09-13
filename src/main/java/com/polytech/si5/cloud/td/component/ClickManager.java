package com.polytech.si5.cloud.td.component;

import com.polytech.si5.cloud.td.entities.ClickCounterEntity;
import com.polytech.si5.cloud.td.repository.IClickCounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClickManager {

    @Autowired
    private IClickCounterRepository counterRepository;

    @Autowired
    public ClickManager(IClickCounterRepository counterRepository) {
        this.counterRepository = counterRepository;
    }

    public int addClick(){
        List<ClickCounterEntity> counterList = counterRepository.findAll();
        ClickCounterEntity counter;
        if(counterList.isEmpty()){
            counter = new ClickCounterEntity();
        }else{
            counter = counterList.get(0);
        }
        counter.setCounter(counter.getCounter()+1);
        counterRepository.save(counter);
        return counter.getCounter();
    }

}
