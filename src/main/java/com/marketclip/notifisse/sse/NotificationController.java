package com.marketclip.notifisse.sse;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RequiredArgsConstructor
@RestController
public class NotificationController {

    private final NotificationService notificationService;

    /**
     * @title 로그인 한 유저 sse 연결
     */
    @GetMapping(value = "/subscribe/{id}", produces = "text/event-stream")
    public SseEmitter subscribe(@PathVariable String id,
                                @RequestHeader(value = "Last-Event-ID", required = false, defaultValue = "") String lastEventId) {
        return notificationService.subscribe(id, lastEventId);
    }
    @PostMapping("/reviews")
    public void sendReview(@RequestBody Notification no,@RequestParam String content){
        Member mb = new Member();
        mb.setId("5");
        Review rv = new Review();
        rv.setReview("하이여");
        rv.setId("1");
        notificationService.send(mb, rv, content);
    }
}
