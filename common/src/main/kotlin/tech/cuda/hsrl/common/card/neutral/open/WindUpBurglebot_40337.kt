package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WindUpBurglebot_40337 : Card() {
    override val id = 40337
    override val name = "发条强盗机器人"
    override val description = "每当该随从攻击另一个随从并存活时，抽一张牌。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "别怪我，要怪就怪给我上发条的人…"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ddfc1af93de8eab3e7787c2904df4bee0915a2ccb5eb6f8028947294af93dfc4.png"
}
