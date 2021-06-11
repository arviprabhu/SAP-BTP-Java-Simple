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




## Learn More

Learn more at https://cap.cloud.sap/docs/get-started/.
