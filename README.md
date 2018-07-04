/home/daniel/Pobrane/payara5/bin/asadmin start-domain
/home/daniel/Pobrane/payara5/bin/asadmin deploy /home/daniel/git/erp2/ear/target/erp2.ear 
/home/daniel/Pobrane/payara5/bin/asadmin undeploy erp2

cd /home/daniel/git/erp2/
mvn -pl webClient -amd gwt:codeserver

cd /home/daniel/git/erp2/webClient/
mvn clean gwt:codeserver


cp /home/daniel/git/erp2/ear/target/erp2.ear /home/daniel/Pobrane/payara5/glassfish/domains/domain1/autodeploy/



PROD BUILD
cd /home/daniel/git/erp2/
mvn clean install -P prod

BACKEND DEV BUILD
cd /home/daniel/git/erp2/
mvn clean install -P dev

FRONTEND DEV BUILD
cd /home/daniel/git/erp2/
mvn -pl webClient -amd clean gwt:codeserver -P devfront
mvn -pl webClient -amd validate -P devfront
mvn clean install -P dev

