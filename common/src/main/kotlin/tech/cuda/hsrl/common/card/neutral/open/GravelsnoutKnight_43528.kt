package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GravelsnoutKnight_43528 : Card() {
    override val id = 43528
    override val name = "砂齿骑兵"
    override val description = "<b>战吼：</b>为你的对手随机召唤一个法力值消耗为（1）的随从。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "无论道路通向何方，光辉将邀我前往！"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/65c822929ba4d2d170edbd06f83df25d586413362496dff1256f721e497d8f67.png"
}
