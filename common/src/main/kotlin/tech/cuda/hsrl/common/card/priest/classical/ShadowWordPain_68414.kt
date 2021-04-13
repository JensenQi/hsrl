package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowWordPain_68414 : Card() {
    override val id = 68414
    override val name = "暗言术：痛"
    override val description = "消灭一个攻击力小于或等于3的随从。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "许多侍僧学徒都会施放：“暗言术：怒”，这个法术是它的进阶法术。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0003f26ef9357cab726c80130194cf97afeb4a6960c77488eaf7cb5d53bfe9ae.png"
}
