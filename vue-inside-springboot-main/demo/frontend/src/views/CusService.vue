<template>
  <div class="customer-service">
    <v-card class="elevation-2">
      <v-card-title class="title">고객센터</v-card-title>
      
      <v-card-text class="faq-section">
        <h3 class="section-title">자주 묻는 질문</h3>
        <v-list dense>
          <v-list-item v-for="faq in faqs" :key="faq.id">
            <v-list-item-title class="faq-question">{{ faq.question }}</v-list-item-title>
            <v-list-item-subtitle class="faq-answer">{{ faq.answer }}</v-list-item-subtitle>
          </v-list-item>
        </v-list>
      </v-card-text>
      
      <v-card-text class="contact-section">
        <h3 class="section-title">문의하기</h3>
        <p class="contact-description">문의하실 내용이 있으신 경우 아래의 연락처로 문의해주세요:</p>
        <v-list dense>
          <v-list-item>
            <v-list-item-content>
              <v-list-item-title class="contact-item">고객센터 전화번호: 123-456-7890</v-list-item-title>
              <v-list-item-title class="contact-item">이메일: example@example.com</v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </v-list>
      </v-card-text>
    </v-card>
  </div>
</template>

<script>
export default {
  data() {
    return {
      faqs: [
        {
          id: 1,
          question: "[교환/반품] 상품을 교환/반품하고 싶어요.",
          answer: "교환 및 반품은 미사용 상품에 한하여 가능하며,\n홈페이지를 통해 직접하실 수 있습니다.\n상품을 회수한 후 검수 단계에서 문제가 발견되면 고객님께 연락을 드릴 수 있습니다. 교환은 구매 상품과 동일한 상품으로만 가능합니다. 색상 및 사이즈 변경을 원하시면 반품 후 재구매를 해 주시기 바랍니다."
        },
        {
          id: 2,
          question: "질문 2",
          answer: "답변 2"
        },
        {
          id: 3,
          question: "질문 3",
          answer: "답변 3"
        }
      ]
    };
  }
};
</script>

<style scoped>
.customer-service {
  margin: 20px;
}

.title {
  font-size: 24px;
  font-weight: bold;
  margin-bottom: 10px;
}

.section-title {
  font-size: 18px;
  font-weight: bold;
  margin-bottom: 10px;
}

.faq-question {
  font-weight: bold;
}

.contact-description {
  margin-bottom: 10px;
}

.contact-item {
  margin-bottom: 5px;
}
</style>
