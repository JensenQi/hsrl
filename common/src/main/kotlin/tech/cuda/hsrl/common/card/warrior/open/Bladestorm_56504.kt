package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Bladestorm_56504 : Card() {
    override val id = 56504
    override val name = "剑刃风暴"
    override val description = "对所有随从造成 1点伤害。重复此效果，直到某个随从 死亡。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.AshesOfOutland
    override val background = "亲爱的随从们： 嚓，嚓，嚓，嚓，嚓。 敬礼， 剑刃风暴"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b4421a0ffabab73487a4477e77741918d23a8cc15e0fd181b984f8f411b1c848.png"
}
