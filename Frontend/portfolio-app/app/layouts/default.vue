<template>
  <div class="site-shell">
    <TopNav />
    <main>
      <slot />
    </main>
  </div>
</template>

<script setup>
import TopNav from '~/components/TopNav.vue'
</script>

<style>
:root {
  --bg: #f4f5f7;
  --card: #ffffff;
  --primary: #1f2f6b;
  --primary-soft: #2c3f86;
  --text: #1e2430;
  --muted: #667085;
  --line: #e7e9ee;
  --shadow: 0 18px 50px rgba(19, 28, 58, 0.12);
}

* { box-sizing: border-box; }
html, body, #__nuxt { margin: 0; padding: 0; min-height: 100%; }
body {
  font-family: Inter, Arial, sans-serif;
  background: var(--bg);
  color: var(--text);
}
a { color: inherit; text-decoration: none; }
img { max-width: 100%; display: block; }
.container {
  width: min(1120px, calc(100% - 32px));
  margin: 0 auto;
}
.section-title {
  font-size: 1.7rem;
  margin: 0 0 18px;
  color: var(--primary);
}
.card {
  background: var(--card);
  border-radius: 22px;
  box-shadow: var(--shadow);
}
</style>
