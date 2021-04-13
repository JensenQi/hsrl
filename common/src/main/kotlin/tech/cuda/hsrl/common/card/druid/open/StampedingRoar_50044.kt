package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StampedingRoar_50044 : Card() {
    override val id = 50044
    override val name = "狂奔怒吼"
    override val description = "随机从你的手牌中召唤一个野兽，并使其获得<b>突袭</b>。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RastakhansRumble
    override val background = "古拉巴什竞技场对员工携宠物上班的要求极为宽松。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/87a8c0b8956fc765c8d846ca5c1a8ad12ef4ab8d497cf80c5177fff96194dfe1.png"
}
