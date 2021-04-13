package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpitefulSummoner_46551 : Card() {
    override val id = 46551
    override val name = "恶毒的召唤师"
    override val description = "<b>战吼：</b>揭示你牌库中的一张法术牌。随机召唤一个法力值消耗与其相同的随从。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "最好祈祷她不要召唤出末日预言者。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1e6034885d27ce83cdec3b8eb770e4b57c215e044a0c90ae2654d60033efea49.png"
}
