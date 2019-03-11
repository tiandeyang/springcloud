package com.dytian.yuemee.common.page;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.nutz.json.Json;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;

import java.util.List;

public class QueryWhere {

    public static QueryWrapper where(){
        return new QueryWrapper();
    }

    public static QueryWrapper parseFrom(String param){

        QueryWrapper wrapper = new QueryWrapper<>();
        List list = Json.fromJson(List.class, param);

        for (Object object:list){
            NutMap map = Json.fromJson(NutMap.class, Json.toJson(object));
            String fieldName = map.getString("fieldName");
            String operator = map.getString("operator","");
            if (Strings.isBlank(operator)){
                String orderBy = map.getString("orderBy");
                if (orderBy.equalsIgnoreCase("desc")){
                    wrapper.orderByDesc(fieldName);
                }
                if (orderBy.equalsIgnoreCase("asc")){
                    wrapper.orderByAsc(fieldName);
                }
            }else {
                Object value = map.get("value");
                if (operator.equalsIgnoreCase("=")){
                    wrapper.eq(fieldName,value);
                }
                if (operator.equalsIgnoreCase(">")){
                    wrapper.gt(fieldName,value);
                }
                if (operator.equalsIgnoreCase("<")){
                    wrapper.lt(fieldName,value);
                }
            }
        }
        return wrapper;

    }


}
