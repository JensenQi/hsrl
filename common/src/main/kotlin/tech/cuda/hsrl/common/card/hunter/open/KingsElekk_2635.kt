package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KingsElekk_2635 : Card() {
    override val id = 2635
    override val name = "皇家雷象"
    override val description = "<b>战吼：</b>揭示双方牌库里的一张随从牌。如果你的牌法力值消耗较大，抽这张牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Tgt
    override val background = "骑着雷象去参加枪术比赛真是棒极了！"
    override val artist = "James Zhang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/27c9d82f9768c6654395e902094c8a39dc3c71c5aec23a4082230417fa232656.png"
}
