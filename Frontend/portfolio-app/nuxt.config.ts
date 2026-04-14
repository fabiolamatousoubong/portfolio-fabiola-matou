export default defineNuxtConfig({
  app: {
    head: {
      title: 'Lebenslauf Fabiola'
    }
  },
  runtimeConfig: {
    public: {
      apiBase: 'https://portfolio-backend-xxxx.onrender.com'
    }
  }
})