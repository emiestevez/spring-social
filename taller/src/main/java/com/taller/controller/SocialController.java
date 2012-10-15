package com.taller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/social")
public class SocialController {

    @Autowired
    private TwitterTemplate twitterTemplate;
    @Autowired
    @Qualifier("datos")
    private String datos;

    @RequestMapping(value = "/user/id", method = RequestMethod.GET)
    public @ResponseBody
    String getUserId() {
        return datos;
    }

    @RequestMapping(value = "/twitter/tweet", method = RequestMethod.GET)
    public @ResponseBody
    List<Tweet> buscarTweets() {
        return twitterTemplate.timelineOperations().getHomeTimeline();

    }

    @RequestMapping(value = "/twitter/perfil", method = RequestMethod.GET)
    public @ResponseBody
    TwitterProfile buscarPerfil() {
        return twitterTemplate.userOperations().getUserProfile();
    }

    @RequestMapping(value = "/twitter/tweet/{mensaje}", method = RequestMethod.POST)
    public @ResponseBody
    Tweet crearTweet(@PathVariable String mensaje) {
        return twitterTemplate.timelineOperations().updateStatus(mensaje);
    }
}
