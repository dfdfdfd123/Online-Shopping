import { createApp } from 'vue';
import App from './App.vue';
import router from './router';
import store from './store';
import vuetify from './plugins/vuetify';
import axios from 'axios';
import { loadFonts } from './plugins/webfontloader';

loadFonts();

const app = createApp(App);

app.config.globalProperties.$axios = axios.create({
  baseURL: 'http://localhost:8080', 
  // 다른 Axios 설정들...
});

app
  .use(router)
  .use(store)
  .use(vuetify)
  .mount('#app');

