<template>
  <div class="container">
    <input v-model="loginForm.username" placeholder="username">
    <input type="assword" v-model="loginForm.password" placeholder="password">
    <button type="button" @click="loginmethod">login</button>
  </div>
</template>

<script>
export default {
  name: "login",
  data() {
    return {
      loginForm: {
        username: "",
        password: ""
      }
    };
  },
  methods: {
    loginmethod() {
      this.$store.dispatch("Login", this.loginForm).then(() => {
        this.$router.push({ path: this.redirect || "/" }); //登录成功之后重定向到首页
      });
    }
  }
};
</script>

<style scoped>
</style>