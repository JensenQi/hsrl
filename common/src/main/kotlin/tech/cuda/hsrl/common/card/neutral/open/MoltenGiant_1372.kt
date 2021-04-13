package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MoltenGiant_1372 : Card() {
    override val id = 1372
    override val name = "熔核巨人"
    override val description = "你的英雄 每受到1点伤害，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 20
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy4
    override val background = "无数初次来到熔火之心的冒险者倒在他滚烫的脚掌之下。"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2f4233afd0bf7e19d88121fae634c02e7d2d49a928224f3e02eff73125d770e8.png"
}
