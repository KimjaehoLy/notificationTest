package com.marketclip.notifisse.sse;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
public class Review {

    String id;

    String review;
}
