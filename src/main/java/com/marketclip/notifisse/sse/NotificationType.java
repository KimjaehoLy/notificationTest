package com.marketclip.notifisse.sse;

import lombok.Getter;

@Getter
public enum NotificationType {

    MARKETCLIP(NotificationTypes.MARKETCLIP),
    KAKAO(NotificationTypes.KAKAO),
    NAVER(NotificationTypes.NAVER);

    private final String type;

    NotificationType(String type) {
        this.type = type;
    }

    public static class NotificationTypes{
        public static final String MARKETCLIP = "TYPE_MARKETCLIP";
        public static final String KAKAO = "TYPE_KAKAO";
        public static final String NAVER = "TYPE_NAVER";
    }

}
