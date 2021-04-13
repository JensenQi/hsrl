package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GalakrondTheUnspeakable_57416 : Card() {
    override val id = 57416
    override val name = "讳言巨龙迦拉克隆"
    override val description = "<b>战吼：</b>随机消灭一个敌方随从。<i>（ ）</i>"
    override var cost: Int? = 7
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.DescentOfDragons
    override val background = "拉祖尔呼唤着迦拉克隆的名字，地底深渊的声音回响应和。迦拉克隆的双眼缓缓开启……随后其余的眼睛也一并睁开。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d8bb62ada8643bed516eef96a4a257b408333499a810fcecf14d44973a0cf010.png"
}
