package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HealingTouch_773 : Card() {
    override val id = 773
    override val name = "治疗之触"
    override val description = "恢复 8点生命值。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy1635
    override val background = "见效快，疗效好，无毒副作用。"
    override val artist = "Cyril Van Der Haegen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aec31d198aa3b029765935532b19978a0373d496e5e61a9209bfc830d1354b88.png"
}
