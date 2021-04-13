package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Vanish_68548 : Card() {
    override val id = 68548
    override val name = "消失"
    override val description = "将所有随从移回其拥有者的 手牌。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = ""
    override val artist = "Sean O’Daniels"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/22884cfbb99fe1fb3f3555988ab68e33f3558b7de8aa9a0619fef76d59db386f.png"
}
