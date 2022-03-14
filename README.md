# Building Full-Stack Web Apps

## Lab: 11

## Overview

- Today, you’ll set up a basic webapp that will be useful for the next 5 labs.

### Setup

- Use the `Spring Initializr` to create a new application with artifact songr with `Web and Thymeleaf` (and optionally 
`Devtools`) dependencies. 
- Download the `zip file` and `extract` the directory it contains. 
- Add the course `gitignore` file into that directory. 
- Run `git init`, `git add .`, and `git commit -m "initial commit from Spring init"`. 
- Create a new GitHub `repo`, and `push` your `initial commit` to your master branch there. 
- Then, check out a `new branch` to begin your work for the day.

### Feature Tasks

- Ensure that you can run the Spring app.
- Create a hello world route at `/hello`, and ensure that you can visit that route in your browser and see a rendered 
  template come back.
- Create a route that turns words into `UPPER CASE`. For instance, I should be able to visit `/capitalize/hello` and get 
  back an `HTML` page containing the response `HELLO`, or I could visit `/capitalize/this` is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.
- Create a `basic splash page` for the `Songr app`, available at the `root` route, and style it appropriately with CSS.
- Create an `Album class` to act as a `model` in our app.
- An `Album` has a `title, an `artist`, a `songCount`, a `length` (in seconds), and an `imageUrl` that is a link to that album’s 
  art.
- Create a route at `/albums` that shows three album instances. (These will be hardcoded for today’s - lab; create an 
  array that contains three albums, and then display those three on the page.)

### Testing

- Ensure you have tested the constructor, getters, and setters for the Album class.

### Stretch Goals

- Modify your `/hello route` to allow users to specify their name with a query parameter, like `/hello?name=Joe`, and get 
a custom hello message back.
- Modify your `/hello` route to expect a `POST` request instead of a `GET` request. Use Postman for manual testing.
- Create a `route` that takes in a `number`, and then makes a request to the `Numbers API` to get a fact about that number. 
  `Return` the `fact`.
- Create a `route` that tells the user information about their computer. For example, it might tell them what browser 
  they’re using, what OS they’re using, what their IP address is, and other such information. (Hint: This information is in the headers of the request that comes in to the server, so you may want to look at the request headers.)

## Lab: 12 - Spring and REST

### Resources

  - [Baeldung](https://www.baeldung.com/spring-requestmapping)
  
### Setup

- Continue working in the same `songr` webapp you generated for the previous lab. Ensure that you have all of these 
dependencies in your `build.gradle`. (Note that when you add the dependencies on postgres and JPA, your app will stop working until you have the configuration in `application.properties` to access your Postgres database.)

```
dependencies {
implementation('org.springframework.boot:spring-boot-starter-data-jpa')
implementation('org.springframework.boot:spring-boot-starter-thymeleaf')
implementation('org.springframework.boot:spring-boot-starter-web')
runtimeOnly('org.postgresql:postgresql')
testImplementation('org.springframework.boot:spring-boot-starter-test')
}
```

### Feature Tasks

- Update your Album model so that it can be saved in a database.

  - An `Album` has a `title`, an `artist`, a `songCount`, a `length` (in seconds), and an `imageUrl` that is a link to that album’s art.
  - A user should be able to see information about all the albums on the site.
  - A user should be able to add albums to the site.
  
### Stretch Goals
  
- A user should be able to update information about albums on the site.
- A user should be able to delete albums on the site.

### Planning

- You’ll need to plan your steps carefully to succeed in this lab. Build incrementally, and make sure to try each new 
route as you create it. Try to isolate issues as they come up: exactly what about your app is not currently working the way you expected? Work on the feature tasks in isolation, and ensure that each is functional before moving on to the next.

### Testing

- We will talk more about integration testing in future lectures. For now, visually ensure that each of your routes 
is working. You are NOT required to write any tests for this lab.

- Make sure your server fails gracefully. The server shouldn’t crash and the database shouldn’t be corrupted in any 
way if a user attempts to read or manipulate information that doesn’t exist.

## Lab: 13 - Related Resources and Integration Testing

## Setup
Continue working in the same repository as your previous two labs.

### Feature Tasks

- Create a `Song` model.
  - A Song has a title, a length (in seconds), a trackNumber, and the album on which that song appears.
  - Ensure that the relationship between Albums and Songs is appropriately set up.
  - A user should be able to see information about all the songs on the site.
- A user should be able to view a page with data about one particular album.
- A user should be able to add songs to an album. 
    - A user should be able to see the songs that belong to an album when looking at that album.