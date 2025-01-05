# EmployeeCrudOperations
Crud Operation of Employees Using RestAPI and MongoDB

# Post method: Save record
POST: http://localhost:8080/employee/save
      To save employee record within the database

# Get Method: Display All records & records by Id
GET: http://localhost:8080/employee/findall 
      To get all records of saved employees
      
GET: http://localhost:8080/employee/findbyid/{empId}
      To get record of single employee using single id
      
# PUT Method: Update record by Id
PUT: http://localhost:8080/employee/update/{empId}
      To update record of employee using id
    
# Delete Method: Delete Record by Id
DELETE: http://localhost:8080/employee/delete/{empId}
      To delete employee record by id

# For database: MongoDb Atlas
Application properties:
spring.data.mongodb.uri=mongodb+srv://<database username>:<database password>@cluster0.mongodb.net/<databasename>?retryWrites=true&w=majority
spring.data.mongodb.database=mydatabase

