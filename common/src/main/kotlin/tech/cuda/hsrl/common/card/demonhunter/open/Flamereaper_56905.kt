package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Flamereaper_56905 : Card() {
    override val id = 56905
    override val name = "斩炎"
    override val description = "同时对其攻击目标相邻的随从 造成伤害。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "讲道理，它引燃的火比斩灭的还多。"
    override val artist = "Akkapoj T."
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/64f0a9871316201192da2b1f2b0d5626854188c9b2faf113ba2c4a79b8067fb3.png"
}
