<template>
  <button @click="getTestData">bbb</button>
</template>
<script>
import { getData } from "@/api/testBackend";
export default {
  name: "testbackend",
  data() {
    return {};
  },
  methods: {
    getTestData() {
      getData();
    }
  }
};
</script>

<style scoped>
</style>