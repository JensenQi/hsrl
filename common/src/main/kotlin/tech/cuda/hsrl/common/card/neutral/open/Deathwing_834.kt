package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Deathwing_834 : Card() {
    override val id = 834
    override val name = "死亡之翼"
    override val description = "<b>战吼：</b> 消灭所有其他随从，并弃掉你的手牌。"
    override var cost: Int? = 10
    override var health: Int? = 12
    override var attack: Int? = 12
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "死亡之翼原本是高贵的巨龙奈萨里奥，他发疯之后制造了艾泽拉斯的大灾变，但最终被击败。子不教，父之过？"
    override val artist = "Bernie Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3e3c3f410051ee89ac7d57cdab40cf4ce417aa694f3820c73ba6e81ddffb0ba6.png"
}
