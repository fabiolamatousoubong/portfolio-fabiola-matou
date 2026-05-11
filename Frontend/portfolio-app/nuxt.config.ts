export default defineNuxtConfig({
  app: {
    head: {
      title: 'Lebenslauf Fabiola'
    }
  },
  runtimeConfig: {
    public: {
     apiBase: 'https://portfolio-backend-7r3c.onrender.com'
    }
  }
})