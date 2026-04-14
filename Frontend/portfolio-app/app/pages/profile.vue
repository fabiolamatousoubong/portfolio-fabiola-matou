<script setup>
const { data: profile, pending, error } = await useFetch('http://localhost:8080/api/profile')
</script>

<template>
  <div class="container simple-page">
    <div class="card simple-card">

      <h1>Profil</h1>

      <!-- Loading -->
      <p v-if="pending">Lädt...</p>
      <p v-else-if="error">Fehler beim Laden</p>

      <template v-else>

        <!-- Photo -->
        <div style="margin-bottom: 20px;">
          <img
            src="/1653910996563.jpg"
            alt="Profilbild"
            style="width: 150px; border-radius: 50%;"
          />
        </div>

        <!-- Description (fallback + backend) -->
        <p>
          {{ profile?.bio || 'Ich bin eine motivierte Softwareentwicklerin mit Schwerpunkt auf Webentwicklung, modernen Technologien und Softwarequalität. Ich habe Erfahrung in der Entwicklung von Webanwendungen sowie in der Arbeit an Forschungsprojekten.' }}
        </p>

        <p>
          Während meines Studiums und meiner beruflichen Tätigkeiten konnte ich meine
          Kenntnisse in JavaScript, TypeScript, Angular und Node.js vertiefen.
          Besonders interessiere ich mich für saubere Architektur, CI/CD und automatisierte Tests.
        </p>

        <!-- Contact -->
        <div style="margin-top: 20px;">
          <p>
            <strong>📍 Ort:</strong> 
            {{ profile?.city || 'Berlin' }}
          </p>

          <p>
            <strong>📧 Email:</strong> 
            {{ profile?.email || 'fabiolamatou@gmail.com' }}
          </p>

          <p>
            <strong>📞 Telefon:</strong> 
            {{ profile?.phone || '+49 178 8251276' }}
          </p>

          <p>
            <strong>🔗 LinkedIn:</strong>
            <a 
              :href="profile?.linkedin || 'https://www.linkedin.com/in/syntcha-fabiola-matou-soubong/'"
              target="_blank"
              style="color: #1f2f6b; font-weight: bold;"
            >
              Profil ansehen
            </a>
          </p>
        </div>

      </template>

    </div>
  </div>
</template>

<style scoped>
.simple-page { padding: 40px 0 56px; }

.simple-card { 
  padding: 28px; 
  text-align: center;
}

.simple-card h1 { 
  color: var(--primary); 
  margin-bottom: 20px;
}

.simple-card p { 
  color: var(--muted); 
  line-height: 1.6;
}
</style>