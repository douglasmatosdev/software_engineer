import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TarefaPanelComponent } from './tarefa-panel.component';

describe('TarefaPanelComponent', () => {
  let component: TarefaPanelComponent;
  let fixture: ComponentFixture<TarefaPanelComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TarefaPanelComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TarefaPanelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
