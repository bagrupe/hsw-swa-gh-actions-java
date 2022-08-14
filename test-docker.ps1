# Falls der Container noch läuft, wird er gestoppt und gelöscht
& docker stop java-docker
& docker rm java-docker

& docker build --tag java-docker .

& docker run -d --name java-docker --publish 8080:8080 java-docker

Start-Sleep -Seconds 30

& curl http://localhost:8080/WeatherForecast
