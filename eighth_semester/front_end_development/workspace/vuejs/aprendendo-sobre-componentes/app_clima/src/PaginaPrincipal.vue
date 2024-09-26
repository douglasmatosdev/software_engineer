<template>
  <Cabecalho>
    <template v-slot:subtitulo>
      <h2>Subtitulo aqui</h2>
    </template>
    <template v-slot:extra>
      <h3>Texto extra</h3>
    </template>
  </Cabecalho>
  <ListCidades />
</template>

<script>
import './assets/estilo.css'
import Cabecalho from './components/Cabecalho.vue';
import ListCidades from './components/ListCidades.vue';

export default {
  components: { Cabecalho, ListCidades },
}
</script>

<style scoped></style>