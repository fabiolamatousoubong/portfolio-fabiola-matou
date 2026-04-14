<template>
  <header class="topnav">
    <div class="container topnav-inner">
      <NuxtLink to="/" class="brand">Fabiola</NuxtLink>
      <nav class="nav-links">
        <NuxtLink to="/">Startseite</NuxtLink>
        <NuxtLink to="/cv">Lebenslauf</NuxtLink>
        <NuxtLink to="/documents">Zeugnisse</NuxtLink>
        <NuxtLink to="/profile">Profil</NuxtLink>
      </nav>
    </div>
  </header>
</template>

<style scoped>
.topnav {
  position: sticky;
  top: 0;
  z-index: 10;
  background: rgba(255,255,255,0.92);
  backdrop-filter: blur(10px);
  border-bottom: 1px solid var(--line);
}
.topnav-inner {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 18px 0;
}
.brand {
  font-size: 1.4rem;
  font-weight: 800;
  color: var(--primary);
}
.nav-links {
  display: flex;
  gap: 28px;
  font-weight: 600;
}
.nav-links a {
  color: #394150;
}
.nav-links a.router-link-exact-active {
  color: var(--primary);
}
@media (max-width: 720px) {
  .topnav-inner { flex-direction: column; gap: 14px; }
  .nav-links { gap: 16px; flex-wrap: wrap; justify-content: center; }
}
</style>