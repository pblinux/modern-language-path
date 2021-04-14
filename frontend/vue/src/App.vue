<template>
  <div id="app">
    <simple />
  </div>
</template>

<script>
import Simple from './components/Simple.vue'

export default {
  name: 'App',
  components: {
    Simple
  }
}
</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=Lato&display=swap');
#app {
  font-family: 'Lato', sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  height: 100vh;
}

</style>
