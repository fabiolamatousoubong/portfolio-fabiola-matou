// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  app: {
    head: {
      title: 'Lebenslauf Fabiola',
      meta: [
        { name: 'description', content: 'Portfolio und Lebenslauf von Fabiola' }
      ],
      link: [
        { rel: 'icon', type: 'image/png', href: '/favicon.png' }
      ]
    }
  }
})