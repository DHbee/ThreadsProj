package com.dharbor.concurrent.map;

import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @Author: psaradhi
 * Created: 02-03-2023
 */

/*
     1. It has concurrent access enabled for its submaps.
        The "submaps" are the maps returned by various methods like headMap(), subMap() and tailMap()
     2. If you make changes to the original map, these changes are reflected in the head map also.
        ex:- ConcurrentNavigableMap headMap = map.headMap("2");
 */
public class ConcurrentNavigableMapDemo {

    ConcurrentNavigableMap<String,String> map =
            new ConcurrentSkipListMap<String, String>();



}
