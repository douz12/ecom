package com.ecom.common.utils;

import com.google.common.base.Function;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public  class  QueryResponse<T> {
    public static <T> Function<Optional<T>, ResponseEntity<T>> toResponseEntity() {
        return new Function<Optional<T>, ResponseEntity<T>>() {
            @Override
            public ResponseEntity<T> apply(Optional<T> t) {
                if (t.isPresent()) return new ResponseEntity<T>(t.get(), HttpStatus.OK);
                return new ResponseEntity<T>(HttpStatus.NOT_FOUND);
            }
        };
    }
}
