export default defineNuxtConfig({
  app: {
    head: {
      title: 'Lebenslauf Fabiola'
    }
  },
  runtimeConfig: {
    public: {
      apiBase: process.env.NUXT_PUBLIC_API_BASE || 'http://localhost:8080'
    }
  }
})