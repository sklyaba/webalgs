package ru.dan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.dan.configs.DataConfig;
import ru.dan.entities.Flat;
import ru.dan.services.FlatService;

import java.util.List;

@Slf4j
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(DataConfig.class);

        FlatService bean = applicationContext.getBean(FlatService.class);
        List<Flat> all = bean.findAll();
        System.out.println(all.toString());

        Flat byId = bean.findByNumber(1);
        System.out.println(byId);

        Flat bySquare = bean.findBySquare(44);

        log.info(byId.toString());

        System.out.println(bySquare.toString());

        Thread thread = new Thread(() -> {
            System.out.println("This is a new thread");
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();

    }
}
