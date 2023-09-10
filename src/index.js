import React from "react";
import ReactDOM from "react-dom";
import "./index.css";
import App from "./App";
import reportWebVitals from "./reportWebVitals";
import "bootstrap/dist/css/bootstrap.min.css";
import "react-toastify/dist/ReactToastify.css";
import Renderer from './Renderer';


ReactDOM.render(
  <React.StrictMode>
    {/* <App/> */}
    <Renderer />
    
  </React.StrictMode>,
  document.getElementById("root")

  );


reportWebVitals();
