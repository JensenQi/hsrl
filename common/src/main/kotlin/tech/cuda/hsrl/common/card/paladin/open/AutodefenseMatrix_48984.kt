package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AutodefenseMatrix_48984 : Card() {
    override val id = 48984
    override val name = "自动防御矩阵"
    override val description = "<b>奥秘：</b>当你的随从受到攻击时，使其获得<b>圣盾</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.BoomsdayProject
    override val background = "我们都叫它泡泡机。"
    override val artist = "Zero"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/02eb1b8230b22e8188f989ca58eb247525ec8b6a3b2d7bdaf886530ba35ddde0.png"
}
