import './App.css';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'

function App() {
  return (
    <div className="App">
      <div className="mlp-container">
        <h1>¡Hola <span className="mlp-url">URL</span>!</h1>
        <FontAwesomeIcon className="mlp-icon" icon="hands-helping" />
        <p>Soy un simple demo hecho en React para mostrar mis posibilidades</p>
      </div>
    </div>
  );
}

export default App;
