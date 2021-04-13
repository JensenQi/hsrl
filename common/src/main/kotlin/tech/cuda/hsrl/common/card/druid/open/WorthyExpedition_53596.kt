package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WorthyExpedition_53596 : Card() {
    override val id = 53596
    override val name = "不虚此行"
    override val description = "<b>发现</b>一张<b>抉择</b>牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "这不是我刚才停科多的地方。"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ea293abb8ca93f2e72da034ad9e5d07870b28c837a944f6e932b292add7d35f6.png"
}
