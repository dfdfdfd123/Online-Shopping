<template>
  <div class="main-page">
   

    <!-- 상품 검색 -->
    
    <div class="header">
      <div class="website-title">shopping</div>
      <div class="search-bar">
        <input type="text" placeholder="상품을 검색하세요">
      </div>
    </div>
      

    <!-- 장바구니 -->

      <div class="cart" @click="goToPage('cart')">장바구니
    </div>

    <!-- 추천 물품들 -->
    <div class="features">
      <div class="feature-item">
        <h2 style="text-align: left">추천 전자제품</h2>
        <!-- 이미지와 가격 출력 -->
        <img src="/image/Electronic/DSC-W830.jpg" alt="상품 이미지" @click="goToProductDetail('DSC-W830')">
        <div class="name">디지털카메라 DSC-W830</div>
        <div class="text">210,000원</div>
      </div>
      <div class="feature-item">
        <br>
        <img src="/image/Electronic/refrigerator.jpg" alt ="상품 이미지">
        <div class="name">양문형 정수기 냉장고</div>
        <div class="text">1,400,000원</div>
      </div>
      <div class="feature-item">
        <br>
        <img src="/image/Electronic/Washing.jpg" alt ="상품 이미지">
        <div class="name">삼성전자 드럼세탁기</div>
        <div class="text">740,000원</div>
      </div>
    </div>

    <div class="features">
    <div class="feature-item">
      <h2 style="text-align: left">추천 의류</h2>
      <img src="/image/Clothes/BasisShirt.jpg" alt ="상품 이미지">
       <div class="name">[빅사이즈] 포켓 구김없는 기본셔츠 - 16color</div>
      <div class="text">25,800원</div>
      </div>
      <div class="feature-item">
      <br>
      <img src="/image/Clothes/ManShortShirt1.jpg" alt ="상품 이미지">
       <div class="name">남자 반팔 셔츠</div>
      <div class="text">23,200원</div>
    </div>
      <div class="feature-item">
      <br>
      <img src="/image/Clothes/WomanSkirt.jpg" alt ="상품 이미지">
       <div class="name">세인 테니스 스커트 A라인 치마 플리츠 속바지</div>
      <div class="text">7,000원</div>
    </div>
    </div>

    <div class="features">
    <div class="feature-item">
      <h2 style="text-align: left">추천 음식</h2>
      <img src="/image/Food/PorkCutlet1.jpg" alt ="상품 이미지">
       <div class="name">슈퍼 치즈 돈까스</div>
      <div class="text">11,000원</div>
      </div>
      <div class="feature-item">
        <img src="/image/Food/ChickenGangjeong.jpg" alt ="상품 이미지">
       <div class="name">리얼크런치 순살 닭강정</div>
      <div class="text">10,400원</div>
      </div>
      <div class="feature-item">
      <img src="/image/Food/HamburgSteak.jpg" alt ="상품 이미지">
       <div class="name">고급진 한우 함박 스테이크</div>
      <div class="text">18,000원</div>
      </div>
    </div>

    <div class="features">
    <div class="feature-item">
      <h2 style="text-align: left">추천 주방용품</h2>
      <img src="/image/Kitchen/MomentDish.jpg" alt ="상품 이미지">
       <div class="name">모먼트 식기 건조대</div>
      <div class="text">30,000원</div>
      </div>
    <div class="feature-item">
      <img src="/image/Kitchen/MomentDish.jpg" alt ="상품 이미지">
       <div class="name">모먼트 식기 건조대</div>
      <div class="text">30,000원</div>
      </div>
    <div class="feature-item">
      <img src="/image/Kitchen/CookingUtensil.jpg" alt ="상품 이미지">
       <div class="name">위생적인 스텐몸통과 분리형 조리도구 보관통</div>
      <div class="text">30,000원</div>
      </div>
    </div>

    <div class="features">
    <div class="feature-item">
      <h2 style="text-align: left">추천 도서</h2>
      <img src="/image/Book/AmongUs.jpg" alt ="상품 이미지">
       <div class="name">어몽어스: 우주의 배신자</div>
      <div class="text">12,420원</div>
      </div>
      <div class="feature-item">
      <img src="/image/Book/DaleCarnegie.jpg" alt ="상품 이미지">
       <div class="name">데일 카네기 자기관리론</div>
      <div class="text">10,350원</div>
      </div>
      <div class="feature-item">
      <img src="/image/Book/Metaverse.jpg" alt ="상품 이미지">
       <div class="name">돈이 되는 메타버스</div>
      <div class="text">13,720원</div>
      </div>
    </div>
  </div>

</template>

<script>
export default {
  methods: {
    goToPage(page) {
    if (page === 'cart') {
    // 장바구니 페이지로 이동
    this.$router.push({ name: 'CartShop' });
      }
      else {
        //
      }
    },
    goToProductDetail(productId) {
      // 상세 정보 페이지로 이동
      this.$router.push({ name: 'ProductDetail', params: { id: productId } });
    },
  },
  mounted()
  {
    const loginButton = document.querySelector('#navbar-login-button');
    if (loginButton) {
      loginButton.style.display = 'block';

    }
  }
  
};
</script>

<style scoped>

img {
  width: 200px; 
  height: 150px; 
  cursor: pointer;
}

.main-page {
  font-family: Arial, sans-serif;
  margin: 0 auto;
  max-width: 1200px;
  padding: 20px;
}

.login-signup {
  font-size: 14px;
  color: #888;
  cursor: pointer;
}

.header {
  display: flex;
  align-items: center;
  margin-top: 100px;
}

.website-title {
  font-size: 24px;
  font-weight: bold;
  margin-right: 20px;
}

.search-bar input {
  width: 300px;
  padding: 8px;
  border: 1px solid #ccc;
  border-radius: 4px;
  outline: none;
}

.cart {
  margin-left: auto;
  font-size: 14px;
  text-align: right;
  cursor: pointer;
  color: #888;
}

.features {
  display: flex;
  margin-top: 40px;
}

.feature-item {
  flex-basis: 33.33%;
  text-align: center;
}

</style>






