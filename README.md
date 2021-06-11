# Getting Started

It contains these folders and files, following our recommended project layout:

File or Folder | Purpose
---------|----------
`db/` | your domain models and data go here
`srv/` | your service models and code go here
`package.json` | project metadata and configuration
`readme.md` | this getting started guide


## Next Steps

- Open a new terminal and run `cds watch` 
- (in VS Code simply choose _**Terminal** > Run Task > cds watch_)
- Start adding content, for example, a [db/schema.cds](db/schema.cds).

##Useful commands

Command   | Purpose
---------|----------
`npm install --save-dev sqlite3` | To add the sqlite3 dependency
`cds deploy --to sqlite` | To deploy the csv data , tables and views(cds services) to sqlite
`mvn spring-boot:run` | To run the application
`killall mvn` | To kill all services running (helpful when you get port in use error)
`cds watch` | To keep watch of changes and restart 
`cds --help` | help 

##Issues
- cds deploy --to sqlite : sometime may cause error
- Solution
  - npm install
  - unset NODE_PATH
  - then try cds deploy --to sqlite


### Using HanaDB

`npm install --save-dev @sap/hdi-deploy`  | Add the required node dependency

`{ "hana" : { "deploy-format": "hdbtable" } }` |  `.cdsrc.json` in the root folder As an effect, `.hdbtable and .hdbview` files are generated in the (gen/)db/src/gen/ folder.
`cds deploy --to hana:bookstore-hana`  | Create an SAP HANA service instance and implicitly push all artifacts to the database 

-Edit the pom.xml in the srv directory (not the pom.xml file located in the root project folder) and add the following dependency under the `<dependencies>`
 -This dependency will bring the ability to read SAP HANA service bindings from the default-env.json to automatically configure the SAP HANA connectivity. In addition, it includes the SAP HANA JDBC driver.
  
      <dependency>
        <groupId>com.sap.cds</groupId>
        <artifactId>cds-feature-hana</artifactId>
      </dependency>  

  
`mvn spring-boot:run -Dspring-boot.run.profiles=cloud` | Run in Cloud profile

-The dependency will bring the ability to read service bindings from Cloud Foundry’s VCAP_SERVICES environment variable.
 
    <dependency>
        <groupId>com.sap.cds</groupId>
        <artifactId>cds-feature-cloudfoundry</artifactId>
    </dependency>

-add manifest.yml
 -'mvn clean install'
 -'cf push'
  


## Learn More

Learn more at https://cap.cloud.sap/docs/get-started/.
