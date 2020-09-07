# **Airline API Project**

 

**Airline**

|Request Url   |HTTP             |BODY|RESPONSE                         |
|----------------|----------------|----------------------|-----------------------------|-----------------------------|
|/v1/addAirline|`	POST`    |"name" : "Türk Hava Yolları"            |OK |
|/v1/findByAirline/{name}          |`GET`            | -            |{"id":1, "name" : "Türk Hava Yolları"} |
|/v1/allAirlines|`GET`|-|[{"id":1, "name" : "Türk Hava Yolları"},{"id":2, "name" : "Pegasus"} ] | ] |

**Airport**

|Request Url   |HTTP             |BODY|RESPONSE                         |
|----------------|----------------|----------------------|-----------------------------|-----------------------------|
|/v1/addAirport|`	POST`    |{"name" : "Esenboğa Havalimanı", "city":"Ankara" }           |OK |
|/v1/findByAirport/{name}          |`GET`            | -            |{"id":4, "name" : "Esenboğa Havalimanı", "city":"Ankara"} |
|/v1/allAirport|`GET`|-|[{"id":4, "name" : "Esenboğa Havalimanı", "city":"Ankara"},{"id":5, "name" : "İstanbul Havalimanı", "city":"İstanbul "}, {"id":6, "name" : "Adnan Menderes Havalimanı", "city":"İzmir"} ] | ] |


**Route**

|Request Url   |HTTP             |BODY|RESPONSE                         |
|----------------|----------------|----------------------|-----------------------------|-----------------------------|
|/v1/addRoute|`	POST`    |{"sourceAirportName" : "Esenboğa Havalimanı", "destinationAirportName":"İstanbul Havalimanı" }           |OK |
|/v1/findBySourceAirportName/{name}          |`GET`            | -            |[{"id":8, "sourceAirportName" : "Esenboğa Havalimanı", "destinationAirportName":"İstanbul Havalimanı"},          {"id":9, "sourceAirportName" : "Esenboğa Havalimanı", "destinationAirportName":"Sabiha Gökçen Havalimanı"}] |
|/v1/allRoutes|`GET`|-|[{"id":8, "sourceAirportName" : "Esenboğa Havalimanı", "destinationAirportName":"İstanbul Havalimanı"},{"id":9, "sourceAirportName" : "Esenboğa Havalimanı", "destinationAirportName":"Sabiha Gökçen Havalimanı"} ...] | ] |



**Flight**

|Request Url   |HTTP             |BODY|RESPONSE                         |
|----------------|----------------|----------------------|-----------------------------|-----------------------------|
|/v1/addFlight|`	POST`    |{"flightName" : "Ankara-İstanbul 101 ", "price":100, "quota":100, "airline":{ "id":3 }, "route":{"id":11} }           |OK |
|/v1/findFlightByAirlineId/{id}          |`GET`            | -            |{"id":12, "flightName" : "Ankara-İstanbul 101", "price":100, "quota":100, "airline":{"id":1, "name": "Türk Hava Yolları"},"route":{"id":8,"sourceAirportName" : "Esenboğa Havalimanı", "destinationAirportName":"İstanbul Havalimanı"}}  |
|/v1/allFlights|`GET`|-|{"id":12, "flightName" : "Ankara-İstanbul 101", "price":100, "quota":100, "airline":{"id":1, "name": "Türk Hava Yolları"},"route":{"id":8,"sourceAirportName" : "Esenboğa Havalimanı", "destinationAirportName":"İstanbul Havalimanı"}} ... | ] |


**Ticket**

|Request Url   |HTTP             |BODY|RESPONSE                         |
|----------------|----------------|----------------------|-----------------------------|-----------------------------|
|/v1/addTicket|`	POST`    |{"passangerName" : "Ali", passangerSurname" : "Veli", "creditCart":"1234234122223333", "fligtss":{ "id":14 } }           |OK |
|/v1/findTicketById/{id}         |`GET`            | -            |{"passangerName" : "Ali", passangerSurname" : "Veli",  "creditCart":"123423*********3333", "flightss":{"id":14, "flightName" : "Ankara-İstanbul 101", "price":175, "quota":100,} "airline":{"id":1, "name": "Türk Hava Yolları"},"route":{"id":8,"sourceAirportName" : "Esenboğa Havalimanı", "destinationAirportName":"İstanbul Havalimanı"}}  |
|/v1/cancelTicket/{id}|`DELETE`|-|OK |

![img1](Images/1.bmp)
![img1](Images/2.bmp)
![img1](Images/3.bmp)
![img1](Images/4.bmp)
![img1](Images/5.bmp)
![img1](Images/6.bmp)
![img1](Images/7.bmp)
![img1](Images/8.bmp)
![img1](Images/9.bmp)
![img1](Images/10.bmp)
![img1](Images/11.bmp)
![img1](Images/12.bmp)
![img1](Images/13.bmp)






