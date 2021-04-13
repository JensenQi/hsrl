package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SteelBeetle_56262 : Card() {
    override val id = 56262
    override val name = "钢铁甲虫"
    override val description = "<b>战吼：</b>如果你的手牌中有法力值消耗大于或等于（5）点的法术牌，便获得5点护甲值。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "从大号昆虫的甲壳中提取而来——甲虫钢材，值得信赖。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/44475558a948180e3fa8ff8290420866f2253694ba5aafe888fbede9a5ef92f5.png"
}
