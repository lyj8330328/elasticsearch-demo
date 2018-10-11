package com.leyou.elasticsearchdemo;

import com.leyou.elasticsearchdemo.pojo.Item;
import com.leyou.elasticsearchdemo.repository.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticsearchDemoApplicationTests {

    @Autowired
    private ItemRepository repository;

    @Test
    public void index(){
        Item item = new Item(1L,"小米手机8","手机","小米",3899.00,"http://image.leyou.com/13123.jpg");
        repository.save(item);
    }

}
