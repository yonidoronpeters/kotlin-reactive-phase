# Sample Reactive Kotlin App
Once a client subscribes, this app will emit a joke every second for eternity. 
You can configure the source API to pull jokes from by modifying the property `funny.external.api.url` in application.properties file.
This app is deployed to https://funny-phrase-zany-serval-cl.cfapps.io. For endless entertainment, type 
```
$ curl https://funny-phrase-zany-serval-cl.cfapps.io
```                                                                                                   
in your terminal.