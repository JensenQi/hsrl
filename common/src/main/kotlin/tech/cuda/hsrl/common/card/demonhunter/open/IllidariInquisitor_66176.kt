package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IllidariInquisitor_66176 : Card() {
    override val id = 66176
    override val name = "伊利达雷审判官"
    override val description = "<b>突袭</b> 在你的英雄攻击一个敌人后，该随从也会攻击。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Core
    override val background = "摄人的恐惧，大大的眼睛，无情的效率，还有对英雄那近乎狂热的献身精神，这些都是他的武器。还有这件上好的棕色长袍。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/93a5b91c84f9ca306a258bfa5c12c0c3abe8bb14177a6dec1b534eb4422b3b68.png"
}
