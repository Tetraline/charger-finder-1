# Charger Finder Backend

## Problem Statement 


Build an application to act as a proxy between a [browser based web application](https://github.com/Tetraline/charger-finder-front-end) and a public API. The proxy is necessary because:
1. The public API does not send the required CORS headers to be directly useful ([I have written more about this here](https://d-s.bearblog.dev/blocked-by-cors-policy/)).
2. The public API sends lots of unnecessary information, using a proxy allows us to only send to the front end application only what is necessary.

## Technologies Used
- Java
- Spring Boot 
- Google Cloud 
- JUnit testing framework 

## Deployment
This application is deployed on Google Cloud Run. This allows the application to be always available, but to automatically scale down to zero when not being used.

The complementary frontend application, including live demo, is [here](https://github.com/Tetraline/charger-finder-front-end).

