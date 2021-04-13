package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ForestGuide_48286 : Card() {
    override val id = 48286
    override val name = "森林向导"
    override val description = "在你的回合结束时，双方玩家各抽 一张牌。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.TheWitchwood
    override val background = "“快签了这份弃权声明，我们就好上路了。”"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e5aa09445983aa4a78ad3bed02dc26239ca18282d44ee8b13ada2f1930f6b7a0.png"
}
