import './index.css';
import App from './App';
import React from 'react';
import ReactDOM from 'react-dom';
import { library } from '@fortawesome/fontawesome-svg-core'
import { faHandsHelping } from '@fortawesome/free-solid-svg-icons'

library.add(faHandsHelping)

ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);
