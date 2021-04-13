package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodWarriors_38848 : Card() {
    override val id = 38848
    override val name = "苦战傀儡"
    override val description = "复制所有受伤的友方随从，并将其置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Wotog
    override val background = "复制过程画面血腥，未成年人和心脏病患者禁止观看。"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/83e660704e842567ca2f5430736195a3b2a1b7ca8af61b4e521c1aca334208a0.png"
}
