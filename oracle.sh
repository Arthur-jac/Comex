docker run -d --name oraclebd -p 1521:1521 -e ORACLE_PASSWORD=admin gvenzl/oracle-xe
docker container logs -f oraclebd