package com.olehpodolin.springbootjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class GetJoke extends ChuckNorrisQuotes {

    public String joke(){

        return getRandomQuote();
    }
}
