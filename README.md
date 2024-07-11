FetchingComponent
This project is a Scala.js React component that fetches data from a Play Framework backend and displays it. The component is styled with dynamic CSS properties and includes navigation buttons, an image, and a call-to-action section.

Features
Fetch data from a backend API
Display fetched data
Responsive design with styled components
Navigation buttons
Code Explanation
Imports
The necessary libraries and components are imported at the beginning of the file to enable the usage of React, Scala.js, and the Fetch API.

Component Definition
The FetchingComponent is defined as a React component using the @react annotation. It includes Props and State types, with the initial state set to an empty string.

Rendering the Component
The render method defines the structure and style of the component. The main container has a styled div with a light blue background, padding, rounded corners, and centered text. Inside this container, there are navigation buttons styled with green backgrounds and white text, followed by the main content which includes a fetch button, headings, an image, and additional buttons for signup, email, and info.

Fetching Data
Data is fetched from the backend when the "Fetch Data" button is clicked. The Fetch API is used to make a request to the backend API. If the response is successful, the fetched data is set to the component's state and displayed. If the request fails, an error message is logged to the console.

Running the Project
To run the project:

Ensure you have Scala, sbt, and Scala.js installed.
Clone the repository.
Navigate to the project directory.
Start the Play Framework backend server.
Run the Scala.js project using sbt fastOptJS.
Contributing
Feel free to open issues or submit pull requests if you find any bugs or want to add new features.

License
This project is licensed under the MIT License.

