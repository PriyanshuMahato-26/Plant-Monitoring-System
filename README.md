# Smart-Odisha-Hackathon-Plant-Monitoring-System
Soil-Moisture-Monitoring-System
Designed and developed an Iot Based Soil monitoring system using ESP32 Node MCU and Soil Moisture sensor powered by Solar as well as DC battery(both can be used).
For this project, the Node MCU ESP32 micro-controller unit is used, which takes sensor data from  Capacitive Soil Moisture sensors. 
The data is resolved and then uploaded to Arduino cloud IoT platform.
The Data from sensors range from digital to analog signals, the required preprocessing is done on board the NODE-MCU and resolved into the required format. MQTT based Keys are generated from the FEEDs on the Arduino page and are appropriately instantiated to allow for publishing of data to the feeds over MQTT as well as we are also tracking the same through our android app, also the app gives the user insights about  lots  of things about soil moistures.
Finally, the data stream is visualized to give important insights in the farms parameters so that farmers can take informed decisions in their practices.
