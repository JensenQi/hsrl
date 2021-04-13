package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RazormaneBattleguard_63033 : Card() {
    override val id = 63033
    override val name = "钢鬃卫兵"
    override val description = "你每个回合使用的 第一张<b>嘲讽</b>随从牌的法力值消耗减少（2）点。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "有刺者，事竟成。"
    override val artist = "Daniil Kudriavtsez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6602254cf19e09dec62b88a1ea438b2fd9608ce1e734dd5c08e14bfe6242917e.png"
}
