package com.marketclip.notifisse.sse;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Member {
    @Id
    String id;
}
