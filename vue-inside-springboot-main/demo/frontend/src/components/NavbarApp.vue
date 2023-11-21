
<template>
  <nav>
    <v-app-bar app color="primary" dark>
      <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
      <v-toolbar-title @click="goToHome" class="clickable-title">Shopping</v-toolbar-title>
      <v-spacer></v-spacer>
      <v-btn text @click="goToSignup">회원가입</v-btn>
      <v-btn id="navbar-login-button" text @click="goToLoginPage">로그인</v-btn>
      <v-btn text @click="goToCustomer">고객센터</v-btn>
    </v-app-bar>

    <v-navigation-drawer v-model="drawer" absolute bottom temporary>
      <v-layout column align-center>
        <v-flex class="mt-4">
            <v-avatar size="100">
              <img src="/image/admin.jpg">
            </v-avatar>
            <p class="mt-5" @click="goToLoginPage">로그인 하세요</p>
        </v-flex>
      </v-layout>
      <v-list nav dense>
        <v-list-item-group v-model="group">
            <v-list-item v-for="(item,i) in items" :key="i" :to="item.router">
              <v-list-item-icon>
              <v-icon>{{ item.icon }}</v-icon>
              </v-list-item-icon>
              <v-list-item-content>
              <v-list-item-title>{{ item.text }}</v-list-item-title>
              </v-list-item-content>
            </v-list-item>

        </v-list-item-group>
      </v-list>
    </v-navigation-drawer>
  </nav>
</template>

<script>


export default {
  data: () => ({
    drawer : false,
    group : null,
    items : [
      {icon:'mdi-tshirt-crew', text:'의류', router:'/clothesdetail'},
      {icon:'mdi-food', text:'음식', router: '/fooddetail'},
      {icon:'mdi-cellphone', text:'전자제품', router : '/electronicdetail'},
      {icon:'mdi-book-open-page-variant', text:'도서', router : '/bookdetail'},
      {icon:'mdi-pot', text:'주방용품', router : '/kitchendetail'},
    ]
  }),
  methods: {

    goToSignup() {
        this.$router.push('/signup');
    },

    goToLoginPage() {
      this.$router.push('/login');
    },
     goToCustomer() {
      this.$router.push('/cusservice');
    },
    goToHome()
    {
      this.$router.push('/');
    }

  }
  
}
</script>


<style scoped>
.clickable-title {
  cursor: pointer;
}
</style>
