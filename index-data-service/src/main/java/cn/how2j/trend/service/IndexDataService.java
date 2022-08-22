/**
 * @Title: IndexDataService
 * @Auther: zhang
 * @Version: 1.0
 * @create: 2022/6/30 8:46
 */
package cn.how2j.trend.service;

import cn.how2j.trend.pojo.IndexData;
import cn.hutool.core.collection.CollUtil;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "index_datas")
public class IndexDataService {

    @Cacheable(key = "'indexData-code-'+ #p0")
    public List<IndexData> get(String code) {
        return CollUtil.toList();
    }
}
