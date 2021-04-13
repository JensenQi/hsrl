package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ChaosNova_69505 : Card() {
    override val id = 69505
    override val name = "混乱新星"
    override val description = "对所有随从造成 4点伤害。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Core
    override val background = "伤害输出伊利丹，散播混乱一力担。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5850aebefc26e8b708768015a0b49e485c5296712abf7944ee63448ffa221a44.png"
}
