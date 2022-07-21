package com.marketclip.notifisse.sse;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Member {
    @Id
    String id;
}
