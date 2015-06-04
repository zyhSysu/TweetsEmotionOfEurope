# TweetsEmotionOfEurope
This project can help investigate the mood of people posting tweets on twitter. Project is mainly based on three components:
1. Spark Streaming
2. Twitter4j
3. Stanford NLP

Spark Streaming is an interesting extension to Spark that adds support for continuous stream processing to Spark. Spark Streaming inherit the data processing ability of Spark, and also support stream processing.

Twitter4j is the javaAPI for twitter, through this API we can develop our java application to fetch the data of Twitter. The streaming data consists of filtered tweets delivering in real time.

Stanford NLP is a natural language processing toolkit developed by Natural Language Processing Group at Stanford University. We can estimate the mood of each tweets via this toolkit.

##Requirement
Apache Maven 3.3.3
Spark 1.3.1

##How to use
To compile the project, you should make sure Apache Maven has been installed in your system.
Run the script compile.sh: bash compile.sh to compile the project.

After turning on the Spark progress, you can run the script run.sh: bash run.sh to submit the job to spark.
