# Kenzan code project
Code project request for Kenzan.


## Installation

It is needed to install the maven dependencies.

## Usage


###User endpoint

``` You will be able to login with any username and password ```

| endpoint                      | data                         | header                       |
|-------------------------------|------------------------------|------------------------------|
| POST`/login`               | { username: “username”, password: “password”}      | |

``` The data must be passed as x-www-form-urlencoded as 'username' and 'password'```

### Employees endpoints
``` employee object { "first_name": "first_name","middle_initial": "middle_initial","last_name": "last_name","date_birth": "date_birth","date_employment": "date_employment" } ```

| endpoint                      | data                         | header                       |
|-------------------------------|------------------------------|------------------------------|
| GET`/api/v1/employees`               | { [ employees array ] }      | Authorization: 'Bearer + token'          |
| GET`/api/v1/employees/id`               | { employee object }      | Authorization: 'Bearer + token'          |
| POST`/api/v1/employees`               | { new employee object}      | Authorization: 'Bearer + token'          |
| PUT`/api/v1/employees`               | { edited employee object}      | Authorization: 'Bearer + token'          |
| DELETE`/api/v1/employees/id`               | { boolean }      | Authorization: 'Bearer + token'          |

``` The data must be passed as a JSON object```


