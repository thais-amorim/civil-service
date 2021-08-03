# civil-service

### References
https://www25.senado.leg.br/web/senadores/por-uf/-/uf/CE

### Examples
```
curl -sX GET http://localhost:8080/contact?state=CE | jq .

curl -sX GET http://localhost:8080/contact?party=PSDB | jq .

curl -sX GET http://localhost:8080/contact/2 | jq .
```

### License
This project is licensed under the GPL 2.0 License - see the [LICENSE.md](LICENSE.md) file for details