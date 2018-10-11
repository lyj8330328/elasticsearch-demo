package com.leyou.elasticsearchdemo.repository;

import com.leyou.elasticsearchdemo.pojo.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: 98050
 * Time: 2018-10-10 17:28
 * Feature:
 */
@Component
public interface ItemRepository extends ElasticsearchRepository<Item,Long> {
    /**
     * 根据价格区间查询
     * @param price1
     * @param price2
     * @return
     */
    List<Item> findByPriceBetween(double price1, double price2);
}
