package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BladedGauntlet_43277 : Card() {
    override val id = 43277
    override val name = "铁刃护手"
    override val description = "攻击力等同于你的 护甲值。无法攻击英雄。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "警告：不要用来挖鼻孔。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8f1f3a2daab7840ee65c76609fbd8d6d386b1a4a365a9ba1869281268247db6c.png"
}
