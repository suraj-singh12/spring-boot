package com.learning.springboot.sortingAlgorithm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Component;

@Component
public class AnotherComplexAlgorithm {
    @Autowired @Qualifier("radixSort")
    private SortingAlgorithm iWantRadixSortOnly;
}
