package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VelensChosen_1935 : Card() {
    override val id = 1935
    override val name = "维伦的恩泽"
    override val description = "使一个随从获得+2/+4和<b>法术伤害+1</b>。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Gvg
    override val background = "维伦时常会寄给年轻的德莱尼女祭司一些可爱的小卡片，并写上一些寄语，比如，“你选择了圣光，我选择了你。”"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/507f329da5f47a60244ff052a7b92fd978d6c0f4068a0d14e5c35d5a8a9765bb.png"
}
