package com.ecom.repository;

import com.ecom.common.CouchDbConfig;
import com.ecom.model.Image;
import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ImageRepository extends CouchDbRepositorySupport<Image> {

    public ImageRepository(CouchDbConnector db) {
        super(Image.class, db);
    }

    public List<Image> findBySrc(String src) {
        return queryView("by_src", src);
    }
}
