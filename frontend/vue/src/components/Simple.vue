<template>
  <div class="mlp-container">
    <h1>¡Hola <span class="mlp-url">URL</span>!</h1>
    <font-awesome-icon class="mlp-icon" icon="hands-helping" />
    <p> Soy un simple demo hecho en Vue para mostrar mis posibilidades </p>
  </div>
</template>

<script>
export default {
  name: 'Simple',
}
</script>

<style scoped>
.mlp-container {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  height: 100%;
}

.mlp-url {
  color: #f2e205;
}

.mlp-icon {
  color: #f2e205;
  font-size: 80px;
  margin: 4px 0px 40px 0px;
}

h1 {
  font-size: 56px;
  margin-bottom: 8px;
}

p {
  font-size: 20px;
  margin: 0px;
}

</style>
