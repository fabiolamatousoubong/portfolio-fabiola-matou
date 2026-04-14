<template>
  <div class="container cv-page">
    <div class="cv-header card">
      <div>
        <p class="small-label">Curriculum Vitae</p>
        <h1>Mein beruflicher Werdegang</h1>
        <p>
          Eine klare Darstellung meines Profils, meiner Erfahrungen, meiner Ausbildung,
          meiner Kompetenzen und meiner Sprachen.
        </p>
      </div>
      <a href="/Lebenslauffabiola.pdf" download class="btn btn-primary">PDF herunterladen</a>
    </div>

    <div class="cv-grid">
      <section class="card cv-section">
        <h2>👩‍💻 Profil</h2>
        <p>
          Entwicklerin mit Leidenschaft für die Erstellung moderner Webanwendungen, Softwarequalität,
          automatisierte Tests und die Strukturierung technischer Projekte.
        </p>
      </section>

      <section class="card cv-section">
        <h2>💼 Erfahrung</h2>
        <div class="item">
          <strong>Fraunhofer Institut — Werkstudentin</strong>
          <span>Seit 2023 · Berlin</span>
          <p>Arbeit an Projekten im Bereich digitaler Zwillinge mit Protégé und GanttProject.</p>
        </div>
        <div class="item">
          <strong>EDAG — Werkstudentin & Praktikantin</strong>
          <span>2022 – 2023 · Fulda</span>
          <p>Webentwicklung mit Angular, Node.js, NestJS, JavaScript und TypeScript.</p>
        </div>
        <div class="item">
          <strong>Burger King — Servicekraft</strong>
          <span>2019 – 2022 · Fulda</span>
          <p>Entwicklung von Kommunikationsfähigkeiten, Kundenservice und Organisation.</p>
        </div>
      </section>

      <section class="card cv-section">
        <h2>🎓 Ausbildung</h2>
        <div class="item">
          <strong>Master of Science — Angewandte Informatik</strong>
          <span>Seit 2023 · Hochschule Berlin</span>
        </div>
        <div class="item">
          <strong>Bachelor of Science — Angewandte Informatik</strong>
          <span>2019 – 2023 · Hochschule Fulda</span>
          <p>Bachelorarbeit zur Verbesserung der Softwarequalität durch CI/CD und automatisierte Tests.</p>
        </div>
      </section>

      <section class="card cv-section">
        <h2>🛠️ Kompetenzen</h2>
        <div class="tags">
          <span>JavaScript</span>
          <span>TypeScript</span>
          <span>Angular</span>
          <span>Node.js</span>
          <span>NestJS</span>
          <span>Docker</span>
          <span>GitHub</span>
          <span>Jira</span>
          <span>Confluence</span>
          <span>CI/CD</span>
          <span>Automatisierte Tests</span>
          <span>Protégé</span>
        </div>
      </section>

      <section class="card cv-section">
        <h2>🌍 Sprachen</h2>
        <div class="language-row"><span>Deutsch</span><strong>C2</strong></div>
        <div class="language-row"><span>Französisch</span><strong>Fließend</strong></div>
        <div class="language-row"><span>English</span><strong>B1</strong></div>
      </section>
    </div>
  </div>
</template>

<style scoped>
.cv-page {
  padding-top: 40px;
  padding-bottom: 56px;
}
.cv-header {
  padding: 28px 30px;
  display: flex;
  justify-content: space-between;
  gap: 18px;
  align-items: center;
  margin-bottom: 24px;
}
.cv-header h1 {
  margin: 8px 0 10px;
  color: var(--primary);
}
.cv-header p {
  margin: 0;
  color: var(--muted);
  line-height: 1.7;
  max-width: 680px;
}
.cv-grid {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  gap: 22px;
}
.cv-section {
  padding: 26px;
}
.cv-section h2 {
  margin: 0 0 18px;
  color: var(--primary);
}
.item {
  margin-bottom: 16px;
  display: grid;
  gap: 6px;
}
.item:last-child { margin-bottom: 0; }
.item span, .item p { color: var(--muted); }
.item p { margin: 0; line-height: 1.7; }
.tags {
  display: flex;
  flex-wrap: wrap;
  gap: 10px;
}
.tags span {
  background: #eef1f7;
  color: var(--primary);
  padding: 10px 14px;
  border-radius: 999px;
  font-weight: 700;
  font-size: 0.92rem;
}
.language-row {
  display: flex;
  justify-content: space-between;
  padding: 12px 0;
  border-bottom: 1px solid var(--line);
}
.language-row:last-child { border-bottom: 0; }
@media (max-width: 920px) {
  .cv-grid { grid-template-columns: 1fr; }
  .cv-header { flex-direction: column; align-items: flex-start; }
}
</style>

