package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Combustion_59540 : Card() {
    override val id = 59540
    override val name = "燃烧"
    override val description = "对一个随从造成 4点伤害，相邻的随从均会受到超过其生命值的伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "萨莉有三个朋友，都是白银之手新兵，并以任意次序站成一排。在施放这个法术后，她还剩几个朋友？（请在空白处作答。）"
    override val artist = "L. Lullabi & A. Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/57962b124bd086b69ed271b22eef829e10105d34448efc475311cc28343c6585.png"
}
