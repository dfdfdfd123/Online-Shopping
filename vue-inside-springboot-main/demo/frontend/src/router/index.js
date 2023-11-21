import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import NotFound from '../views/NotFound.vue'
import LoginForm from '../views/LoginForm.vue'
import SignUp from '../views/SignUp.vue'
import CartShop from '../views/CartShop.vue'
import CusService from '../views/CusService.vue';
import BookDetail from '../category/BookDetail.vue';
import ClothesDetail from '../category/ClothesDetail.vue';
import ElectronicDetail from '../category/ElectronicDetail.vue';
import FoodDetail from '../category/FoodDetail.vue';
import KitchenDetail from '../category/KitchenDetail.vue';


const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: "/404",
    name: "NotFound",
    component: NotFound,
  },
  {
    path: "/:pathMatch(.*)*",
    redirect: "/404",
  },
  {
    path: "/login",
    name : "Login",
    component: LoginForm,
  },
  {
    path: "/signup",
    name : "SignUp",
    component: SignUp,
  },
  {
    path: "/cartshop",
    name : "CartShop",
    component: CartShop,
  },
  {
    path: "/cusservice",
    name : "CusService",
    component: CusService,
  },
  {
    path: "/bookdetail",
    name : "BookDetail",
    component: BookDetail,
  },
  {
    path: "/clothesdetail",
    name : "ClothesDetail",
    component: ClothesDetail,
  },
  {
    path: "/electronicdetail",
    name : "ElectronicDetail",
    component: ElectronicDetail,
  },
  {
    path: "/fooddetail",
    name : "FoodDetail",
    component: FoodDetail,
  },
  {
    path: "/kitchendetail",
    name : "KitchenDetail",
    component: KitchenDetail,
  },

]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router