build:
	lein uberjar
run: build
	java -jar target/project-*.jar
test:
	lein test
deploy:
	echo 'deploy'

build-docker-image:
	docker build -f Dockerfile.clojure -t "aleph-system" .

.PHONY: test
