package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HealingTouch_68309 : Card() {
    override val id = 68309
    override val name = "治疗之触"
    override val description = "恢复 8点生命值。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "见效快，疗效好，无毒副作用。"
    override val artist = "Cyril Van Der Haegen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b2baccf0251cb98e38b4e9e686a70013be38ae8fc8c0c3de7b8339823eb004cd.png"
}
