package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InjuredTolvir_53970 : Card() {
    override val id = 53970
    override val name = "受伤的托维尔人"
    override val description = "<b>嘲讽，战吼：</b>对该随从造成3点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "贼来十步乃呼我！"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6895cba1618045dffac48c5bab8e2ca88da7c613606c7e6fd711688cb8a93645.png"
}
