package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TendingTauren_48609 : Card() {
    override val id = 48609
    override val name = "牛头人园丁"
    override val description = "<b>抉择：</b> 使你的所有其他随从获得+1/+1；或者召唤两个2/2的树人。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.BoomsdayProject
    override val background = "牛头人的草药学种族天赋终于派上了用场。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b410776264e3e51b259cb91a8ebab5dedceac169560d8402f3bd72b89be86b21.png"
}
