ERPE
=====================

[![Build Status](https://travis-ci.org/masterdany88/erp2.svg?branch=master)](https://travis-ci.org/masterdany88/erp2) 

Prerequisites
-------------
Payara 5 Server in dir: /home/daniel/Pobrane/payara5

Build and deploy
-------------

 * /home/daniel/Pobrane/payara5/bin/asadmin start-domain
 * /home/daniel/Pobrane/payara5/bin/asadmin undeploy erp2
 * /home/daniel/Pobrane/payara5/bin/asadmin deploy /home/daniel/git/erp2/ear/target/erp2.ear 

 * cp /home/daniel/git/erp2/ear/target/erp2.ear /home/daniel/Pobrane/payara5/glassfish/domains/domain1/autodeploy/

MAVEN BUILD PROFILES
 * dev (active by default)
 * devfront
 * prod

Go to project directory:
 - cd /home/daniel/git/erp2/
 
GWT DEV BUILD
    Run gwt code server
 * mvn -pl webClient -amd clean gwt:codeserver -P devfront
    Move gwt src for dev to deploy on server
 * mvn -pl access/accessPort/ -amd validate -P devfront
    Build EAR package for dev deployment
 * mvn clean install -P dev

BACKEND DEV BUILD
 * mvn clean install -P dev

PROD BUILD
 * mvn clean install -P prod

 
Package Naming convention
--------------------------

 <groupId>pl.korbeldaniel.erp2</groupId>
 <artifactId>micSuppUi</artifactId>
 <moduleShortName>${project.artifactId}</moduleShortName>
 <moduleName>pl.korbeldaniel.erp2.ms.${project.artifactId}</moduleName>

 pl.korbeldaniel.erp2.ms.ui.MicSuppUiEntryPoint
 pl.korbeldaniel.erp2.ms.access;
 pl.korbeldaniel.erp2.ms.data;
 pl.korbeldaniel.erp2.ms.logic;
 
 <groupId>pl.korbeldaniel.erp2</groupId>
 <artifactId>cmsUi</artifactId>

 pl.korbeldaniel.erp2.cms.ui.CmsUiEntryPoint
 pl.korbeldaniel.erp2.cms.access;
 pl.korbeldaniel.erp2.cms.data;
 pl.korbeldaniel.erp2.cms.logic;


