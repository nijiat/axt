<template>
  <p>这是用户：{{msg}}的首页</p>
</template>

<script>
export default {
  name: "firstpage",
  data() {
    return {};
  },
  computed: {
    msg: function() {
      return this.$store.getters.name;
    }
  }
};
</script>

<style scoped>
</style>