package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DruidOfTheSwarm_42651 : Card() {
    override val id = 42651
    override val name = "虫群德鲁伊"
    override val description = "<b>抉择：</b>将该随从变形成为1/2并具有<b>剧毒</b>；或者将该随从变形成为1/5并具有<b>嘲讽</b>。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Kotf
    override val background = "德鲁伊从不安的睡梦中醒来，发现自己变形成了一只巨大的蜘蛛。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ac4fd520697970edb00c6fd9f21b57aa1dd723f9f6f25e8bdec1daf4d3aca0c3.png"
}
