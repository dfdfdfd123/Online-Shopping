<template>
  <div>
    <!-- 상단 레이아웃 -->
    <div class="top-layout">
      <div class="login-signup" @click="goToPage('signup')">회원가입 |</div>
      <div class="login-signup" @click="goToPage('customer')">고객센터</div>
    </div>

    <div class="login-form">
      <h2>Login</h2>
      <form @submit="login">
        <div class="form-group">
          <label for="memberid">아이디</label>
          <input type="text" id="memberid" v-model="memberid" required>
        </div>
        <div class="form-group">
          <label for="password">비밀번호</label>
          <input type="password" id="password" v-model="password" required>
        </div>
        <button type="submit">로그인</button>
        <div class="button-group">
          <button type="button" class="secondary-button" @click="findUsername">아이디 찾기</button>
          <button type="button" class="secondary-button" @click="findPassword">비밀번호 찾기</button>
        </div>
      </form>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      memberid: '',
      password: '',
    };
  },
  methods: {

   goToPage(page) {
  if (page === 'signup') {
    this.$router.push({ name: 'SignUp' });
    
  }

  
},


async login(event) {
      event.preventDefault();

const loginData = {
  memberid: this.memberid,
  password: this.password,
};

try {
  const response = await this.$axios.post('/login', loginData, {
    headers: {
      'Content-Type': 'application/json',
    },
  });

  if (response.data.success) {
    alert('로그인 성공!');
    // 로그인 성공 시 처리할 작업 수행
  } else {
    alert('아이디 또는 비밀번호가 잘못되었습니다.');
  }
} catch (error) {
  console.error('로그인 요청 실패:', error);
  alert('로그인 요청에 실패했습니다.');
}
      
      
    },
    findUsername() 
    {
      
      this.$router.push({ name: 'findMember' });
     
    },
    findPassword() {
      
    },
  },
  mounted() {
    // 네비게이션 바에 있는 로그인 버튼 없애기
    const loginButton = document.querySelector('#navbar-login-button');
    if (loginButton) {
      loginButton.style.display = 'none';
    }
    
  },
};
</script>

<style scoped>

.top-layout {
  display: flex;
  justify-content: flex-end;
  margin-bottom: 20px;
}

.login-form {
  max-width: 300px;
  margin: 0 auto;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 4px;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}


.form-group {
  margin-bottom: 10px;
}

label {
  display: block;
  font-weight: bold;
}

input[type="text"],
input[type="password"] {
  width: 100%;
  padding: 5px;
  border: 1px solid #ccc;
  border-radius: 4px;
}

button {
  display: block;
  width: 100%;
  padding: 10px;
  background-color: #4caf50;
  color: white;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

.secondary-button {
  background-color: #4caf50;
  margin: 10px;
}

.button-group {
  margin-top: 10px;
  display: flex;
  justify-content: space-between;
}
</style>




