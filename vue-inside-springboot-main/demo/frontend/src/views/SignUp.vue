<template>
  <v-container fluid class="registration-form mt-16">
    <v-row justify="center">
      <v-col cols="12" sm="8" md="6">
        <h2>회원가입</h2>
        <v-form @submit.prevent="registerUser">
          <v-row>
            <v-col cols="10">
              <v-text-field v-model="memberid" label="아이디" required></v-text-field>
            </v-col>
            <v-col cols="10">
              <v-text-field v-model="password" label="비밀번호" type="password" required></v-text-field>
            </v-col>
          </v-row>
          <v-row>
            <v-col cols="10">
              <v-text-field v-model="name" label="이름" required></v-text-field>
            </v-col>
            <v-col cols="10">
              <v-radio-group v-model="gender">
                <v-radio label="남성" value="male"></v-radio>
                <v-radio label="여성" value="female"></v-radio>
              </v-radio-group>
            </v-col>
          </v-row>
          <v-row>
            <v-col cols="10">
              <v-text-field v-model="phone" label="휴대폰" required></v-text-field>
            </v-col>
            <v-col cols="10">
              <v-text-field v-model="email" label="이메일" required></v-text-field>
            </v-col>
          </v-row>
          <v-row>
            <v-col cols="12">
              <v-checkbox v-for="agreement in agreements" :key="agreement.id" v-model="agreement.checked" :label="agreement.label" :rules="[v => !!v || '동의해주세요']"></v-checkbox>
            </v-col>
          </v-row>
          <v-row>
            <v-col cols="12">
              <v-checkbox v-model="allAgreements" @change="toggleAllAgreements" label="모두 확인하였으며 동의합니다"></v-checkbox>
            </v-col>
          </v-row>
          <v-row>
            <v-col cols="12">
              <v-btn type="submit" :disabled="!allAgreements" color="primary" @click="registerUser">회원가입</v-btn>
            </v-col>
          </v-row>
        </v-form>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>

export default {
  data() {
    return {
      memberid: '',
      password: '',
      name: '',
      phone: '',
      gender: '',
      email: '',
      
      agreements: [
        { id: 'ageAgreement', label: '[필수] 만 14세 이상입니다', checked: false, required: true },
        { id: 'shoppingAgreement', label: '[필수] Shopping 이용약관 동의', checked: false, required: true },
        { id: 'financialAgreement', label: '[필수] 전자금융거래 이용약관 동의', checked: false, required: true },
        { id: 'personalInfoCollection', label: '[필수] 개인정보 수집 및 이용 동의', checked: false, required: true },
        { id: 'thirdPartyProvision', label: '[필수] 개인정보 제3자 제공 동의', checked: false, required: true },
        { id: 'marketingAgreement', label: '[선택] 마케팅 목적의 개인정보 수집 및 이용 동의', checked: false, required: false },
        { id: 'advertisingAgreement', label: '[선택] 광고성 정보 수신 동의', checked: false, required: false },
        { id: 'emailAgreement', label: '[선택] 이메일 수신 동의', checked: false, required: false },
        { id: 'smsAgreement', label: '[선택] SMS, SNS 수신 동의', checked: false, required: false },
        { id: 'pushAgreement', label: '[선택] 앱 푸시 수신 동의', checked: false, required: false },

      ],
      allAgreements: false
    };
  },
  methods: {
    
    registerUser() {
      // Vue에서 Spring Boot로 데이터 전송
      
      const saveData = {
        memberid: this.memberid,
        password: this.password,
        name: this.name,
        phone: this.phone,
        gender: this.gender,
        email: this.email,
      };

      try {
        this.$axios.post("/signup", saveData, {
               headers: {
                 "Content-Type": `application/json`,
                  },
                  
                  })
                  .then((response) => {
                    console.log(response)
                    if (response.data.errorCode === 400) {
                      alert(response.data.errorMessage)

                      }
                      else{
                        alert("회원가입이 완료되었습니다. 로그인 화면으로 돌아갑니다")
                        this.$router.push({path: '/login'});
                      }
                      })
            .catch(error =>{
              console.log(error.response);

            });
      } catch (error) {
        console.error(error);
      }
        },
        linkToLogin(){
          this.$router.push({path:"/login"});
        },
      
  
     /* toggleAllAgreements() {
      this.agreements.forEach((agreement) => {
        agreement.checked = this.allAgreements;
      });
    },
    registerUser() {
      if (!this.agree) {
        alert('약관에 동의해주세요.');
        return;
      }
      // 회원가입 로직 수행
      */

     
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

