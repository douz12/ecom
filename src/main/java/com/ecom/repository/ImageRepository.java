package com.ecom.repository;

import com.ecom.common.CouchDbConfig;
import com.ecom.model.Image;
import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ImageRepository extends CouchDbRepositorySupport<Image> {

    @Autowired
    private static CouchDbConfig couchDbConfig;

    public ImageRepository(CouchDbConnector db) {
        super(Image.class, db);
    }

    public static ImageRepository connectToCouchDb() {
        return new ImageRepository(couchDbConfig.getCouchDbConnector());
    }

    public List<Image> findBySrc(String src) {
        return queryView("by_src", src);
    }
}