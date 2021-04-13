package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Deathwing_70093 : Card() {
    override val id = 70093
    override val name = "死亡之翼"
    override val description = "<b>战吼：</b> 消灭所有其他随从，并弃掉你的手牌。"
    override var cost: Int? = 10
    override var health: Int? = 12
    override var attack: Int? = 12
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "死亡之翼原本是高贵的巨龙奈萨里奥，他发疯之后制造了艾泽拉斯的大灾变，但最终被击败。子不教，父之过？"
    override val artist = "Bernie Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d1ec066bac85318865943891922f2478b8a2c253adc3f28b819ad43296a6315b.png"
}
