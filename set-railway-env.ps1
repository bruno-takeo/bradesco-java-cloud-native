# Configura variáveis de ambiente do Railway
$env:PGHOST = "postgres.railway.internal"
$env:PGPORT = "5432"
$env:PGDATABASE = "railway"
$env:PGUSER = "postgres"
$env:PGPASSWORD = "piZrVvkiXvMFRWqyWZAxScOzAoouAovo"

Write-Host "✅ Variáveis de ambiente Railway carregadas com sucesso!"
Write-Host "🚀 Iniciando aplicação com perfil 'prd'..."

# Roda o projeto com perfil prd
Start-Process powershell -ArgumentList "-NoExit", "-Command", ".\gradlew bootRun --args='--spring.profiles.active=prd'"
