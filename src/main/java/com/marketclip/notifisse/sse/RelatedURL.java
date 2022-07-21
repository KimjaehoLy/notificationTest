package com.marketclip.notifisse.sse;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "related_url")
public class RelatedURL {
    @Id
    String id;
    String url;
    public RelatedURL(String url) {
        this.url = url;
    }

    public RelatedURL() {

    }
}