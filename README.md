# TweetsEmotionOfEurope
This project can help investigate the mood of people posting tweets on twitter. Project is mainly based on three components:

1. Spark Streaming

2. Twitter4j

3. Stanford NLP

4. JQVMap

Spark Streaming is an interesting extension to Spark that adds support for continuous stream processing to Spark. Spark Streaming inherit the data processing ability of Spark, and also support stream processing.

Twitter4j is a Java library for twitter API, through this API we can develop our java application to fetch the data of Twitter. The streaming data consists of filtered tweets delivering in real time.

Stanford NLP is a natural language processing toolkit developed by Natural Language Processing Group at Stanford University. We can estimate the mood of each tweet via this toolkit.

JQVMap is a JQuery plugin that renders Vector Maps. In this project, we leverage this jquery plugin to display the real-time result via browser.

## Requirement
Apache Maven 3.3.3

Spark 1.3.1

## How to use
To compile the project, you should make sure Apache Maven has been installed in your system.

### Preparation
To make front-end program work, you should copy the directory

```
web
```

to

```
/var/www/html
```

the directory 

```
colorData
```

store the JSON file "colors.json" as the input of JQVMap.

### Compile
Run the script compile.sh to compile the project.

```
bash compile.sh
```

### Run
Before you run the application, we should edit the "run.sh" script. Input your own "<consumerKey> <consumerSecret> <accessToken> <accessTokenSecret>" of Twitter Application to the script.
And you also need to add the absolute path of file "colors.json" to the script.

```
spark-submit --class TwitterEconomy target/TwitterMovie-1.0-jar-with-dependencies.jar <consumerKey> <consumerSecret> <accessToken> <accessTokenSecret> <JSON outputpath>
```

Run the script run.sh.

```
bash run.sh
```

This submits the application to spark master.
