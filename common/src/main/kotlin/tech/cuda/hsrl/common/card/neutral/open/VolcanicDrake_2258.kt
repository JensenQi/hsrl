package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VolcanicDrake_2258 : Card() {
    override val id = 2258
    override val name = "火山幼龙"
    override val description = "在本回合中每有一个随从死亡，该牌的 法力值消耗就减少（1）点。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Brm
    override val background = "火山幼龙喷吐的是熔岩而不是火焰。瑟银哨塔的抗酸剂小贩靠这个赚了不少钱。"
    override val artist = "Lucas Graciano"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3fd8e3e725b9e790a7b417a6c0ea2af6c77d3712aa31c0223be14d3faec59982.png"
}
