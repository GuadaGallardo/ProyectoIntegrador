import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
// Import ng-circle-progress
import { NgCircleProgressModule } from 'ng-circle-progress';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoAPComponent } from './components/logo-ap/logo-ap.component';
import { BannerComponent } from './components/banner/banner.component';
import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { HardSoftComponent } from './components/hard-soft/hard-soft.component';
import { ProyectoComponent } from './components/proyecto/proyecto.component';
import { FooterComponent } from './components/footer/footer.component';
import { HttpClientModule } from '@angular/common/http';
import { IniciarSesionComponent } from './components/iniciar-sesion/iniciar-sesion.component';
import { PortfolioComponent } from './components/portfolio/portfolio.component';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoAPComponent,
    BannerComponent,
    AcercaDeComponent,
    ExperienciaComponent,
    EducacionComponent,
    HardSoftComponent,
    ProyectoComponent,
    FooterComponent,
    IniciarSesionComponent,
    PortfolioComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule,
    AppRoutingModule,
     // Specify ng-circle-progress as an import
     NgCircleProgressModule.forRoot({
      // set defaults here
      radius:100,
      showImage:true,
      imageHeight:90,
      imageWidth:90,
      showUnits:false,
      showSubtitle:false,
      outerStrokeWidth:16,
      innerStrokeWidth:8,
      outerStrokeColor:"#78C000",
      innerStrokeColor:"#C7E596",
      animation:true,
      animationDuration:600,
    }),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
