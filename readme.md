https://skillbox.ru/media/code/redis_dlya_keshirovaniya_uskoryaem_vzaimodeystvie_s_osnovnoy_bazoy/ Redis для кэширования. Ускоряем взаимодействие с основной базой

mvnw clean package -Dmaven.test.skip=true
docker-compose up -d


curl --location --request POST "localhost:8080/api/v1/books" --header "Content-Type: application/json"   --data-raw "{\"name\": \"book1\",  \"description\": \"blabla\", \"price\": 100500}"
curl --location --request POST "localhost:8080/api/v1/books" --header "Content-Type: application/json"   --data-raw "{\"name\": \"book2\",  \"description\": \"blabla2\", \"price\": 100501}"
curl --location --request POST "localhost:8080/api/v1/books" --header "Content-Type: application/json"   --data-raw "{\"name\": \"book3\",  \"description\": \"blabla2\", \"price\": 100503}"



curl --location --request GET localhost:8080/api/v1/books


###
redis-cli
KEYS *
FLUSHALL

docker logs -f 6f767bc19768 