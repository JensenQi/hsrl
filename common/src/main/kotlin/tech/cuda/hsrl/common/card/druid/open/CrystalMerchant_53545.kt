package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrystalMerchant_53545 : Card() {
    override val id = 53545
    override val name = "水晶商人"
    override val description = "在你的回合结束时，如果你有未使用的法力水晶，抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "你的水晶从哪来，我不关心；我的水晶从哪来，你也别问。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/da7793035ab3870c9907bf76bf7649537c228940eb9518211bf68c609942e2b9.png"
}
