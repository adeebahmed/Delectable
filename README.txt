Repository link
https://github.com/adeebahmed/Delectable

Configuration instuctions
You will need JDK 1.8. Run these commands to install JDK:
wget http://sukharevd.net/static/files/blog/oracle-jdk/oracle-jdk-install.sh -O oracle-jdk-install.sh
sudo bash oracle-jdk-install.sh

Build and deploy:
Project is a maven based project, so there is no build script required. 
You should be able to compile and run the project using maven commands on ubuntu.
Maven generates a .war file which is located: Delectable/target/Delectable-1.0-SNAPSHOT.war

Copyright and licensing
Copyright (c) 2016 Adeeb Ahmed
Licensed under MIT license. Declectable/LISCENSE.md

Known bugs
No bugs everything compiles and works. 
The routes are slightly different than the api provided. 
They are as follows:

Get all menus, and get menu by ID
GET http://localhost:8080/Delectable/delectable/menu
GET http://localhost:8080/Delectable/delectable/menu/{mid}

Get all orders, get order by id, get order by date
GET http://localhost:8080/Delectable/delectable/order
GET http://localhost:8080/Delectable/delectable/order/{oid}
GET GET http://localhost:8080/Delectable/delectable/order/getdate?date={date}

Get all customers, get customer by id, get customer by lastname email or phonenumber
http://localhost:8080/Delectable/delectable/customer
http://localhost:8080/Delectable/delectable/customer/{cid}
http://localhost:8080/Delectable/delectable/customer/find?key={key}

Gets all reports, gets report by id
GET http://localhost:8080/delectable/report
GET http://localhost:8080/delectable/report/{rid}

No routes for admin. Ran out of time to implement admin and put and post.

Credits and acknowledgements
Credits to pluralsight for having tutuorials on restful services. 
Github for http://choosealicense.com/
