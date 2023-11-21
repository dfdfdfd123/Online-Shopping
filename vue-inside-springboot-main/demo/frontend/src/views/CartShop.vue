<template>
  <div class="cart-shop">
    <h1>장바구니</h1>
    <div v-if="cartItems.length === 0">
      장바구니에 상품이 없습니다.
    </div>
    <div v-else>
      <div v-for="(item, index) in cartItems" :key="index" class="cart-item">
        <div>{{ item.name }}</div>
        <div>가격: {{ item.price }}</div>
        <div>수량:
          <button @click="decreaseQuantity(item)">-</button>
          {{ item.quantity }}
          <button @click="increaseQuantity(item)">+</button>
        </div>
        <button @click="removeFromCart(item)">삭제</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      cartItems: [
        { id: 1, name: '상품 1', price: 10000, quantity: 1 },
        { id: 2, name: '상품 2', price: 20000, quantity: 2 },
      ],
    };
  },
  methods: {
    increaseQuantity(item) {
      item.quantity++;
    },
    decreaseQuantity(item) {
      if (item.quantity > 1) {
        item.quantity--;
      }
    },
    removeFromCart(item) {
      const index = this.cartItems.findIndex((cartItem) => cartItem.id === item.id);
      if (index !== -1) {
        this.cartItems.splice(index, 1);
      }
    },
  },
};
</script>

<style>
.cart-shop {
  font-family: Arial, sans-serif;
  max-width: 800px;
  margin: 0 auto;
  padding: 20px;
}

h1 {
  font-size: 24px;
  font-weight: bold;
}

.cart-item {
  display: flex;
  align-items: center;
  margin-bottom: 10px;
}

button {
  padding: 4px 8px;
  border: none;
  background-color: #eee;
  cursor: pointer;
}
</style>
