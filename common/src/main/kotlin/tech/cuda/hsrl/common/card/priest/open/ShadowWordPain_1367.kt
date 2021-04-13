package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowWordPain_1367 : Card() {
    override val id = 1367
    override val name = "暗言术：痛"
    override val description = "消灭一个攻击力小于或等于3的随从。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy1635
    override val background = "许多侍僧学徒都会施放：“暗言术：怒”，这个法术是它的进阶法术。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bf6c59a380a99c941d918d2f5e762d88a1c61d35f7582a44be5116e430c64c03.png"
}
