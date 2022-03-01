# Building Full-Stack Web Apps

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
