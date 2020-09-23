<template>
  <button v-on:click="callRestService">Appel API</button>
  <p v-if="response.length > 0">
    Réussite ! :D <br />
    {{ response }}
  </p>
  <pre>
 {{ error }}
  </pre>
</template>

<script>
import axios from "@/axiosConfig";

export default {
  name: "AppelAPI",
  data() {
    return {
      response: [],
      errors: [],
      error: ""
    };
  },

  methods: {
    callRestService() {
      axios
        .get("noms")
        .then(response => {
          console.log("Requête envoyée !");
          this.response = response.data;
        })
        .catch(e => {
          console.log("Problème requête !");
          this.error = JSON.stringify(e, null, "\t");
        });
    }
  }
};
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
