package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DiligentNotetaker_58977 : Card() {
    override val id = 58977
    override val name = "笔记能手"
    override val description = "<b>法术迸发：</b>将法术牌移回你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "你永远想不到考试会考哪张牌。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7a6d22e3ec2a79116a78d2e0920b92e096cd0dd9ec0a82ebd07f352e6f44cb3d.png"
}
