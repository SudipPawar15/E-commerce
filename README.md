# E-commerce

# Spring Boot Project Setup Guide

## Step 1: Set Up MySQL Database

### Install MySQL:
1. Download and install MySQL from the [official website](https://dev.mysql.com/downloads/installer/).

### Create a Database:
1. Open MySQL command line or a GUI tool like [MySQL Workbench](https://dev.mysql.com/downloads/workbench/).
2. Create a new database for the application by running the following command:

    ```sql
    CREATE DATABASE mydatabase;
    ```

### Create a User (Optional):
1. Create a user and grant it permissions by running the following commands:

    ```sql
    CREATE USER 'myuser'@'localhost' IDENTIFIED BY 'mypassword';
    GRANT ALL PRIVILEGES ON mydatabase.* TO 'myuser'@'localhost';
    FLUSH PRIVILEGES;
    ```

Replace `'myuser'` and `'mypassword'` with your desired username and password.

---

## Step 2: Clone the Project Repository

1. Clone the GitHub repository containing the Spring Boot and Angular project by running the following command:

    ```bash
    git clone https://github.com/SudipPawar15/E-commerce.git
    ```

2. Navigate to the cloned project folder:


---

## Step 3: Set Up the Spring Boot Backend


### Update `application.properties`:
1. Open the `src/main/resources/application.properties` file and configure your database connection settings:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/mydatabase
    spring.datasource.username=myuser
    spring.datasource.password=mypassword
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

Make sure to replace `mydatabase`, `myuser`, and `mypassword` with the actual database details.



### Build and Run the Spring Boot Application:
1. Clean and install the project using Maven:

    ```bash
    mvn clean install
    ```

2. Run the Spring Boot application:

    ```bash
    mvn spring-boot:run
    ```

Make sure your MySQL server is running before starting the application. The Spring Boot backend will now be up and connected to your MySQL database.

### Execute scripts for adding products to the products table:
  1. Open the `src/main/resources/e-commerceDbscripts.sql`
  2.Execute the script with the databse you have created
   

---

## Troubleshooting

- If you face any issues with database connections, ensure:
  - MySQL server is running.
  - The database name, username, and password in the `application.properties` file are correct.
  - MySQL allows connections from localhost.

---

