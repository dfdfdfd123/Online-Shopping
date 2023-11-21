<template>
  <v-app>
    <NavbarApp></NavbarApp>
    <v-content>
        <router-view></router-view>
    </v-content>
  </v-app>
</template>

<script>

import NavbarApp from '@/components/NavbarApp';

export default {
  name: 'App',
  components : {
    NavbarApp
  },
  data: () => ({
    //
  }),
};
</script>

