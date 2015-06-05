#!/usr/bin/env bash
spark-submit --class TwitterEconomy target/TwitterMovie-1.0-jar-with-dependencies.jar <consumerKey> <consumerSecret> <accessToken> <accessTokenSecret>
