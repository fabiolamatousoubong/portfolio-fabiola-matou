<template>
  <div>
    <section class="hero">
      <div class="hero-overlay"></div>
      <div class="container hero-content">
        <div class="profile-card card">
          <div class="profile-photo-wrap">
            <img src="/1653910996563.jpg" alt="Photo profil" class="profile-photo" />
          </div>
          <div class="profile-info">
            <p class="eyebrow">Softwareentwicklerin</p>
            <h1>Matou Soubong Syntcha Fabiola</h1>
            <p class="intro">
               Ich bin eine motivierte Softwareentwicklerin mit Fokus auf Webentwicklung,
    moderne Technologien und Softwarequalität.
            </p>
            <div class="contact-list">
              <div><strong>Telefon :</strong> +49 178 8251276</div>
              <div><strong>Email :</strong> fabiolamatou@gmail.com</div>
              <div><strong>Ort :</strong> Berlin</div>
              <div>
  <strong>LinkedIn :</strong>
  <a href="https://www.linkedin.com/in/syntcha-fabiola-matou-soubong/"
     target="_blank"
     style="color: blue;">
     Mein Profil ansehen
  </a>
</div>
            </div>
            <div class="hero-actions">
              <NuxtLink to="/cv" class="btn btn-primary">Mein Lebenslauf ansehen</NuxtLink>
              <NuxtLink to="/documents" class="btn btn-secondary">Meine Dokumente ansehen</NuxtLink>
            </div>
          </div>
        </div>
      </div>
    </section>

<section class="welcome-section container">
  <div class="welcome-grid">
    <div class="welcome-text">
      <p class="small-label">PERSÖNLICHE VORSTELLUNG</p>
      <h2>Hallo, ich bin Fabiola</h2>
      <p>
        Ich entwickle moderne Webanwendungen und verbinde dabei Technik, Softwarequalität
        und Projektorganisation. Dieses Portfolio präsentiert meinen Werdegang, meinen Lebenslauf,
        meine Fähigkeiten und meine Dokumente.
      </p>
    </div>

    <div class="stats card">
      <div>
        <strong>2023 – heute</strong>
        <span>Master in Angewandter Informatik</span>
      </div>

      <div>
        <strong>Fraunhofer Institut</strong>
        <span>Werkstudentin in Forschung und Entwicklung</span>
      </div>

      <div>
        <strong>CI/CD & Web</strong>
        <span>Angular, Node.js, TypeScript, Docker, GitHub</span>
      </div>
    </div>
  </div>
</section>
  </div>
</template>

<style scoped>
.hero {
  position: relative;
  min-height: 540px;
  background:
    linear-gradient(rgba(25, 39, 87, 0.78), rgba(25, 39, 87, 0.78)),
    url('https://images.unsplash.com/photo-1486406146926-c627a92ad1ab?auto=format&fit=crop&w=1400&q=80') center/cover no-repeat;
  display: flex;
  align-items: center;
}
.hero-content {
  position: relative;
  z-index: 1;
  padding: 54px 0;
}
.profile-card {
  display: grid;
  grid-template-columns: 360px 1fr;
  overflow: hidden;
}
.profile-photo-wrap {
  min-height: 460px;
  background: #dfe3ea;
}
.profile-photo {
  width: 100%;
  height: 100%;
  object-fit: cover;
}
.profile-info {
  padding: 42px 42px 36px;
}
.eyebrow {
  margin: 0 0 8px;
  color: var(--primary-soft);
  font-weight: 700;
  text-transform: uppercase;
  letter-spacing: 0.08em;
  font-size: 0.82rem;
}
.profile-info h1 {
  margin: 0 0 12px;
  font-size: 2.3rem;
  line-height: 1.1;
  color: var(--primary);
}
.intro {
  color: var(--muted);
  line-height: 1.75;
  margin-bottom: 22px;
}
.contact-list {
  display: grid;
  gap: 10px;
  font-size: 0.97rem;
  margin-bottom: 26px;
}
.hero-actions {
  display: flex;
  gap: 14px;
  flex-wrap: wrap;
}
.btn {
  padding: 14px 22px;
  border-radius: 999px;
  font-weight: 700;
}
.btn-primary {
  background: var(--primary);
  color: white;
}
.btn-secondary {
  background: #eef1f7;
  color: var(--primary);
}
.welcome-section {
  margin-top: 54px;
  margin-bottom: 54px;
}
.welcome-grid {
  display: grid;
  grid-template-columns: 1.2fr 0.8fr;
  gap: 28px;
  align-items: start;
}
.welcome-text {
  padding: 10px 4px;
}
.small-label {
  color: var(--primary-soft);
  font-weight: 700;
  text-transform: uppercase;
  letter-spacing: 0.08em;
  font-size: 0.8rem;
}
.welcome-text h2 {
  margin: 10px 0 14px;
  font-size: 2rem;
}
.welcome-text p {
  color: var(--muted);
  line-height: 1.8;
}
.stats {
  padding: 26px;
  display: grid;
  gap: 18px;
}
.stats div {
  display: grid;
  gap: 6px;
  padding-bottom: 14px;
  border-bottom: 1px solid var(--line);
}
.stats div:last-child { border-bottom: 0; padding-bottom: 0; }
.stats strong { color: var(--primary); }
.stats span { color: var(--muted); }
@media (max-width: 920px) {
  .profile-card,
  .welcome-grid { grid-template-columns: 1fr; }
  .profile-photo-wrap { min-height: 320px; }
}
</style>